package com.crd.dwh.automation.automation;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {
        AutomationApplication.class,
        AutomationApplicationTests.class},
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(Cucumber.class)
@CucumberContextConfiguration
@CucumberOptions(plugin = { "pretty"},tags = "Smoke",features = "src/test/resources")

class AutomationApplicationTests {
    @Test
    void contextLoads () {
    }
}
