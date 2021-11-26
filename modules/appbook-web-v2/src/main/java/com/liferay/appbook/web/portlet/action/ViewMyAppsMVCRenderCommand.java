package com.liferay.appbook.web.portlet.action;

import com.liferay.appbook.web.config.AppbookConfiguration;
import com.liferay.appbook.web.constants.AppbookWebV2PortletKeys;
import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.service.JournalArticleLocalServiceUtil;
import com.liferay.journal.service.JournalArticleService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.module.configuration.ConfigurationException;
import com.liferay.portal.kernel.module.configuration.ConfigurationProvider;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.KeyValuePair;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.xml.Document;
import com.liferay.portal.kernel.xml.DocumentException;
import com.liferay.portal.kernel.xml.Element;
import com.liferay.portal.kernel.xml.SAXReaderUtil;
import com.liferay.training.appbook.model.Assignment;
import com.liferay.training.appbook.service.AssignmentService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * MVC command for showing the assignments list.
 *
 * @author liferay
 */
@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + AppbookWebV2PortletKeys.APPBOOKWEBV2,
				"mvc.command.name=/"
		},
		service = MVCRenderCommand.class
)
public class ViewMyAppsMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(
			RenderRequest renderRequest, RenderResponse renderResponse)
			throws PortletException {

		// Add assignment list related attributes.

		addMyAppListAttributes(renderRequest);

		return "/view.jsp";
	}

	/**
	 * Adds assigment list related attributes to the request.
	 *
	 * @param renderRequest
	 */
	private void addMyAppListAttributes(RenderRequest renderRequest) {

		ThemeDisplay themeDisplay =
				(ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

		String siteId = (String) renderRequest.getAttribute("siteId");

		long groupId = siteId == null ? themeDisplay.getSiteGroupId() : Long.parseLong(siteId);
		//long scopeGroupId = themeDisplay.getScopeGroupId();
		List<KeyValuePair> leftBox = new ArrayList<KeyValuePair>();
		List<KeyValuePair> rightBox = new ArrayList<KeyValuePair>();
		List<KeyValuePair> sitesList = new ArrayList<KeyValuePair>();

		long userId = themeDisplay.getUserId();
		User user = themeDisplay.getUser();
		List<Group> sites;
		try {
			sites = user.getMySiteGroups();
			for(Group site: sites){
				sitesList.add(new KeyValuePair(String.valueOf(site.getGroupId()), GroupLocalServiceUtil.getGroup(site.getGroupId()).getDescriptiveName()));
			}
		} catch (PortalException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		// Get Selected app from MyAppLocalService
		List<Assignment> assignments = new ArrayList<Assignment>();
		try {
			assignments = assignmentService.getAssignmentsByUserId(userId);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		String ddStructureKey = "";
		AppbookConfiguration appbookConfiguration;
		try {
			appbookConfiguration = configurationProvider.getCompanyConfiguration(AppbookConfiguration.class,themeDisplay.getCompanyId());
			ddStructureKey = appbookConfiguration.structureId().toString();
		} catch (ConfigurationException e) {
			System.out.println("No config");
		}

		OrderByComparator<JournalArticle> comparator = OrderByComparatorFactoryUtil.create("JournalArticle", "displayDate", "desc");
		List<JournalArticle> journalArticles = journalArticleLocalService.getArticlesByStructureId(groupId, ddStructureKey, QueryUtil.ALL_POS, QueryUtil.ALL_POS, comparator);

		//PermissionChecker permissionChecker = themeDisplay.getPermissionChecker();

		for (JournalArticle journalArticle : journalArticles) {

			//System.out.println("Has permission: " + permissionChecker.hasPermission(scopeGroupId, "com.liferay.portlet.journal.model.JournalArticle", journalArticle.getPrimaryKey(), ActionKeys.VIEW));

			try {
				if(JournalArticleLocalServiceUtil.isLatestVersion(groupId, journalArticle.getArticleId(), journalArticle.getVersion())){
					String content = journalArticle.getContentByLocale(themeDisplay.getLocale().toString());
					Document document;
					document = SAXReaderUtil.read(content);
					Element rootElement = document.getRootElement();
					for (Element e : rootElement.elements()) {
						if (e.getName().equals("dynamic-element") && e.attributeValue("name").equals("Title")) {
							String value = e.element("dynamic-content").getTextTrim();
							boolean appSelected = assignments.stream().anyMatch(c -> c.getArticleId() == Long.parseLong(journalArticle.getArticleId()));
							if(appSelected) {
								rightBox.add(new KeyValuePair(journalArticle.getArticleId(), value));
							} else {
								leftBox.add(new KeyValuePair(journalArticle.getArticleId(), value));
							}

						}
					}
				}
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

		renderRequest.setAttribute("currentSiteId", groupId);
		renderRequest.setAttribute("leftBox", leftBox);
		renderRequest.setAttribute("rightBox", rightBox);
		renderRequest.setAttribute("sites", sitesList);
	}

	@Reference
	protected AssignmentService assignmentService;

	@Reference
	private JournalArticleService journalArticleLocalService;

	private ConfigurationProvider configurationProvider;

	@Reference(unbind = "-")
	protected void setConfigurationProvider(ConfigurationProvider configurationProvider) {
		this.configurationProvider = configurationProvider;
	}

}