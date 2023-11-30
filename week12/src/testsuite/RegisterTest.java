package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {
    String baseUrl ="https://demo.nopcommerce.com/";
    @Before
    public void setUpOpenBrowser() {

        openBrowser(baseUrl);
    }
    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully(){
       // * click on the ‘Register’ link
        driver.findElement(By.className("ico-register")).click();

        //  * Verify the text ‘Register’
        String actualResult = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        System.out.println(actualResult);
        String expectedResult = "Register";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //  Click on the ‘Register’ link
        driver.findElement(By.xpath("//div[@class='header-links-wrapper']/div/ul/li/a")).click();

           //  * Select gender radio button
        driver.findElement(By.xpath("//div[@class='page-body']/form/div/div[2]/div/div/span[2]/input")).click();

        //Enter First name
        driver.findElement(By.id("FirstName")).sendKeys("Kinjal");

        //* Enter Last name
        driver.findElement(By.xpath("//div[@class='center-1']/div/div[2]/form /div/div[2]/div[3]/input")).sendKeys("Shah");
        //* Select Day Month and Year

        //* Enter Email address
        driver.findElement(By.xpath("//div[@class='center-1']/div/div[2]/form /div/div[2]/div[5]/input")).sendKeys("kinjalshah2@yahoo.com");

       //  * Enter Password
        driver.findElement(By.id("Password")).sendKeys("123846");

        // * Enter Confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123846");

       //* Click on REGISTER button
        driver.findElement(By.id("register-button")).click();

        //* Verify the text 'Your registration completed’
        String actualResult = driver.findElement(By.className("result")).getText();
        System.out.println(actualResult);
        String expectedResult = "Your registration completed";
        Assert.assertEquals(actualResult,expectedResult);

    }
    @After
    public void endTest(){
        // closeBrowser();
    }

    }
