package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver ldriver;

    public LoginPage(WebDriver rdriver){

       ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
     @FindBy(id ="Email")
    WebElement email;

    @FindBy(id="Password")
    WebElement password;

    @FindBy(xpath="//button[@type='submit']")
    WebElement LoginBtn;

    @FindBy(linkText = "Logout")
    WebElement logout;

    public void enteremail(String emailAdd){
        email.clear();
        email.sendKeys(emailAdd);
    }
    public void enterPassword(String pwd)
    {
        password.clear();
        password.sendKeys(pwd);
    }
    public void clickOnLoginButton()
    {
        LoginBtn.click();
    }
    public void clickOnLogOutButton()
    {
        logout.click();
    }
}
