package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    static WebDriver driver;
    public static WebDriver getdriver(){
        if (driver==null) {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        }
        return driver;
    }


    public static void closedriver(){
        if (driver!=null){
            driver.close();
            driver=null;
        }
    }
    public static void quitdriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
    public static void navigateback(){
        driver.navigate().back();
    }


























}
