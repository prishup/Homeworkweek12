package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

        String baseUrl ="http://the-internet.herokuapp.com/login";
        @Before
        public void setUpOpenBrowser() {
            openBrowser(baseUrl);
        }

    @Test
    public void UserSholdLoginSuccessfullyWithValidCredentials(){
           // * Enter “tomsmith” username
        driver.findElement(By.id("username")).sendKeys("tomsmith");

              //  * Enter “SuperSecretPassword!” password
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
             //   * Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//form[@name='login']/button/i[1]")).click();
             //   * Verify the text “Secure Area”
      String actualResult =  driver.findElement(By.xpath("//div[@class='example']/h2")).getText();
        System.out.println(actualResult);
       String expectedResult = "Secure Area";
        Assert.assertEquals(actualResult,expectedResult);
    }

  @Test
    public void verifyTheUsernameErrorMessage(){
       //  * Enter “tomsmith1” username
        driver.findElement(By.id("username")).sendKeys("tomsmith1");         //    * Enter “SuperSecretPassword!” password
       driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

            //  * Click on ‘LOGIN’ button
      driver.findElement(By.xpath("//form[@name='login']/button/i[1]")).click();

            //   * Verify the error message “Your username is invalid!”
       String actualResult = driver.findElement(By.id("flash")).getText();
      System.out.println(actualResult);

      String expectedResult = "Your username is invalid!\n"+
"×";

      Assert.assertEquals(actualResult,expectedResult);
   }
 @Test
   public void verifyThePasswordErrorMessage(){
          // * Enter “tomsmith” username
     driver.findElement(By.id("username")).sendKeys("tomsmith");

             //  * Enter “SuperSecretPassword” password
       driver.findElement(By.id("password")).sendKeys("SuperSecretPassword");

          //   * Click on ‘LOGIN’ button
       driver.findElement(By.xpath("//form[@name='login']/button/i[1]")).click();

           //  * Verify the error message “Your password  is invalid!\n +

      String actualResult = driver.findElement(By.id("flash")).getText();
      System.out.println(actualResult);
     String expectedResult = "Your password is invalid!\n"+
"×";
//   Assert.assertEquals(actualResult,expectedResult);
   }
    @After
    public void endTest(){
         //   closeBrowser();
    }

}
