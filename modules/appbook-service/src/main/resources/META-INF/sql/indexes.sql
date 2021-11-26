create index IX_91ACD082 on Appbook_Assignment (groupId);
create index IX_9CCF2162 on Appbook_Assignment (userId);
create index IX_6660F91C on Appbook_Assignment (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F2D357A8 on Appbook_Assignment (uuid_[$COLUMN_LENGTH:75$], groupId);