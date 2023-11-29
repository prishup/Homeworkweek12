package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl ="https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUpOpenBrowser() {
        openBrowser(baseUrl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
//        * Enter “Admin” username
      driver.findElement(By.name("username")).sendKeys("Admin");
//                * Enter “admin123“ password
        driver.findElement(By.name("password")).sendKeys("admin123");
//                * Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

//      * Verify the ‘Dashboard’ text is display
//       String actualResult =  driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[8]/a/span")).getText();
//        System.out.println(actualResult);
//        String expectedResult = "Dashboard";
//        Assert.assertEquals(actualResult,expectedResult);
    }
    @After
    public void endTest(){
       // closeBrowser();
    }

}
