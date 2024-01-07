package com.achor.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    public WebDriver driver;

    By firstName = By.cssSelector("input#first_name");
    By lastName = By.cssSelector("input#last_name");
    By dob = By.cssSelector("input#dob");
    By address = By.cssSelector("input#address");
    By postCode = By.cssSelector("input#postcode");
    By city = By.cssSelector("input#city");
    By state = By.cssSelector("input#state");
    By country = By.cssSelector("select#country");
    By phone = By.cssSelector("input#phone");
    By email = By.cssSelector("input#email");
    By password = By.cssSelector("input#password");
    By register = By.cssSelector(".btnSubmit.mb-3");


    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getFirstName(){
        return driver.findElement(firstName);
    }

    public WebElement getLastName(){
        return driver.findElement(lastName);
    }

    public WebElement getDob(){
        return driver.findElement(dob);
    }

    public WebElement getAddress(){
        return driver.findElement(address);
    }

    public WebElement getPostCode(){
        return driver.findElement(postCode);
    }

    public WebElement getCity() {
        return driver.findElement(city);
    }

    public WebElement getState() {
        return driver.findElement(state);
    }

    public void getCountry(){


//      return driver.findElement(country);
        Select country = new Select(driver.findElement(this.country));
        country.selectByVisibleText("Canada");

    }

    public  WebElement getPhone(){
        return driver.findElement(phone);
    }

    public WebElement getEmail(){
        return driver.findElement(email);
    }

    public WebElement getPassword(){
        return driver.findElement(password);
    }

    public  WebElement getRegister(){
        return driver.findElement(register);
    }

}
