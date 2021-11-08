package nopcommerce_CrossBrowser_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class MultiBrowserTest {
    static String browser = "opera";
    static String baseUrl = "https://demo.nopcommerce.com/";
    static WebDriver driver;

    public static void main(String args[]) {
        if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("edge")) {

            System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
            driver = new EdgeDriver();


        } else if (browser.equalsIgnoreCase("Opera")) {

            System.setProperty("webdriver.opera.driver", "driver/operadriver.exe");
            driver = new OperaDriver();


        } else if (browser.equalsIgnoreCase("Firefox")) {


            System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
            driver = new FirefoxDriver();


        } else {
            System.out.println("Wrong browser Selected");

        }

        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.close();


    }


}
