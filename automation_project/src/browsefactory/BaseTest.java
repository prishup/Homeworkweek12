package browsefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public static WebDriver driver;

    public void openBrowser(String baseurl){
        driver = new ChromeDriver();  //object to use chrome browser
        driver.get(baseurl);
        driver.manage().window().maximize(); //to maximum page
    }
    public void closeBrowser(){
        driver.quit();
    }
}
