<#assign
	show_footer = getterUtil.getBoolean(themeDisplay.getThemeSetting("show-footer"))
	show_header = getterUtil.getBoolean(themeDisplay.getThemeSetting("show-header"))
	show_header_search = getterUtil.getBoolean(themeDisplay.getThemeSetting("show-header-search"))
	wrap_widget_page_content = getterUtil.getBoolean(themeDisplay.getThemeSetting("wrap-widget-page-content"))
	site_name = getterUtil.getString(themeDisplay.getThemeSetting("site-name"))
	show_control_menu = getterUtil.getBoolean(sessionClicks.get(request, "SHOW_CONTROL_MENU", "true"))
/>

<#if wrap_widget_page_content && ((layout.isTypeContent() && themeDisplay.isStateMaximized()) || (layout.getType() == "portlet"))>
	<#assign portal_content_css_class = "container" />
<#else>
	<#assign portal_content_css_class = "" />
</#if>