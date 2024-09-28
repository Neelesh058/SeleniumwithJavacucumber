package stepDefination;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.Assert;
import pageObject.LoginPage;

public class Steps {


    public WebDriver driver;
    public LoginPage lp;
    @Given("User Launch Chrome browser")
    public void user_launch_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        lp=new LoginPage(driver);

    }
    @When("User opens URL {string}")
    public void user_opens_url(String url) {

   driver.get(url);
    }
    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String emailAdd, String pwd) {
        lp.enteremail(emailAdd);
        lp.enterPassword(pwd);

    }
    @When("Click on Login")
    public void click_on_login() {
        lp.clickOnLoginButton();

    }
    @Then("Page Title should be {string}")
    public void page_title_should_be(String expectedTitle) {
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle))
        {

            Assert.assertTrue(true);//pass
        }
        else
        {
            Assert.assertTrue(false);//fail



        }

    }
    @When("User click on Log out link")
    public void user_click_on_log_out_link() {
        lp.clickOnLogOutButton();

    }

    @Then("close browser")
    public void close_browser() {
        driver.close();

    }
}
