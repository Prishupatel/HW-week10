package barclays_CrossBrowser_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleChrome {
    public static void main(String[] args) {
        String baseUrl="https://www.barclays.co.uk/";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        String getTitle= driver.getTitle();
        System.out.println("driver.getTitle through chrome : " +getTitle);

        driver.close();
    }

}
