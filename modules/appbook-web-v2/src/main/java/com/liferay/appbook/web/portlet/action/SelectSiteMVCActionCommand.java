package com.liferay.appbook.web.portlet.action;

import com.liferay.appbook.web.constants.AppbookWebV2PortletKeys;
import com.liferay.appbook.web.constants.MVCCommandNames;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import org.osgi.service.component.annotations.Component;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

/**
 * MVC command for showing the assignments list.
 * 
 * @author liferay
 */
@Component(
    immediate = true, 
    property = {
        "javax.portlet.name=" + AppbookWebV2PortletKeys.APPBOOKWEBV2,
        "mvc.command.name=" + MVCCommandNames.SELECT_SITE
    }, 
    service = MVCActionCommand.class
)
public class SelectSiteMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		String siteId = ParamUtil.getString(actionRequest, "siteSelector");

		actionRequest.setAttribute("siteId", siteId);
	}

}