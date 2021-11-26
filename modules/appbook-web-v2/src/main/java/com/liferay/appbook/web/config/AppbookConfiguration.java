package com.liferay.appbook.web.config;

import aQute.bnd.annotation.metatype.Meta;
import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

@ExtendedObjectClassDefinition(category = "appbook-category", scope = ExtendedObjectClassDefinition.Scope.GROUP)
 
@Meta.OCD(id = "com.liferay.appbook.web.config.AppbookConfiguration", localization = "content/Language", name = "app-book-configuration")
 
public interface AppbookConfiguration {
 
    @Meta.AD(deflt = "", 
            name = "structureId",
            required = false)
 
    public String structureId();
}