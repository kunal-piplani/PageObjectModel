package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;

    @FindBy(id="user-name")
    WebElement username;
    @FindBy(id="password")
    WebElement password ;
    @FindBy(id="login-button")
    WebElement loginButton ;
    @FindBy(xpath="//title")
    WebElement titleText ;


public LoginPage(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver,this);
}

public void setUsername(String uName){
    username.click();
    username.sendKeys(uName);
}
    public void setPassword(String pass){
        password.click();
        password.sendKeys(pass);
    }

public void clickLogin(){
    loginButton.click();

}
public String verifyLoginTitle(){

    return titleText.getText();
}



}
