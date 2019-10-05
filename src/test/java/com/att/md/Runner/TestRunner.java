package com.att.md.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Feature",
		glue="com.att.md.stepDefinition"
		)

public class TestRunner {

}
