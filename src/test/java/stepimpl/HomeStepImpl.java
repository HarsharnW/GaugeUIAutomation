package stepimpl;

import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import util.Driver;

public class HomeStepImpl
{
    WebDriver driver = Driver.driver;

    HomePage homePage = PageFactory.initElements(driver,HomePage.class);

    @Step("Logged in username is <username>")
    public void verifyLoggedInUsername(String username)
    {
        Assert.assertEquals(username, homePage.getLoggedInUsername());
    }
}
