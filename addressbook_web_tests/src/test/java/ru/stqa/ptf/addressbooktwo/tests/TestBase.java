package ru.stqa.ptf.addressbooktwo.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.ptf.addressbooktwo.appmanager.ApplicationManager;

public class TestBase {
    ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void initialize(){
        app.setUp();
    }
    @AfterMethod
    public void stop(){
        app.tearDown();
    }
}
