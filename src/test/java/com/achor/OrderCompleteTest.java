package com.achor;

import com.achor.base.BasePage;
import com.achor.base.Hooks;
import com.achor.pageObjects.CartPage;
import com.achor.pageObjects.CombinationPlierProductPage;
import com.achor.pageObjects.HomePage;
import com.achor.pageObjects.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class OrderCompleteTest extends Hooks {

    public OrderCompleteTest() throws IOException {
        super();
    }




    @Test
    public void endToEndTest() throws InterruptedException, IOException {
        HomePage homePage = new HomePage();
        Thread.sleep(5000);
//        homePage.getPlier().click();

//        Thread.sleep(10000);
//        homePage.getCombinationPlier().click();

//
//        CombinationPlierProductPage plier = new CombinationPlierProductPage(driver);
//        Thread.sleep(3000);
//        plier.getAddToCart().click();
//        Thread.sleep(3000);
//        homePage.getCart().click();
//
//        Thread.sleep(3000);
//        CartPage cart = new CartPage(driver);
//        String totalAmount = cart.getTotalAmount().getText();
//
//        Assert.assertEquals(totalAmount, "$14.45");
//
//        cart.getCheckoutBtn().click();
//
//        Thread.sleep(3000);
//        SignInPage signIn = new SignInPage(driver);
//
//        signIn.getEmail().sendKeys("iheanachocharlie@gmail.com");
//        signIn.getPassword().sendKeys("testpassword");
//        signIn.getLogin().click();




        Thread.sleep(5000);
    }
}
