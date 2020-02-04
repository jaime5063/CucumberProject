package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.ReportsPageElements;
import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;




public class ReportsSteps extends CommonMethods {

	@Given("I navigate to Reports")
	public void i_navigate_to_Reports() throws InterruptedException {
		DashboardPageElements dash = new DashboardPageElements();
		jsClick(dash.pim);
		Thread.sleep(1000);
		jsClick(dash.Reports);
	}

	@When("I search {string} report should match or give errMssg {string}")
	public void i_search_report_should_match_or_give_errMssg(String ReportName, String ReportMessage) throws InterruptedException {
		ReportsPageElements repo = new ReportsPageElements();
		Thread.sleep(1000);
		sendText(repo.reportName, ReportName);
		click(repo.searchClick);
		String actRepo = repo.reportMessage.getText();
		Assert.assertEquals(ReportMessage, actRepo);
		
	}

}
