package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;
    ProductPage productPage;
@BeforeTest
    public void setup(){
    System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
      driver = new ChromeDriver();
      driver.get("https://www.saucedemo.com/");
}
@Test
public void Login(){

    loginPage = new LoginPage(driver);
    loginPage.setUsername("standard_user");
    loginPage.setPassword("secret_sauce");
    loginPage.clickLogin();
    System.out.println(loginPage.verifyLoginTitle());



}

@Test
    public void ProductPage(){
    productPage = new ProductPage(driver);
    productPage.verifyAppLogo("Swag Labs");
    productPage.verifyTitle("Swag Labs");
    productPage.verifyVerifySideBarText("Products");
    productPage.verifyALLProductData();

}




}
