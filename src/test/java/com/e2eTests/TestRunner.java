package com.e2eTests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		  features = "src/specs/features",
		      glue = "com/e2eTests",
		       tags = "@test",
	        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json" ,
	        		},
	       
	        		//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		 stepNotifications = true
		
	)
public class TestRunner {
	
}
