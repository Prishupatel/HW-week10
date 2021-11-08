package nopcommerce_CrossBrowser_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class NopCom {

    public static void chromeBrowser() {

        String baseUrl = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        String getTitle = driver.getTitle();
        System.out.println("driver.getTitle through chrome : "+getTitle);
        driver.close();


    }

    public static void msEdgeBrowser() {

        String baseUrl = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        String getTitle = driver.getTitle();
        System.out.println("driver.getTitle through msEdge: " + getTitle);
        driver.close();
    }

    public static void operaBrowser() {
        String baseUrl = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.opera.driver", "driver/operadriver.exe");
        WebDriver driver = new OperaDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        String getTitle = driver.getTitle();
        System.out.println("driver.getTitle through opera : " + getTitle);
        driver.close();
    }

    public static void fireFoxBrowser(){

        String baseUrl="https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        String getTitle=driver.getTitle();
        System.out.println("driver.getTitle through fireFox : " +getTitle);
        driver.close();
    }


    public static void main(String[] args) {
        chromeBrowser();
        msEdgeBrowser();
        operaBrowser();
        fireFoxBrowser();
    }
}
