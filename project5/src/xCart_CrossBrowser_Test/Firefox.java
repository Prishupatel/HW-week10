package xCart_CrossBrowser_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) {
        String baseUrl="https://www.x-cart.com/";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        String getTitle= driver.getTitle();
        System.out.println("getTitle through Firefox browser: "+getTitle);
        driver.close();

    }


    }

