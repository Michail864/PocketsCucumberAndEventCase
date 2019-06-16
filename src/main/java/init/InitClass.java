package init;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class InitClass {

    public static WebDriver driver = null;

    @BeforeMethod
    public static WebDriver initDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wormi\\IdeaProjects\\PocketsCucumberTesting\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://pocketsdeveloper.com/contacts/");
        return driver;
    }
   public static void waitFor(int sec){
       try {
           Thread.sleep(sec * 1000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }
}
