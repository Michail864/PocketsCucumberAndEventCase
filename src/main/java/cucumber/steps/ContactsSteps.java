package cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.ContactMe;

public class ContactsSteps {

    public WebDriver driver = null;
    public ContactMe contactMe;

 /*   @Given("I browse to pocketsdeveloper.com")
    public void browseToWebSite(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wormi\\IdeaProjects\\PocketsCucumberTesting\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://pocketsdeveloper.com/contacts/");
    }

    @Then("I parse name")
    public void sendNameToInput(){
        contactMe = PageFactory.initElements(driver, ContactMe.class);
        contactMe.nameSendKeys("Mike");
    }

    @Then("I parse mail")
    public void sendEmailToInput(){
        contactMe = PageFactory.initElements(driver, ContactMe.class);
        contactMe.emailSendKeys("wormike96@gmail.com");
    }

    @Then("I parse subject")
    public void sendSubjectToInput(){
        contactMe = PageFactory.initElements(driver, ContactMe.class);
        contactMe.subjectSendKeys("just say HI");
    }

    @Then("I parse message")
    public void sendMessageToInput(){
        contactMe = PageFactory.initElements(driver, ContactMe.class);
        contactMe.messageSendKeys("Hey, can you please LEGIT make me a website or FO?");
    }

    @Then("I press button")
    public void pressButton(){
        contactMe = PageFactory.initElements(driver, ContactMe.class);
        contactMe.sendMessage();
    }

    @And("I close my browser")
    public void closeBrowser(){
        driver.quit();
    }
*/
 @Given("^I browse to pocketsdeveloper\\.com$")
 public void i_browse_to_pocketsdeveloper_com() throws Throwable {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\wormi\\IdeaProjects\\PocketsCucumberTesting\\src\\main\\resources\\chromedriver.exe");
     driver = new ChromeDriver();
     driver.get("http://pocketsdeveloper.com/contacts/");
 }

    @Then("^I parse name$")
    public void i_parse_name() throws Throwable {
        contactMe = PageFactory.initElements(driver, ContactMe.class);
        contactMe.nameSendKeys("Mike");

    }

    @Then("^I parse mail$")
    public void i_parse_mail() throws Throwable {
        contactMe = PageFactory.initElements(driver, ContactMe.class);
        contactMe.emailSendKeys("wormike96@gmail.com");
    }

    @Then("^I parse subject$")
    public void i_parse_subject() throws Throwable {
        contactMe = PageFactory.initElements(driver, ContactMe.class);
        contactMe.subjectSendKeys("just say HI");
    }

    @Then("^I parse message$")
    public void i_parse_message() throws Throwable {
        contactMe = PageFactory.initElements(driver, ContactMe.class);
        contactMe.messageSendKeys("Hey, can you please LEGIT make me a website or FO?");
    }

    @Then("^I press button$")
    public void i_press_button() throws Throwable {
        contactMe = PageFactory.initElements(driver, ContactMe.class);
        contactMe.sendMessage();
    }

    @Then("^I close my browser$")
    public void i_close_my_browser() throws Throwable {
        driver.quit();
    }

}
