package ru.stqa.ptf.addressbooktwo.unit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.ptf.addressbooktwo.model.FullAddress;

public class AddPersonAddress extends BaseUnit{
    public AddPersonAddress(WebDriver driver) {
        super(driver);
    }

    public void addAddress(FullAddress fullAddress, By theform, By company, By address, By mobile, String email) {
        driver.findElement(theform).click();
        driver.findElement(company).click();
        driver.findElement(company).sendKeys(fullAddress.getCompany());
        driver.findElement(theform).click();
        driver.findElement(address).click();
        driver.findElement(address).sendKeys(fullAddress.getAddress());
        driver.findElement(theform).click();
        driver.findElement(mobile).click();
        driver.findElement(mobile).sendKeys(fullAddress.getMobile());
        driver.findElement(theform).click();
        driver.findElement(By.name(email)).click();
        driver.findElement(By.name(email)).sendKeys(fullAddress.getEmail());
    }


}
