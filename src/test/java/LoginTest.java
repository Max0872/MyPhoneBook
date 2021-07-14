import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void loginPositiveTest(){

        click(By.xpath("//a[.='LOGIN']"));
        type(By.xpath("//*[@placeholder='Email']"), "maxmay0872@gmail.com");
        type(By.xpath("//*[@placeholder='Password']"),"123456$Max");
        click(By.xpath("//*[.=' Login']"));
        String loginS = wd.findElement(By.xpath("//a[.='ADD']")).getText();
        Assert.assertEquals(loginS,"ADD");
    }


}
