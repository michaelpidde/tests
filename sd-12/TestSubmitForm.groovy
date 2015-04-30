package com.michaelpidde.tests.sd_12;

import com.michaelpidde.tests.sd_12.pageObject.Page

// Get page object
page = loadPageObject Page.class
page.setDriver driver

driver.get baseUrl
logStep "Get base URL."

// Wait because waiting is cool.
wait 3

page.login()
logStep "Logging in."

// Wait for redirect
wait 3

loggedIn = findElementByClass "content" isDisplayed()
logStep "Check login."

// If the content element is there, the login was good...
return loggedIn