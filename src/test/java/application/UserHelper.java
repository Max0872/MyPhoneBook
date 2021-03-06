package application;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase{


    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void openLoginForm() {
        click(By.xpath("//a[.='LOGIN']"));

    }

    public void fillLoginForm(String email, String password) {
        type(By.xpath("//*[@placeholder='Email']"), "maxmay0872@gmail.com");
        type(By.xpath("//*[@placeholder='Password']"),"123456$Max");
    }
    public void fillLoginForm(User user) {
        type(By.xpath("//*[@placeholder='Email']"), user.getEmail());
        type(By.xpath("//*[@placeholder='Password']"), user.getPassword());
    }



    public void submitLogin() {
        click(By.xpath("//*[.=' Login']"));
    }

    public boolean isLogin() {
        return wd.findElements(By.xpath("//a[.='LOGIN']")).size()>0;
    }

    public void logout() {
        click(By.xpath("//*[text()='Sign Out']"));
    }
}
