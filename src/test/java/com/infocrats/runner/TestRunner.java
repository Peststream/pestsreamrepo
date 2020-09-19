package com.infocrats.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
<<<<<<< Updated upstream

@CucumberOptions(features = { "src/test/resources/features" }, tags = { "@Passed" }, glue = {
=======
@CucumberOptions(features = { "src/test/resources/features" }, tags = { "@LeaveManagementEmpTermite" }, glue = {
>>>>>>> Stashed changes
		"com.infocrats.stepdefs" }, monochrome = true, plugin = { "pretty", "html:target/cucumber-reports",

				"json:target/cucumber.json", "rerun:rerun.txt" })
public class TestRunner {

}       

