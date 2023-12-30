package com.achor.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public WebDriver driver;
    By search = By.cssSelector(".form-control");
    By categories = By.cssSelector("li:nth-of-type(2) > a[role='button']");
    By navHandTools = By.cssSelector(".show li:nth-of-type(1) .dropdown-item");
    By navPowerTools = By.cssSelector(".show li:nth-of-type(2) .dropdown-item");
    By navSpecialTools = By.cssSelector(".show li:nth-of-type(3) .dropdown-item");
    By navRentals = By.linkText("Rentals");
    By hammer;
    By handSaw;
    By wrench;
    By screwDriver;
    By pliers;
    By chisels;
    By measures;


    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getSearch(){
       return driver.findElement(search);
    }

    public WebElement getCategories(){
        return driver.findElement(categories);
    }

    public WebElement getHandTools(){
        return driver.findElement(navHandTools);
    }

    public  WebElement getPowerTools(){
        return driver.findElement(navPowerTools);
    }

    public WebElement getSpecialTools(){
        return driver.findElement(navSpecialTools);
    }

    public WebElement getRentals(){
        return driver.findElement(navRentals);
    }
}
