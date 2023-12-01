package ru.stqa.ptf.addressbooktwo.unit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaveChanges extends BaseUnit{



    public SaveChanges(WebDriver driver) {
        super(driver);
    }

    public void saveChanges(){
        driver.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }
}
