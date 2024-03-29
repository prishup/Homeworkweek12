package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl ="https://demo.nopcommerce.com/";
    @Before
    public void setUpOpenBrowser(){
        openBrowser(baseUrl);

    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //Click on the ‘Login’ link
        driver.findElement(By.className("ico-login")).click();

        // Verify the text ‘Welcome, Please Sign In!’
       String actualResult = driver.findElement(By.xpath("//div[@class='page login-page']/div/h1")).getText();
        System.out.println(actualResult);
       String expectedResult = "Welcome, Please Sign In!" ;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
//       click on the ‘Login’ link
        driver.findElement(By.className("ico-login")).click();

//        Enter valid username
        driver.findElement(By.className("email")).sendKeys("kinjalshah210@yahoo.com");
//          Enter valid password
       driver.findElement(By.id("Password")).sendKeys("123456");
//        Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//div[@class='customer-blocks']/div[2]/form/div[3]/button")).click();
//         Verify the ‘Log out’ text is display
        driver.findElement(By.className("ico-logout")).getText();

    }

    @Test
    public void verifyTheErrorMessage(){
//   click on the ‘Login’ link
       driver.findElement(By.className("ico-login")).click();

//    Enter invalid username
        driver.findElement(By.className("email")).sendKeys("kinjals10@yahoo.com");

//    Enter invalid password
        driver.findElement(By.id("Password")).sendKeys("1k56");

//    Click on Login button
        driver.findElement(By.xpath("//div[@class='customer-blocks']/div[2]/form/div[3]/button")).click();

//    Verify the error message
        String actualResult = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        System.out.println(actualResult);
        String expectedResult = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @After
    public void endTest(){
       // closeBrowser();
    }
}
