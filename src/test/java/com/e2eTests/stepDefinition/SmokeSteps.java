package com.e2eTests.stepDefinition;

import com.e2e.Magento_Git.Base;

import com.e2eTests.pageObjects.SmokePageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class SmokeSteps extends Base {

    SmokePageObjects smokePageObjects;


    public SmokeSteps() {
     PageFactory.initElements(driver, SmokePageObjects.class);
     this.smokePageObjects = new SmokePageObjects();
 }

    //**Check search button**//
    @Given(": i navigate to the home page")
    public void i_navigate_to_the_home_page() {
        lunchBrowser();
        driver.get(props.getProperty("url"));


    }
    @When(": i write my search keyword")
    public void i_write_my_search_keyword() {
        PageFactory.initElements(driver, SmokePageObjects.class);
        smokePageObjects.sendSearchBox();

    }
    @When(": i press search button")
    public void i_press_search_button() {
    smokePageObjects.clickOnSearchBtn();
    }
    @Then(": the search result should appear")
    public void the_search_result_should_appear() {

    }
}
