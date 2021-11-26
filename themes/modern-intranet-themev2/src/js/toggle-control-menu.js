AUI().ready('liferay-store', function () {
	window.toggleControlMenu = (showControlMenuNext) => {
		Liferay.Store('SHOW_CONTROL_MENU', showControlMenuNext);

		setTimeout(() => {
			location.reload();
		}, 0);
	}

	if (! document.querySelector('.control-menu-container')) {
		document.body.classList.remove('has-control-menu');
	}
});