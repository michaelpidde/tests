package com.michaelpidde.tests.sd_12;

import com.michaelpidde.tests.sd_12.pageObject.Page

// Get page object
page = loadPageObject Page.class
page.setDriver driver

driver.get baseUrl
logStep "Get base URL."

// Wait because waiting is cool.
wait 3

failure = findElementByClass "jameson"

page.usernameInput.click()

return true