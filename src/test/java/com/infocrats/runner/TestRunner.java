package com.infocrats.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
<<<<<<< HEAD
=======

>>>>>>> 3605dbd12bb5eb59cbae8e775970cb27e21dbcfd
@CucumberOptions(features = { "src/test/resources/features" }, tags = { "@RunMSN" }, glue = {
		"com.infocrats.stepdefs" }, monochrome = true, plugin = { "pretty", "html:target/cucumber-reports",

				"json:target/cucumber.json", "rerun:rerun.txt" })
public class TestRunner {

}       

