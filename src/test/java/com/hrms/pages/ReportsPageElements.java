package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ReportsPageElements {

 @FindBy(id="search_search")
 public WebElement reportName;
	
 @FindBy(xpath ="//table[@id='resultTable']/tbody/tr/td")
 public WebElement reportMessage;
 
 @FindBy(name="_search")
 public WebElement searchClick;
 
 @FindBy(xpath ="//table[@id='resultTable']/tbody/tr[2]/td[2]")
 public WebElement employeeRepo;
 
 @FindBy(xpath ="//table[@id='resultTable']/tbody/tr[1]/td[1]")
 public WebElement candidateRepo;
 
 public ReportsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	} 
}
