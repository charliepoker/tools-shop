package com.achor.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

    public WebDriver driver;

    By signInWithGoogle = By.cssSelector(".google-sign-in-button");
    By email = By.cssSelector("input#email");
    By password = By.cssSelector("input#password");
    By login = By.cssSelector("input[value='Login']");
    By register = By.linkText("Register your account");
    By forgotPassword = By.cssSelector(".ForgetPwd");

    public SignInPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getSignInWithGoogle(){
        return driver.findElement(signInWithGoogle);
    }

    public WebElement getEmail(){
        return driver.findElement(email);
    }

    public WebElement getPassword(){
        return driver.findElement(password);
    }

    public WebElement getLogin(){
        return driver.findElement(login);
    }

    public WebElement getRegister(){
        return driver.findElement(register);
    }

    public WebElement getForgotPassword(){
        return driver.findElement(forgotPassword);
    }

}
