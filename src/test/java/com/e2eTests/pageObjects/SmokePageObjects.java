package com.e2eTests.pageObjects;

import com.e2e.Magento_Git.Base;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmokePageObjects extends Base {

    //**FIndBy**//

@FindBy(id = "APjFqb")
    public static  WebElement searchBox;
@FindBy(xpath = "(//input[@name='btnK'])[2]")
public static WebElement searchBtn;
@FindBy(xpath = "(//div[@id='result-stats'])[1]")
public static WebElement resultAssert;




//**Methods**//
    public void sendSearchBox() {
        searchBox.click();
        searchBox.sendKeys("Hello !");
    }
public void clickOnSearchBtn() {
    searchBtn.sendKeys(Keys.ENTER);
}
public void searchResultAssert() {
        String assertResult = resultAssert.getText();
    Assert.assertEquals("X",assertResult);
    driver.quit();
}
}