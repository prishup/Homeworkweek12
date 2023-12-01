package testsuite;

import browsefactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
   String baseUrl = "http://automationexercise.com";

    @Before
    // 1. Launch browser
    public void setUpOpenBrowser() {
        openBrowser(baseUrl);
    }
    @Test
   // Test Case 2: Login User with correct email and password
    public void testCase2(){

     //     3. Verify that home page is visible successfully
    boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();
     System.out.println(result);

     //     4. Click on 'Signup / Login' button
     driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]/a")).click();

     //     5. Verify 'Login to your account' is visiblU
    String actualResult =  driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
     System.out.println(actualResult);
     String expectedResult = "Login to your account";
     Assert.assertEquals(actualResult,expectedResult);

     //     6. Enter correct email address and password
     driver.findElement(By.xpath("//form[@action='/login']/input[2]")).sendKeys("kinjalshah210@yahoo.com"); //Enter emailaddress
     driver.findElement(By.xpath("//form[@action='/login']/input[3]")).sendKeys("123456"); //Enter Password

     //     7. Click 'login' button
     driver.findElement(By.xpath(" //form[@action='/login']/button")).click();

    //     8. Verify that 'Logged in as username' is visible
   String actualResult1 =  driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[10]/a")).getText();
     System.out.println(actualResult1);
     String expectedResult1 = "Logged in as kinjal";
     Assert.assertEquals(actualResult1,expectedResult1);

//     9. Click 'Delete Account' button
 //    driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[5]/a")).click();

////     10. Verify that 'ACCOUNT DELETED!' is visible
//    String actualResult2 = driver.findElement(By.xpath("//div[@class='col-sm-9 col-sm-offset-1']/h2/b")).getText();
//     System.out.println(actualResult2);
//     String expectedResult2 = "ACCOUNT DELETED!";
//     Assert.assertEquals(actualResult2,expectedResult2);

    }
    @Test
    public void  test3(){
     //     3. Verify that home page is visible successfully
    boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();
    System.out.println(result);

     //     4. Click on 'Signup / Login' button
     driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]/a")).click();

//     5. Verify 'Login to your account' is visible
     String actualResult =  driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
     System.out.println(actualResult);
     String expectedResult = "Login to your account";
     Assert.assertEquals(actualResult,expectedResult);

//     6. Enter incorrect email address and password
     driver.findElement(By.xpath("//form[@action='/login']/input[2]")).sendKeys("kin456@yahoo.com"); //incorrect email address
     driver.findElement(By.xpath("//form[@action='/login']/input[3]")).sendKeys("123456"); //password

//     7. Click 'login' button
     driver.findElement(By.xpath(" //form[@action='/login']/button")).click();

//     8. Verify error 'Your email or password is incorrect!' is visible
     String actualresult3 = driver.findElement(By.xpath("//form[@action='/login']/p")).getText();
     System.out.println(actualresult3);
     String expectedResult3 = "Your email or password is incorrect!";
     Assert.assertEquals(actualresult3,expectedResult3);
    }

    @Test
    public void test4(){
     //3. Verify that home page is visible successfully
     boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();
     System.out.println(result);

     //     4. Click on 'Signup / Login' button
     driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]/a")).click();

     //     5. Verify 'Login to your account' is visible
     String actualResult =  driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
     System.out.println(actualResult);
     String expectedResult = "Login to your account";
     Assert.assertEquals(actualResult,expectedResult);

     //     6. Enter correct email address and password
     driver.findElement(By.xpath("//form[@action='/login']/input[2]")).sendKeys("kinjalshah210@yahoo.com"); //Enter emailaddress
     driver.findElement(By.xpath("//form[@action='/login']/input[3]")).sendKeys("123456"); //Enter Password

     //     7. Click 'login' button
     driver.findElement(By.xpath(" //form[@action='/login']/button")).click();

     //     8. Verify that 'Logged in as username' is visible
     String actualResult1 =  driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[10]/a")).getText();
     System.out.println(actualResult1);
     String expectedResult1 = "Logged in as kinjal";
     Assert.assertEquals(actualResult1,expectedResult1);

     //9. Click 'Logout' button
     driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]/a")).click();

    }
    @Test
    public void test5(){
//     1. Launch browser
//     2. Navigate to url 'http://automationexercise.com'
//     3. Verify that home page is visible successfully
     boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();
     System.out.println(result);


//     4. Click on 'Signup / Login' button
     driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]/a")).click();

