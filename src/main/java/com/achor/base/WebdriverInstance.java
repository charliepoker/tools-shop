package com.achor.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class WebdriverInstance {

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();


    public static WebDriver getDriver() throws IOException{
        if(driver.get() == null){
            driver.set(createDriver());
        }
        return driver.get();
    }

    public static WebDriver createDriver() throws IOException {
        WebDriver driver = null;

        Properties prop = new Properties();
        FileInputStream data = new FileInputStream(
                System.getProperty("user.dir") + "/src/main/java/com/achor/resources/config.properties"
        );
        prop.load(data);

        if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }else if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }else if (prop.getProperty("browser").equalsIgnoreCase("IE")){
            driver = new InternetExplorerDriver();
        }else {
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;


    }

    public static void cleanUpDriver(){
        driver.get().quit();
        driver.remove();
    }
}
