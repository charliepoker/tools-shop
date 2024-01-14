package com.achor.pageObjects;

import com.achor.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class HomePage extends BasePage {

    public WebDriver driver;

    By cart = By.cssSelector("li:nth-of-type(5) > .nav-link");
    By search = By.cssSelector(".form-control");
    By categories = By.cssSelector("li:nth-of-type(2) > a[role='button']");
    By navHandTools = By.cssSelector(".show li:nth-of-type(1) .dropdown-item");
    By navPowerTools = By.cssSelector(".show li:nth-of-type(2) .dropdown-item");
    By navSpecialTools = By.cssSelector(".show li:nth-of-type(3) .dropdown-item");
    By navRentals = By.linkText("Rentals");
    By navSignIn = By.cssSelector("[class] .nav-item:nth-of-type(4) .nav-link");
    By categoriesHandTools = By.cssSelector("#filters .checkbox:nth-child(13) > label:nth-of-type(1) .icheck");
    By hammer = By.cssSelector("#filters .checkbox:nth-child(13) .checkbox:nth-of-type(1) .icheck");

    By handSaw = By.cssSelector("#filters .checkbox:nth-child(13) .checkbox:nth-of-type(2) .icheck");
    By wrench =  By.cssSelector("#filters .checkbox:nth-child(13) .checkbox:nth-of-type(3) .icheck");
    By screwDriver=  By.cssSelector("#filters .checkbox:nth-child(13) .checkbox:nth-of-type(4) .icheck");
    By pliers =  By.cssSelector("#filters .checkbox:nth-child(13) .checkbox:nth-of-type(5) .icheck");

    /* TODO
find the correct locator for the webElement
* */
    By combinationPlier = By.cssSelector("[data-test='product-01HKNHE4F098CK6SZX3M67W2CY'] .card-img-top");
    By chisels = By.cssSelector("#filters .checkbox:nth-child(13) .checkbox:nth-of-type(6) .icheck");
    By measures = By.cssSelector("#filters .checkbox:nth-child(13) .checkbox:nth-of-type(7) .icheck");
    By categoriesPowerTools = By.cssSelector("input[value='01HJYP58KNNZ6T13JAZ7DG0HQN']");
    By grinder;
    By sander;
    By saw;
    By drill;
    By catergoriesOther;
    By toolBelts;
    By storageSolutions;
    By workbench;
    By safetyGear;
    By fasteners;



    public HomePage() throws IOException {
        super();
    }
    public WebElement getCart() throws IOException{
        this.driver = getDriver();
        return driver.findElement(cart);
    }

    public WebElement getSearch() throws IOException{
        this.driver = getDriver();
        return driver.findElement(search);
    }

    public WebElement getCategories() throws IOException{
        this.driver = getDriver();
        return driver.findElement(categories);
    }

    public WebElement getHandTools() throws IOException{
        this.driver = getDriver();
        return driver.findElement(navHandTools);
    }

    public  WebElement getPowerTools() throws IOException{
        this.driver = getDriver();
        return driver.findElement(navPowerTools);
    }

    public WebElement getSpecialTools() throws IOException{
        this.driver = getDriver();
        return driver.findElement(navSpecialTools);
    }

    public WebElement getRentals() throws IOException{
        this.driver = getDriver();
        return driver.findElement(navRentals);
    }

    public WebElement getNavSignIn() throws IOException{
        this.driver = getDriver();
        return driver.findElement(navSignIn);
    }

    public WebElement getHammer() throws IOException{
        this.driver = getDriver();
        return driver.findElement(hammer);
    }

    public WebElement getHandSaw() throws IOException{
        this.driver = getDriver();
        return driver.findElement(handSaw);
    }

    public WebElement getWrench() throws IOException{
        this.driver = getDriver();
        return driver.findElement(wrench);
    }

    public WebElement getScrewDriver() throws IOException{
        this.driver = getDriver();
        return driver.findElement(screwDriver);
    }

    public  WebElement getPlier() throws IOException{
        this.driver = getDriver();
        return driver.findElement(pliers);
    }
    public  WebElement getCombinationPlier() throws IOException{
        this.driver = getDriver();
        return driver.findElement(combinationPlier);
    }

    public WebElement getChisel() throws IOException{
        this.driver = getDriver();
        return driver.findElement(chisels);
    }

    public WebElement getMeasures() throws IOException{
        this.driver = getDriver();
        return driver.findElement(measures);
    }



}
