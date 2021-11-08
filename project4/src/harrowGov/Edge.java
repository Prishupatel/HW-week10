package harrowGov;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
        String baseUrl="https://www.harrow.gov.uk/";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.close();


    }

}
