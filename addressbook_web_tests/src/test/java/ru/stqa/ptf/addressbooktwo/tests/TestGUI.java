package ru.stqa.ptf.addressbooktwo.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.ptf.addressbooktwo.model.FullAddress;
import ru.stqa.ptf.addressbooktwo.model.FullBirthday;
import ru.stqa.ptf.addressbooktwo.model.FullName;

public class TestGUI extends TestBase{

    @Test
    public void addNewPersonTest(String firstname, String middlename, String lastname, String nickname, String tittle,
                                 String company, String address, String mobile, String email,
                                 String day, String month, String year){
        app.baseUnit.addNewPerson(By.linkText("add new"));
        app.name.addPersonName(new FullName(firstname, middlename, lastname, nickname, tittle), By.name("firstname"), By.name("middlename"), By.name("lastname"), By.name("nickname"), By.name("title"));
        app.address.addAddress(new FullAddress(company, address, mobile, email), By.name("theform"), By.name("company"), By.name("address"), By.name("mobile"), "email");
        app.birthday.addBirthday(new FullBirthday(day,month,year), By.name("theform"), By.name("bday"), By.name("bmonth"), By.name("byear"));
        app.save.saveChanges();
        app.baseUnit.returnHomePage(By.linkText("home"));
    }
}
