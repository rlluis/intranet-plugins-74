package com.liferay.appbook.web.portlet.action;

import com.liferay.appbook.web.constants.AppbookWebV2PortletKeys;
import com.liferay.appbook.web.constants.MVCCommandNames;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.training.appbook.model.Assignment;
import com.liferay.training.appbook.service.AssignmentService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
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
        "mvc.command.name=" + MVCCommandNames.SELECT_APP
    }, 
    service = MVCActionCommand.class
)
public class SelectAppMVCActionCommand extends BaseMVCActionCommand {
	
	@Reference
	private AssignmentService _assignmentService;

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		String[] values = ParamUtil.getParameterValues(actionRequest, "values", new String[0]);
    	
    	ServiceContext serviceContext = ServiceContextFactory.getInstance(
                Assignment.class.getName(), actionRequest);
    	ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
    	long userId = themeDisplay.getUserId();
    	 
    	List<Assignment> assignments = _assignmentService.getAssignmentsByUserId(userId);
    	for (Assignment assignment : assignments) {
    		System.out.println(assignment.getAssignmentId());
    		_assignmentService.deleteAssignment(assignment.getAssignmentId());
		}
    	
    	for (String articleId : values) {
    		_assignmentService.addAssignment(themeDisplay.getScopeGroupId(), Long.parseLong(articleId), serviceContext);
		}
	}
}