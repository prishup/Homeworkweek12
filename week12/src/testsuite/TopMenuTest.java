package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {

    String baseUrl ="https://demo.nopcommerce.com/";
    @Before
    public void setUpOpenBrowser(){
        openBrowser(baseUrl);
    }
   @Test
   public void userShouldNavigateToComputerPageSuccessfully(){
//         click on the ‘Computers’ Tab
      driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a")).click();
//        Verify the text ‘Computers’
       String actualResult = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a")).getText();
       System.out.println(actualResult);
       String expectedResult = "Computers";
       Assert.assertEquals(actualResult,expectedResult);

   }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
       // * click on the ‘Electronics’ Tab
       driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]/a")).click();

       //* Verify the text ‘Electronics’
       String actualResult =  driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]/a")).getText();
        System.out.println(actualResult);
        String expectedResult = "Electronics";
        Assert.assertEquals(actualResult,expectedResult);
    }

 @Test
   public void userShouldNavigateToApparelPageSuccessfull(){
     //      * click on the ‘Apparel’ Tab
       driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]/a")).click();
      //      * Verify the text ‘Apparel’
       String actualResult = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]/a")).getText();
     System.out.println(actualResult);
     String expectedResult = "Apparel";
     Assert.assertEquals(actualResult,expectedResult);
   }

   @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull(){
      // click on the ‘Digital downloads’ Tab
       driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]/a")).click();
           //    * Verify the text ‘Digital downloads’
      String actualResult =  driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]/a")).getText();
       System.out.println(actualResult);
       String expextedResult = "Digital downloads";
       Assert.assertEquals(actualResult,expextedResult);

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
       // * click on the ‘Books’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[5]/a")).click();
             //   * Verify the text ‘Books’
       String actualReslult =  driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[5]/a")).getText();
        System.out.println(actualReslult);
        String expectedResult = "Books";
        Assert.assertEquals(actualReslult,expectedResult);

    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
       // * click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]/a")).click();
              //  * Verify the text ‘Jewelry’
        String actualReslult = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]/a")).getText();
        System.out.println(actualReslult);
        String expectedResult = "Jewelry";
        Assert.assertEquals(actualReslult,expectedResult);

    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull(){
       // * click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]/a")).click();
         //       * Verify the text ‘Gift Cards’
        String actualResult = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]/a")).getText();
        System.out.println(actualResult);
        String expectedResult = "Gift Cards";
        Assert.assertEquals(actualResult,expectedResult);

    }
    @After
    public void endTest(){
      //  closeBrowser();
    }
}

