package harrowGov;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Opera {

    public static void main(String[] args) {
        String baseUrl="https://www.harrow.gov.uk/";
        System.setProperty("webdriver.opera.driver","driver/operadriver.exe");
        WebDriver driver= new OperaDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        String gettitle=driver.getTitle();
        System.out.println("getTitle through Opera : " +gettitle);
        driver.close();
    }
}
