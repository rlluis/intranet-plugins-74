<%@ include file="/init.jsp" %>

<portlet:actionURL name="<%=MVCCommandNames.SELECT_APP%>" var="selectAppURL" />
<portlet:actionURL name="<%=MVCCommandNames.SELECT_SITE%>" var="selectSiteURL" />

<aui:form action="" method="post" name="selectSite">
	<aui:select name="siteSelector" id="siteSelector" label ="Select Site">
		<c:forEach var="site" items="${sites}">
			<c:if test = "${currentSiteId == site.key}">
	        	<aui:option selected="true" value="${site.key}">${site.value}</aui:option>
	      	</c:if>
	      	<c:if test = "${currentSiteId != site.key}">
	        	<aui:option selected="false" value="${site.key}">${site.value}</aui:option>
	      	</c:if>
		</c:forEach>
	</aui:select>
</aui:form>

<aui:form action="<%=selectAppURL %>" method="post" name="fm">
    <aui:input name="values" type="hidden" />
	<liferay-ui:input-move-boxes
	     leftBoxName="leftBox"
	   leftTitle="Available Apps"
	   leftList="${leftBox}"
	   leftReorder="false"
	   rightBoxName="rightBox"
	   rightTitle="Your Selected Apps"
	   rightList="${rightBox}"
	   rightReorder="false"
	/>
<aui:button-row>
        <aui:button type="submit" value="save" />
    </aui:button-row>
</aui:form>

<aui:script>
AUI().use('aui-base', function(A){
	A.one("#<portlet:namespace/>selectSite").on('change',function(){
	var selectedValue = A.one('#<portlet:namespace/>siteSelector').get('value');
	 submitForm('#<portlet:namespace/>selectSite');
	})
});
</aui:script>

<aui:script use="liferay-util-list-fields">
A.one('#<portlet:namespace/>fm').on('submit', function(event) {
    var selectedValues = Liferay.Util.listSelect('#<portlet:namespace/>rightBox');
    A.one('#<portlet:namespace/>values').val(selectedValues);
    submitForm('#<portlet:namespace/>fm');
});
</aui:script>