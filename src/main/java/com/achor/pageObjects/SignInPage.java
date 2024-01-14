package com.achor.pageObjects;

import com.achor.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class SignInPage extends BasePage {

    public WebDriver driver;

    By signInWithGoogle = By.cssSelector(".google-sign-in-button");
    By email = By.cssSelector("input#email");
    By password = By.cssSelector("input#password");
    By login = By.cssSelector("input[value='Login']");
    By register = By.linkText("Register your account");
    By forgotPassword = By.cssSelector(".ForgetPwd");

    public SignInPage() throws IOException {
        super();
    }

    public WebElement getSignInWithGoogle() throws IOException {
        this.driver = getDriver();
        return driver.findElement(signInWithGoogle);
    }

    public WebElement getEmail() throws IOException{
        this.driver = getDriver();
        return driver.findElement(email);
    }

    public WebElement getPassword() throws IOException{
        this.driver = getDriver();
        return driver.findElement(password);
    }

    public WebElement getLogin() throws IOException{
        this.driver = getDriver();
        return driver.findElement(login);
    }

    public WebElement getRegister() throws IOException{
        this.driver = getDriver();
        return driver.findElement(register);
    }

    public WebElement getForgotPassword() throws IOException{
        this.driver = getDriver();
        return driver.findElement(forgotPassword);
    }

}
