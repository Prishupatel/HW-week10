package harrowGov;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

    public static void main(String[] args) {
        String baseUrl="https://www.harrow.gov.uk/";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        String getTitle= driver.getTitle();
        System.out.println("getTitle from Google chrome :" +getTitle);
        driver.close();
    }
}
