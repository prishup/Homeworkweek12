package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
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
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
       // click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div[2]/div[2]/form/div[4]/p")).click();
        //   * Verify the text ‘Reset Password’
    }
    @After
    public void endTest(){
      //  closeBrowser();
    }
}
