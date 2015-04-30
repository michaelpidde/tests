package com.michaelpidde.tests.sd_12.pageObject

import com.michaelpidde.testflow.engine.util.TestException

import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.How.*
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import org.openqa.selenium.NoSuchElementException;

import groovy.transform.Field


@FindBy(name = "un")
@Field WebElement usernameInput

@FindBy(name = "pw")
@Field WebElement passwordInput

@FindBy(xpath = "//input[@value=\"Sign in\"]")
@Field WebElement loginButton

@Field WebDriver driver


void setDriver(WebDriver driver) {
	this.driver = driver
}


void login() {
	usernameInput.sendKeys("administrator")
	passwordInput.sendKeys("password")
	loginButton.click()
}