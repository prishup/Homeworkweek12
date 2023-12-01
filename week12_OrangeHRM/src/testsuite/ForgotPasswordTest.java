package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl ="https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUpOpenBrowser() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() throws InterruptedException {
       // click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div[2]/div[2]/form/div[4]/p")).click();

        //   * Verify the text ‘Reset Password’
        Thread.sleep(5000);
        String actualResult = driver.findElement(By.xpath("//div[@class='orangehrm-card-container']/form/h6")).getText();
        System.out.println(actualResult);
        String expectedResult = "Reset Password";
        Assert.assertEquals(actualResult,expectedResult);

    }
    @After
    public void endTest(){
      //  closeBrowser();
    }
}
