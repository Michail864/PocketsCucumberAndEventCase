package pages;

import init.InitClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactMe extends InitClass {

    @FindBy(xpath = "//*[@id=\"wpcf7-f84-p14-o1\"]/form/p[1]/label/span/input")
    public WebElement name;
    @FindBy(xpath = "//*[@id=\"wpcf7-f84-p14-o1\"]/form/p[2]/label/span/input")
    public WebElement email;
    @FindBy(xpath = "//*[@id=\"wpcf7-f84-p14-o1\"]/form/p[3]/label/span/input")
    public WebElement subject;
    @FindBy(xpath = "//*[@id=\"wpcf7-f84-p14-o1\"]/form/p[4]/label/span/textarea")
    public WebElement message;
    @FindBy(xpath = "//*[@id=\"wpcf7-f84-p14-o1\"]/form/p[5]/input")
    public WebElement buttonSend;


    public void nameSendKeys(String keys){
    name.sendKeys(keys);
    waitFor(2);
}
    public void emailSendKeys(String keys){
        email.sendKeys(keys);
        waitFor(2);
    }
    public void subjectSendKeys(String keys){
        subject.sendKeys(keys);
        waitFor(2);
    }
    public void messageSendKeys(String keys){
        message.sendKeys(keys);
        waitFor(2);
    }
    public void sendMessage(){
        buttonSend.click();
        waitFor(2);
    }


}
