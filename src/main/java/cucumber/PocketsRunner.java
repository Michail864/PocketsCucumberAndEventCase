package cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features = {"C:\\Users\\wormi\\IdeaProjects\\PocketsCucumberTesting\\src\\main\\java\\cucumber\\features\\Contacts.feature"},
glue = {"C:\\Users\\wormi\\IdeaProjects\\PocketsCucumberTesting\\src\\main\\java\\cucumber\\steps\\ContactsSteps.java"},
plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml"})

public class PocketsRunner extends AbstractTestNGCucumberTests {
}
