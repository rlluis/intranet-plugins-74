package com.liferay.demo.appbook.selected.config;

import com.liferay.configuration.admin.category.ConfigurationCategory;

import org.osgi.service.component.annotations.Component;

@Component(service = ConfigurationCategory.class)
public class AppbookCategoryConfiguration
	implements ConfigurationCategory {

	@Override
	public String getCategoryIcon() {
		return _CATEGORY_ICON;
	}

	@Override
	public String getCategoryKey() {
		return _CATEGORY_KEY;
	}

	@Override
	public String getCategorySection() {
		return _CATEGORY_SECTION;
	}

	private static final String _CATEGORY_ICON = "cog";

	private static final String _CATEGORY_KEY = "appbook-category";

	private static final String _CATEGORY_SECTION = "appbook-section";

}