package ru.stqa.ptf.addressbooktwo.unit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.ptf.addressbooktwo.model.FullName;

public class AddPersonName extends BaseUnit{

    public AddPersonName(WebDriver driver) {
        super(driver);
    }

    public void addPersonName(FullName fullName, By firstname, By middlename, By lastname, By nickname, By title) {
        driver.findElement(firstname).click();
        driver.findElement(firstname).sendKeys(fullName.getFirstname());
        driver.findElement(middlename).sendKeys(fullName.getMiddlename());
        driver.findElement(lastname).click();
        driver.findElement(lastname).sendKeys(fullName.getLastname());
        driver.findElement(nickname).click();
        driver.findElement(nickname).sendKeys(fullName.getNickname());
        driver.findElement(title).click();
        driver.findElement(title).sendKeys(fullName.getTittle());
    }
}
