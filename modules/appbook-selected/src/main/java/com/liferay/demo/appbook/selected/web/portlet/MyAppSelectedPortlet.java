package com.liferay.demo.appbook.selected.web.portlet;

import com.liferay.demo.appbook.selected.web.constants.MyAppSelectedPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author lcarbone
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.appbook",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Appbook Selected",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MyAppSelectedPortletKeys.APPBOOKSELECTED,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"com.liferay.fragment.entry.processor.portlet.alias=appbook-selected"
	},
	service = Portlet.class
)
public class MyAppSelectedPortlet extends MVCPortlet {
}