package com.achor.base;
import com.achor.pageObjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BasePage {

    public static WebDriver driver;
    private static  String url;
    private Properties prop;


    public BasePage() throws IOException{

        prop = new Properties();
        FileInputStream data = new FileInputStream(
                System.getProperty("user.dir") + "/src/main/java/com/achor/resources/config.properties"
        );
        prop.load(data);
    }

    public  WebDriver getDriver() throws IOException{

        if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }else if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }else if (prop.getProperty("browser").equalsIgnoreCase("IE")){
            driver = new InternetExplorerDriver();
        }else {
            driver = new EdgeDriver();
        }
        return driver;
    }

    public String getUrl() throws IOException{
        url = prop.getProperty("url");
        return url;
    }

    public static void main(String[] args) throws InterruptedException, IOException{

          BasePage basePage = new BasePage();
          driver = basePage.getDriver();

          driver.get(basePage.getUrl());

          driver.manage().window().maximize();

          HomePage homePage = new HomePage(driver);

          homePage.getCategories().click();

          homePage.getRentals().click();

          Thread.sleep(6000);

          driver.close();
          driver.quit();



    }




}
