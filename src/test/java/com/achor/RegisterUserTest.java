package com.achor;

import com.achor.base.BasePage;
import com.achor.pageObjects.HomePage;
import com.achor.pageObjects.RegisterPage;
import com.achor.pageObjects.SignInPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegisterUserTest extends BasePage {

    public RegisterUserTest() throws IOException {
        super();
    }

    @BeforeTest
    public void setUp() throws IOException{
        driver = getDriver();
        driver.get(getUrl());
        driver.manage().window().maximize();

    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver = null;
    }

    @Test
    public void registerTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        homePage.getNavSignIn().click();
        Thread.sleep(6000);

        SignInPage signInPage = new SignInPage(driver);
        signInPage.getRegister().click();
        registerPage.getFirstName().sendKeys("Obinna");
        registerPage.getLastName().sendKeys("Iheanacho");
        registerPage.getDob().sendKeys("23/04/2000");
        Thread.sleep(6000);
        registerPage.getAddress().sendKeys("550 Second Street");
        registerPage.getPostCode().sendKeys("N5V 3S3");
        registerPage.getCity().sendKeys("London");
        registerPage.getState().sendKeys("Ontario");
        registerPage.getCountry();
        registerPage.getPhone().sendKeys("6139847563");
        registerPage.getEmail().sendKeys("iheanachocharlie@gmail.com");
        registerPage.getPassword().sendKeys("testpassword");
        registerPage.getRegister().click();
        Thread.sleep(5000);



    }
}

