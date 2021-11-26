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

package com.liferay.training.appbook.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Assignment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Assignment
 * @generated
 */
public class AssignmentWrapper
	extends BaseModelWrapper<Assignment>
	implements Assignment, ModelWrapper<Assignment> {

	public AssignmentWrapper(Assignment assignment) {
		super(assignment);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("assignmentId", getAssignmentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("title", getTitle());
		attributes.put("articleId", getArticleId());
		attributes.put("description", getDescription());
		attributes.put("iconType", getIconType());
		attributes.put("dueDate", getDueDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long assignmentId = (Long)attributes.get("assignmentId");

		if (assignmentId != null) {
			setAssignmentId(assignmentId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		Long articleId = (Long)attributes.get("articleId");

		if (articleId != null) {
			setArticleId(articleId);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String iconType = (String)attributes.get("iconType");

		if (iconType != null) {
			setIconType(iconType);
		}

		Date dueDate = (Date)attributes.get("dueDate");

		if (dueDate != null) {
			setDueDate(dueDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	@Override
	public Assignment cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the article ID of this assignment.
	 *
	 * @return the article ID of this assignment
	 */
	@Override
	public long getArticleId() {
		return model.getArticleId();
	}

	/**
	 * Returns the assignment ID of this assignment.
	 *
	 * @return the assignment ID of this assignment
	 */
	@Override
	public long getAssignmentId() {
		return model.getAssignmentId();
	}

	/**
	 * Returns the company ID of this assignment.
	 *
	 * @return the company ID of this assignment
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this assignment.
	 *
	 * @return the create date of this assignment
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this assignment.
	 *
	 * @return the description of this assignment
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the due date of this assignment.
	 *
	 * @return the due date of this assignment
	 */
	@Override
	public Date getDueDate() {
		return model.getDueDate();
	}

	/**
	 * Returns the group ID of this assignment.
	 *
	 * @return the group ID of this assignment
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icon type of this assignment.
	 *
	 * @return the icon type of this assignment
	 */
	@Override
	public String getIconType() {
		return model.getIconType();
	}

	/**
	 * Returns the modified date of this assignment.
	 *
	 * @return the modified date of this assignment
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this assignment.
	 *
	 * @return the primary key of this assignment
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this assignment.
	 *
	 * @return the status of this assignment
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this assignment.
	 *
	 * @return the status by user ID of this assignment
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this assignment.
	 *
	 * @return the status by user name of this assignment
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this assignment.
	 *
	 * @return the status by user uuid of this assignment
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this assignment.
	 *
	 * @return the status date of this assignment
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the title of this assignment.
	 *
	 * @return the title of this assignment
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the user ID of this assignment.
	 *
	 * @return the user ID of this assignment
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this assignment.
	 *
	 * @return the user name of this assignment
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this assignment.
	 *
	 * @return the user uuid of this assignment
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this assignment.
	 *
	 * @return the uuid of this assignment
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this assignment is approved.
	 *
	 * @return <code>true</code> if this assignment is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this assignment is denied.
	 *
	 * @return <code>true</code> if this assignment is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this assignment is a draft.
	 *
	 * @return <code>true</code> if this assignment is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this assignment is expired.
	 *
	 * @return <code>true</code> if this assignment is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this assignment is inactive.
	 *
	 * @return <code>true</code> if this assignment is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this assignment is incomplete.
	 *
	 * @return <code>true</code> if this assignment is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this assignment is pending.
	 *
	 * @return <code>true</code> if this assignment is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this assignment is scheduled.
	 *
	 * @return <code>true</code> if this assignment is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the article ID of this assignment.
	 *
	 * @param articleId the article ID of this assignment
	 */
	@Override
	public void setArticleId(long articleId) {
		model.setArticleId(articleId);
	}

	/**
	 * Sets the assignment ID of this assignment.
	 *
	 * @param assignmentId the assignment ID of this assignment
	 */
	@Override
	public void setAssignmentId(long assignmentId) {
		model.setAssignmentId(assignmentId);
	}

	/**
	 * Sets the company ID of this assignment.
	 *
	 * @param companyId the company ID of this assignment
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this assignment.
	 *
	 * @param createDate the create date of this assignment
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this assignment.
	 *
	 * @param description the description of this assignment
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the due date of this assignment.
	 *
	 * @param dueDate the due date of this assignment
	 */
	@Override
	public void setDueDate(Date dueDate) {
		model.setDueDate(dueDate);
	}

	/**
	 * Sets the group ID of this assignment.
	 *
	 * @param groupId the group ID of this assignment
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icon type of this assignment.
	 *
	 * @param iconType the icon type of this assignment
	 */
	@Override
	public void setIconType(String iconType) {
		model.setIconType(iconType);
	}

	/**
	 * Sets the modified date of this assignment.
	 *
	 * @param modifiedDate the modified date of this assignment
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this assignment.
	 *
	 * @param primaryKey the primary key of this assignment
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this assignment.
	 *
	 * @param status the status of this assignment
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this assignment.
	 *
	 * @param statusByUserId the status by user ID of this assignment
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this assignment.
	 *
	 * @param statusByUserName the status by user name of this assignment
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this assignment.
	 *
	 * @param statusByUserUuid the status by user uuid of this assignment
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this assignment.
	 *
	 * @param statusDate the status date of this assignment
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the title of this assignment.
	 *
	 * @param title the title of this assignment
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	/**
	 * Sets the user ID of this assignment.
	 *
	 * @param userId the user ID of this assignment
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this assignment.
	 *
	 * @param userName the user name of this assignment
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this assignment.
	 *
	 * @param userUuid the user uuid of this assignment
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this assignment.
	 *
	 * @param uuid the uuid of this assignment
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected AssignmentWrapper wrap(Assignment assignment) {
		return new AssignmentWrapper(assignment);
	}

}