<%@ include file="/init.jsp"%>

<div class="application-list appbook-selected">
	<div class="text-center">
		<div class="container">
			<div class="row align-items-center justify-content-center">
				<c:forEach var="app" items="${apps}">
					<div class="col-12 p-0 m-0">
						<div class="mini-card">
						    <div class="row">
						        <div class="col-3 display-table">
                                    <div class="card-icon align-middle">
                                        <liferay-ui:icon
                                            icon="${app.icon}"
                                            markupView="lexicon"
                                            message="${app.title}"
                                        />
                                    </div>
						        </div>
						        <div class="col-6 display-table">
                                    <a href="/-/${app.link}" class="btn align-middle">
                                        ${app.title}
                                    </a>
						        </div>
						        <div class="col-3 display-table">
                                    <div class="card-icon-arrow align-middle">
                                        <liferay-ui:icon
                                            icon="angle-right"
                                            markupView="lexicon"
                                            message="${app.title}-arrow"
                                        />
                                    </div>
                                </div>
						    </div>
						</div>
					</div>
				</c:forEach>
				<c:if test="${empty apps}">
					<div class="mini-card text-center">
						No apps selected
					</div>
				</c:if>
			</div>
		</div>
	</div>
</div>