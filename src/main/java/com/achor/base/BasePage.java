package com.achor.base;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

public class BasePage {

//    public static WebDriver driver;
    private static  String url;
    private Properties prop;


    public BasePage() throws IOException{

        prop = new Properties();
        FileInputStream data = new FileInputStream(
                System.getProperty("user.dir") + "/src/main/java/com/achor/resources/config.properties"
        );
        prop.load(data);
    }

   public static WebDriver getDriver() throws IOException{
       return WebdriverInstance.getDriver();

  }

  public String getUrl(){
        url = prop.getProperty("url");
        return url;
  }

    public static void waitForElementInvisible(WebElement element, Duration timer) throws IOException {
        WebDriverWait wait = new WebDriverWait(getDriver(), timer);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

  public void takeSnapshot(String name) throws IOException {
      File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);

      File destFile = new File(System.getProperty("user.dir") + "/target/screenshots" + timeStamp() + ".png");
  }

    private String timeStamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

}
