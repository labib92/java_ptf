package ru.stqa.ptf.addressbooktwo.unit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddLogin extends BaseUnit{

    public AddLogin(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password, By user, By pass, By loginForm) {
        driver.findElement(user).click();
        driver.findElement(user).sendKeys(username);
        driver.findElement(pass).sendKeys(password);
        driver.findElement(loginForm).submit();
    }

}
