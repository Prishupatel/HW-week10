package barclays_CrossBrowser_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

    public static void main(String[] args) {

        String baseUrl="https://www.barclays.co.uk/";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        String getTitle= driver.getTitle();
        System.out.println(getTitle);
        driver.close();

    }
}
