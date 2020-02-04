package com.hrms.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="@target/failed.txt"
		,glue="com/hrms/steps"
//		,dryRun=false
		,plugin= "pretty"
		,monochrome=true
//		,tags="@smoke"
		)

public class FailedRunner {

}
