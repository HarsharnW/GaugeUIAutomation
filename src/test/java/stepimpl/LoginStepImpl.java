package stepimpl;

import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import util.Driver;

public class LoginStepImpl
{
    WebDriver driver = Driver.driver;

    LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);

    @Step("Input username <username>")
    public void setUsername(String username)
    {
        loginPage.setUsername(username);
    }

    @Step("Input password <password>")
    public void setPassword(String password)
    {
        loginPage.setPassword(password);
    }

    @Step("Click SignIn button")
    public void clickSignInButton()
    {
        loginPage.clickLoginBtn();
    }

    @Step("Login error is visible")
    public void verifyLoginError()
    {
        Assert.assertTrue(loginPage.isLoginErrorVisible());
    }
}
