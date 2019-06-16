package init;

import org.openqa.selenium.support.PageFactory;
import pages.ContactMe;

public class WhichMessage extends InitClass {
    public ContactMe contactMe;

    public void functionsWhichMessage(String message){
        switch (functionNames.valueOf(message)){
            case seriousMessage:
                initDriver();
                contactMe = PageFactory.initElements(driver, ContactMe.class);
                contactMe.nameSendKeys("Michail");
                contactMe.emailSendKeys("wormike96@gmail.com");
                contactMe.subjectSendKeys("Some website is needed");
                contactMe.messageSendKeys("Hello. I need to create a website by July 4th. Call me");
                contactMe.sendMessage();
                break;
            case funnyMessage:
                initDriver();
                contactMe = PageFactory.initElements(driver, ContactMe.class);
                contactMe.nameSendKeys("Vova");
                contactMe.emailSendKeys("pegeot@gmail.com");
                contactMe.subjectSendKeys("Pancakes. A lot of them");
                contactMe.messageSendKeys("And if you see something, say something");
                contactMe.sendMessage();
                break;
        }
    }


    public enum functionNames{
        seriousMessage,
        funnyMessage

    }
}
