package com.achor.pageObjects;

import com.achor.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class CartPage extends BasePage {

    public WebDriver driver;

    By totalAmount = By.cssSelector("tbody [class='col-md-2 text-end']:nth-of-type(4) span");
    By removeBtn = By.cssSelector(".btn.btn-danger");
    By checkoutBtn = By.cssSelector("app-cart .btn.btn-success");

    public CartPage() throws IOException {
        super();
    }

    public WebElement getTotalAmount() throws IOException {
        this.driver = getDriver();
        return driver.findElement(totalAmount);
    }

    public WebElement getRemoveBtn() throws IOException {
        this.driver = getDriver();
        return driver.findElement(removeBtn);
    }

    public WebElement getCheckoutBtn() throws IOException {
        this.driver = getDriver();
        return driver.findElement(checkoutBtn);
    }

}
