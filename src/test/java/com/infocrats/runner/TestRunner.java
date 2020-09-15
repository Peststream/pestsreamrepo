package com.infocrats.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features" }, tags = { "@CSSO_SSO_TMaterial_TimeandPrice_After_SpecificHour_SplitPrice_Workorder_CustPresent_Sendmail" }, glue = {
		"com.infocrats.stepdefs" }, monochrome = true, plugin = { "pretty", "html:target/cucumber-reports",

				"json:target/cucumber.json", "rerun:rerun.txt" })
public class TestRunner {

}       

