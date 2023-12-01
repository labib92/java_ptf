package ru.stqa.ptf.addressbooktwo.tests;

import org.testng.annotations.Test;

public class GroupDeleteContactTest extends TestBase{

    @Test
    public void deleteTest(){
        app.delete.deleteAddress();
    }
}
