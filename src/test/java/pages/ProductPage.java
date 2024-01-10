package pages;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    WebDriver driver;
    @FindBy(id="login-button")
    WebElement loginButton;
    @FindBy(className = "app_logo")
        WebElement appLogo;
    @FindBy(xpath="//*[@class='title']")
        WebElement sideBarText;
    @FindBy(xpath="/html/head/title")
        WebElement  titleText;

    public ProductPage(WebDriver driver){
    this.driver = driver;
        PageFactory.initElements(driver,this);

    }

public void verifyAppLogo(String data){

    Assert.assertEquals(data,appLogo.getText());
    }
public void verifyTitle(String data){
    Assert.assertEquals(data,driver.getTitle());
    }

public void verifyVerifySideBarText(String data){
        Assert.assertEquals(data, sideBarText.getText());
    }
public void verifyALLProductData(){

int size = driver.findElements(By.xpath("//*[@id='inventory_container']/div/div[4]/div[2]/div[1]/a/div")).size();
    String productArray[]= {
            "Sauce Labs Backpack","Sauce Labs Bike Light","Sauce Labs Bolt T-Shirt","Sauce Labs Fleece Jacket",
            "Sauce Labs Onesie", "Test.allTheThings() T-Shirt (Red)"};

int m=1;
for(int i=0;i<size;i++){

    System.out.println(driver.findElement(By.xpath("//*[@id='inventory_container']/div/div["+m+"]/div[2]/div[1]/a/div")).getText());
    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='inventory_container']/div/div["+m+"]/div[2]/div[1]/a/div")).getText(),productArray[i]);
m++;
}

}

}
