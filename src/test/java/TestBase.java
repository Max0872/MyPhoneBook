import application.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.nio.file.WatchEvent;
import java.nio.file.Watchable;
import java.util.concurrent.TimeUnit;

public class TestBase {
  protected static ApplicationManager app = new ApplicationManager();

    WebDriver wd;

    @BeforeClass
    public void init(){
       app.init();

    }
    @AfterClass
    public void tearDown(){
        app.stop();
    }

//    public void click(By locator){
//        wd.findElement(locator).click();
//    }
//    public void type(By locator,String text){
//        if(text!=null) {
//            WebElement element = wd.findElement(locator);
//            element.click();
//            element.clear();
//            element.sendKeys(text);
//        }
//    }
}
