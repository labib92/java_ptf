package ru.stqa.ptf.addressbooktwo.unit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseUnit {
    WebDriver driver;

    public BaseUnit(WebDriver driver){
        this.driver = driver;
    }

    public void addNewPerson(By addNew) {
        driver.findElement(addNew).click();
    }

    public void returnHomePage(By home) {
        addNewPerson(home);
    }
}
