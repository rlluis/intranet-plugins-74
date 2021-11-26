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

/*
 * This function gets loaded when all the HTML, not including the portlets, is
 * loaded.
 */
AUI().ready(function () {
    if (! document.querySelector('.has-edit-mode-menu')) {
        let iconMenu = document.getElementById('mi-icon-menu');
        let miMenu = document.getElementById('mi-menu');
        let mobileButton = document.getElementById('mobile-toggler');
        
        iconMenu.addEventListener('mouseenter', () => {
            miMenu.classList.add('active');
        });
        miMenu.addEventListener('mouseleave', () => {
            miMenu.classList.remove('active');
        });
        mobileButton.addEventListener('click', () => {
            miMenu.classList.toggle('active');
        });
    }
});

/*
 * This function gets loaded after each and every portlet on the page.
 *
 * portletId: the current portlet's id
 * node: the Alloy Node object of the current portlet
 */
Liferay.Portlet.ready(function (_portletId, _node) {});

/*
 * This function gets loaded when everything, including the portlets, is on
 * the page.
 */
Liferay.on('allPortletsReady', function () {});
