package com.liferay.demo.appbook.selected.config;

import com.liferay.portal.kernel.settings.definition.ConfigurationBeanDeclaration;

import org.osgi.service.component.annotations.Component;

@Component(
        immediate = true, 
        service = ConfigurationBeanDeclaration.class)
 
public class AppbookConfigurationBeanDeclaration implements ConfigurationBeanDeclaration {
 
    @Override
    public Class<?> getConfigurationBeanClass() {
        return AppbookSelectedConfiguration.class;
    }
}
