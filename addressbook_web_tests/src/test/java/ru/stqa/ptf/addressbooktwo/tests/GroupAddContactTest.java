package ru.stqa.ptf.addressbooktwo.tests;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import ru.stqa.ptf.addressbooktwo.model.FullAddress;
import ru.stqa.ptf.addressbooktwo.model.FullBirthday;
import ru.stqa.ptf.addressbooktwo.model.FullName;

public class GroupAddContactTest extends TestBase{

    @Test
    public void testGroupAddContact() {
        app.baseUnit.addNewPerson(By.linkText("add new"));
        app.name.addPersonName(new FullName("Labib", "Omar", "Saleh", "Labib", "Mr."), By.name("firstname"), By.name("middlename"), By.name("lastname"), By.name("nickname"), By.name("title"));
        app.address.addAddress(new FullAddress("SPBSTU", "nOwhere", "788566852", "ki_charging_motherfucker@mail.ru"), By.name("theform"), By.name("company"), By.name("address"), By.name("mobile"), "email");
        app.birthday.addBirthday(new FullBirthday("21","August","1992"), By.name("theform"), By.name("bday"), By.name("bmonth"), By.name("byear"));
        app.save.saveChanges();
        app.baseUnit.returnHomePage(By.linkText("home"));
    }

    @Test
    public void addNewPersonTest(){
        app.baseUnit.addNewPerson(By.linkText("add new"));
        app.name.addPersonName(new FullName("Artyom", "Valentivech", "Karnov", "Skmpf", "The Programmer"), By.name("firstname"), By.name("middlename"), By.name("lastname"), By.name("nickname"), By.name("title"));
        app.address.addAddress(new FullAddress("Do Code", "Canada", "458966625", "i_LOVE_CODE@SOMETHING.ORG"), By.name("theform"), By.name("company"), By.name("address"), By.name("mobile"), "email");
        app.birthday.addBirthday(new FullBirthday("8","February","1996"), By.name("theform"), By.name("bday"), By.name("bmonth"), By.name("byear"));
        app.save.saveChanges();
        app.baseUnit.returnHomePage(By.linkText("home"));
    }

}
