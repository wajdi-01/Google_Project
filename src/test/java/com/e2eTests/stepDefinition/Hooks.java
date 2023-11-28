package com.e2eTests.stepDefinition;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.e2e.Magento_Git.Base;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends Base {

    @Before
    public void runsBeforeAnyScenario() {

    }

    @After
    public void runsAfterAnyScenario(Scenario scenario) throws IOException {

        driver.quit();
    }

}
