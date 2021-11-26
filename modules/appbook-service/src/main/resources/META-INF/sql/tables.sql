create table Appbook_Assignment (
	uuid_ VARCHAR(75) null,
	assignmentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	title VARCHAR(75) null,
	articleId LONG,
	description VARCHAR(75) null,
	iconType VARCHAR(75) null,
	dueDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null
);