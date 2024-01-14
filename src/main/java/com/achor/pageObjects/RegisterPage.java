package com.achor.pageObjects;


import com.achor.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.Base64;

public class RegisterPage extends BasePage {

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


    public RegisterPage() throws IOException {
        super();
    }

    public WebElement getFirstName() throws IOException{
        this.driver = getDriver();
        return driver.findElement(firstName);
    }

    public WebElement getLastName() throws IOException{
        this.driver = getDriver();
        return driver.findElement(lastName);
    }

    public WebElement getDob() throws IOException{
        this.driver = getDriver();
        return driver.findElement(dob);
    }

    public WebElement getAddress() throws IOException{
        this.driver = getDriver();
        return driver.findElement(address);
    }

    public WebElement getPostCode() throws IOException{
        this.driver = getDriver();
        return driver.findElement(postCode);
    }

    public WebElement getCity() throws IOException {
        this.driver = getDriver();
        return driver.findElement(city);
    }

    public WebElement getState() throws IOException {
        this.driver = getDriver();
        return driver.findElement(state);
    }

    public void getCountry() throws IOException{
        this.driver = getDriver();

        Select country = new Select(driver.findElement(this.country));
        country.selectByVisibleText("Canada");

    }

    public  WebElement getPhone() throws IOException{
        this.driver = getDriver();
        return driver.findElement(phone);
    }

    public WebElement getEmail() throws IOException{
        this.driver = getDriver();
        return driver.findElement(email);
    }

    public WebElement getPassword() throws IOException{
        this.driver = getDriver();
        return driver.findElement(password);
    }

    public  WebElement getRegister() throws IOException{
        this.driver = getDriver();
        return driver.findElement(register);
    }

}
