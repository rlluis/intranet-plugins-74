package com.liferay.demo.appbook.selected.config;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

import aQute.bnd.annotation.metatype.Meta;

@ExtendedObjectClassDefinition(category = "appbook-category", scope = ExtendedObjectClassDefinition.Scope.GROUP)
 
@Meta.OCD(id = "com.liferay.demo.appbook.selected.config.AppbookSelectedConfiguration", localization = "content/Language", name = "appbook-selected")
 
public interface AppbookSelectedConfiguration {
 
    @Meta.AD(deflt = "", 
            name = "structureId",
            required = false)
 
    public String structureId();
    
    @Meta.AD(deflt = "", 
            name = "contentSetId",
            required = false)
 
    public String contentSetId();
}