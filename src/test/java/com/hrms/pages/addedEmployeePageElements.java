package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class addedEmployeePageElements {

	@FindBy(id="empPic")
	public WebElement empPic;
	
	@FindBy(linkText="Employee Id")
	public WebElement addedEmployeeId;
	
	public addedEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	} 
}
