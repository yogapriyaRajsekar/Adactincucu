package com.adactin.testRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Cucumber.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactinFeature",
      glue ="com.adactin.stepDefenition",
      monochrome = true,
      strict = true,
      plugin = {"pretty","html:Reports/htmlreport.html",
    		  "junit:Reports/xmlreport.xml",
    		  "json:Reports/jsonreport.json",
    		  "com.cucumber.listener.ExtentCucumberFormatter:Reports/extendreport.html"})

public class RunnerClass extends BaseClass {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = browserLaunch("chrome");

	}

	@AfterClass
	public static void tearDown() {
		close();

	}

}

/*,
  "pretty","html:Reports/htmlreport.html",
    		  "junit:Reports/xmlreport.xml",
    		  "json:Reports/jsonreport.json",*/
