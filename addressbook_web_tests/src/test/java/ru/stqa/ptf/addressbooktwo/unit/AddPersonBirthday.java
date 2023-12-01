package ru.stqa.ptf.addressbooktwo.unit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.ptf.addressbooktwo.model.FullBirthday;

public class AddPersonBirthday extends BaseUnit{


    public AddPersonBirthday(WebDriver driver) {
        super(driver);
    }

    public void addBirthday(FullBirthday fullBirthday, By theform, By bday, By bmonth, By byear) {
        driver.findElement(theform).click();
        driver.findElement(bday).click();
        new Select(driver.findElement(bday)).selectByVisibleText(fullBirthday.getDay());
        new Select(driver.findElement(bmonth)).selectByVisibleText(fullBirthday.getMonth());
        driver.findElement(theform).click();
        driver.findElement(byear).click();
        driver.findElement(byear).sendKeys(fullBirthday.getYear());
        driver.findElement(theform).click();
    }
}
