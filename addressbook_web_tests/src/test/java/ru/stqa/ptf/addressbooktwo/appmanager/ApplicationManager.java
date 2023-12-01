package ru.stqa.ptf.addressbooktwo.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.ptf.addressbooktwo.unit.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ApplicationManager {
    private WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();


    public BaseUnit baseUnit;

    protected AddLogin addLogin;

    public AddPersonName name;

    public AddPersonAddress address;

    public AddPersonBirthday birthday;

    public SaveChanges save;

    public DeleteAddress delete;


    public void setUp() {
        driver = new FirefoxDriver();
        baseUnit = new BaseUnit(driver);
        addLogin = new AddLogin(driver);
        name = new AddPersonName(driver);
        address = new AddPersonAddress(driver);
        birthday = new AddPersonBirthday(driver);
        save = new SaveChanges(driver);
        delete = new DeleteAddress(driver);
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/");
        addLogin.login("admin", "secret", By.name("user"), By.name("pass"), By.id("LoginForm"));
    }

    public void tearDown(){
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
