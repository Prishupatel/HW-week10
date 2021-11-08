package harrowGov;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class MultiBrowserTest {
    static String browser="";
    static String baseUrl="https://www.harrow.gov.uk/";
    static WebDriver driver;

    public static void myMethod(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
            driver=new ChromeDriver();
        }else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
            driver=new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("opera")){
            System.setProperty("webdriver.opera.driver","driver/operadriver.exe");
            driver=new OperaDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
            driver=new FirefoxDriver();
        }else {
            System.out.println("Browser not found");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.close();
    }

    public static void main(String[] args) {
        myMethod("firefox");
    }
}
