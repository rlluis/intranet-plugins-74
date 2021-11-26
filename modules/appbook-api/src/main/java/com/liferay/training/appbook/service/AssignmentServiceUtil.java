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

package com.liferay.training.appbook.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.training.appbook.model.Assignment;

import java.util.List;

/**
 * Provides the remote service utility for Assignment. This utility wraps
 * <code>com.liferay.training.appbook.service.impl.AssignmentServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AssignmentService
 * @generated
 */
public class AssignmentServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.appbook.service.impl.AssignmentServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Assignment addAssignment(
			long groupId, Long articleId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addAssignment(groupId, articleId, serviceContext);
	}

	public static Assignment deleteAssignment(long assignmentId)
		throws PortalException {

		return getService().deleteAssignment(assignmentId);
	}

	public static Assignment getAssignment(long assignmentId)
		throws PortalException {

		return getService().getAssignment(assignmentId);
	}

	public static List<Assignment> getAssignmentsByUserId(long userId) {
		return getService().getAssignmentsByUserId(userId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static AssignmentService getService() {
		return _service;
	}

	private static volatile AssignmentService _service;

}