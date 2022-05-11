package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    //object repository
    //these are our instance variables because not inside method or static keyword:
    @FindBy(id="txtUsername")
    public WebElement usernameBox;

    @FindBy(name="txtPassword")
    public WebElement passwordBox;

    @FindBy(id="btnLogin")
    public WebElement loginBtn;

    //this is a constructor not a method (same name as class name)
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
}
