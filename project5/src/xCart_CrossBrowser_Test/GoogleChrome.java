package xCart_CrossBrowser_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleChrome {
    public static void main(String[] args) {
        String baseUrl="https://www.x-cart.com/";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        String getTitle=driver.getTitle();
        System.out.println(getTitle);
        driver.close();
    }


}
