package ru.stqa.ptf.addressbooktwo.unit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class DeleteAddress extends BaseUnit{
    private boolean acceptNextAlert = true;
    public DeleteAddress(WebDriver driver) {
        super(driver);
    }

    public void deleteAddress(){
        driver.findElement(By.xpath("//img[@alt='Edit']")).click();
        driver.findElement(By.xpath("//div[@id='content']/form[2]/input[2]")).click();
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
