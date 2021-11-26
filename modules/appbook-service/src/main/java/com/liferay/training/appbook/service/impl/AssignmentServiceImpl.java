/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.appbook.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.training.appbook.model.Assignment;
import com.liferay.training.appbook.service.base.AssignmentServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * The implementation of the assignment remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.training.appbook.service.AssignmentService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssignmentServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=appbook",
		"json.web.service.context.path=Assignment"
	},
	service = AopService.class
)
public class AssignmentServiceImpl extends AssignmentServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.liferay.training.appbook.service.AssignmentServiceUtil</code> to access the assignment remote service.
	 */
	public Assignment addAssignment(
			long groupId, Long articleId, ServiceContext serviceContext)
			throws PortalException {

		// Check permissions.

        /*_portletResourcePermission.check(
            getPermissionChecker(), serviceContext.getScopeGroupId(),
            ActionKeys.ADD_ENTRY);*/

		return assignmentLocalService.addAssignment(groupId, articleId, serviceContext);
	}

	public Assignment deleteAssignment(long assignmentId)
			throws PortalException {

		// Check permissions.

//		_assignmentModelResourcePermission.check(
//				getPermissionChecker(), assignmentId, ActionKeys.DELETE);

		Assignment assignment =
				assignmentLocalService.getAssignment(assignmentId);

		return assignmentLocalService.deleteAssignment(assignment);
	}

	public Assignment getAssignment(long assignmentId)
			throws PortalException {

		Assignment assignment =
				assignmentLocalService.getAssignment(assignmentId);

		// Check permissions.

//		_assignmentModelResourcePermission.check(
//				getPermissionChecker(), assignment, ActionKeys.VIEW);

		return assignment;
	}

	public List<Assignment> getAssignmentsByUserId(long userId) {

		return assignmentPersistence.findByUserId(userId);
	}
}