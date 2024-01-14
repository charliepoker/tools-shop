package com.achor.pageObjects;

import com.achor.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class CombinationPlierProductPage extends BasePage {

    public WebDriver driver;
    By addToCart = By.cssSelector("button#btn-add-to-cart");
    By addToFavorite = By.cssSelector("button#btn-add-to-favorites");
    By reduceProduct = By.cssSelector("button#btn-decrease-quantity");
    By increaseProduct = By.cssSelector("button#btn-increase-quantity");

    public CombinationPlierProductPage() throws IOException {
        super();
    }

    public WebElement getAddToCart() throws IOException{
        this.driver = getDriver();
        return driver.findElement(addToCart);
    }
    public  WebElement getAddToFavorite() throws IOException{
        this.driver = getDriver();
        return driver.findElement(addToFavorite);
    }
    public WebElement getReduceProduct() throws IOException{
        this.driver = getDriver();
        return driver.findElement(reduceProduct);
    }
    public WebElement getIncreaseProduct() throws IOException{
        this.driver = getDriver();
        return driver.findElement(increaseProduct);
    }


}
