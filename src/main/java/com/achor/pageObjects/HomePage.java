package com.achor.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    public WebDriver driver;
    By search = By.cssSelector(".form-control");
    By categories = By.cssSelector("li:nth-of-type(2) > a[role='button']");
    By navHandTools = By.cssSelector(".show li:nth-of-type(1) .dropdown-item");
    By navPowerTools = By.cssSelector(".show li:nth-of-type(2) .dropdown-item");
    By navSpecialTools = By.cssSelector(".show li:nth-of-type(3) .dropdown-item");
    By navRentals = By.linkText("Rentals");
    By categoriesHandTools = By.cssSelector("#filters .checkbox:nth-child(13) > label:nth-of-type(1) .icheck");
    By hammer = By.cssSelector("#filters .checkbox:nth-child(13) .checkbox:nth-of-type(1) .icheck");

    By handSaw = By.cssSelector("#filters .checkbox:nth-child(13) .checkbox:nth-of-type(2) .icheck");
    By wrench =  By.cssSelector("#filters .checkbox:nth-child(13) .checkbox:nth-of-type(3) .icheck");
    By screwDriver=  By.cssSelector("#filters .checkbox:nth-child(13) .checkbox:nth-of-type(4) .icheck");
    By pliers =  By.cssSelector("#filters .checkbox:nth-child(13) .checkbox:nth-of-type(5) .icheck");
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

    public WebElement getHammer(){
        return driver.findElement(hammer);
    }

    public WebElement getHandSaw(){
        return driver.findElement(handSaw);
    }

    public WebElement getWrench(){
        return driver.findElement(wrench);
    }

    public WebElement getScrewDriver(){
        return driver.findElement(screwDriver);
    }

    public  WebElement getPlier(){
        return driver.findElement(pliers);
    }

    public WebElement getChisel(){
        return driver.findElement(chisels);
    }

    public WebElement getMeasures(){
        return driver.findElement(measures);
    }



}