//     5. Verify 'New User Signup!' is visible
     String actualResult11 = driver.findElement(By.xpath("//div[@class='signup-form']/h2")).getText();
     System.out.println(actualResult11);
     String expectedResult11 = "New User Signup!";

//     6. Enter name and already registered email address
     driver.findElement(By.xpath("//form[@action='/signup']/input[2]")).sendKeys("kinjal"); //name
     driver.findElement(By.xpath("//form[@action='/signup']/input[3]")).sendKeys("kinjalshah210@yahoo.com"); //email address

//     7. Click 'Signup' button
     driver.findElement(By.xpath("//form[@action='/signup']/button")).click();

//     8. Verify error 'Email Address already exist!' is visible
    String actualResult12 =  driver.findElement(By.xpath("//form[@action='/signup']/p")).getText();
     System.out.println(actualResult12);
     String expectedResult ="Email Address already exist!";
    }

    @Test
    public void test6(){
//     1. Launch browser
//     2. Navigate to url 'http://automationexercise.com'
     //3. Verify that home page is visible successfully
     boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();
    System.out.println(result);

//     4. Click on 'Test Cases' button
     driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[5]/a")).click();

//     5. Verify user is navigated to test cases page successfully
    String actualResult6 =  driver.findElement(By.xpath("//h2[@class='title text-center']/b")).getText();
     System.out.println(actualResult6);
     String expectedResult6 = "TEST CASES";
     Assert.assertEquals(actualResult6,expectedResult6);

    }
    @Test
    public void test8(){
 //    1. Launch browser
 //    2. Navigate to url 'http://automationexercise.com'
 // 3. Verify that home page is visible successfully
     boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();
    System.out.println(result);

//     4. Click on 'Products' button
     driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[2]/a")).click();

//     5. Verify user is navigated to ALL PRODUCTS page successfully
    String actualResult8 = driver.findElement(By.xpath("//div[@class='features_items']/h2")).getText();
     System.out.println(actualResult8);
     String expectedResult8 = "ALL PRODUCTS";
     Assert.assertEquals(actualResult8,expectedResult8);

//     6. The products list is visible444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444z4444444444444444444e

//   7. Click on 'View Product' of first product
   driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();
//     8. User is landed to product detail page -skip

//    9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
    driver.findElement(By.xpath("//div[@class='product-information']/h2")).getText();   // productname
//
    driver.findElement(By.xpath("//div[@class='product-information']/p")).getText(); //categort
//
   driver.findElement(By.xpath("//div[@class='product-information']/span/span[1]")).getText();   //price
//
   driver.findElement(By.xpath("//div[@class='product-information']/p[2]")).getText();//Availability
//
    driver.findElement(By.xpath("//div[@class='product-information']/p[4]")).getText();//brand
    }

    @Test
    public void testcase9(){
//     1. Launch browser
//     2. Navigate to url 'http://automationexercise.com'
//     3. Verify that home page is visible successfully
     boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();
     System.out.println(result);

//     4. Click on 'Products' button
     driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[2]/a")).click();

//     5. Verify user is navigated to ALL PRODUCTS page successfully
     String actualResult9 = driver.findElement(By.xpath("//div[@class='features_items']/h2")).getText();
     System.out.println(actualResult9);
     String expectedResult9 = "ALL PRODUCTS";
     Assert.assertEquals(actualResult9,expectedResult9);

//     6. Enter product name in search input and click search button
     WebElement search = driver.findElement(By.xpath("//input[@id='search_product']"));
     search.sendKeys("tops");
     WebElement searchButton = driver.findElement(By.xpath("//button[@id='submit_search']"));
     searchButton.click();


//     7. Verify 'SEARCHED PRODUCTS' is visible
     String actualResult10 = driver.findElement(By.xpath("//h2[@class='title text-center']")).getText();
     System.out.println(actualResult10);
     String expectedResult10 = "SEARCHED PRODUCTS";
     Assert.assertEquals(actualResult10,expectedResult10);

//     8. Verify all the products related to search are visible
    }

    @After
    public void endTest(){
     // closeBrowser();
    }
}
