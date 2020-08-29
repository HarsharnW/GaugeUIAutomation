package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
    @FindBy(xpath = "//a[@class='account']/span")
    WebElement loggedInUsernameLbl;

    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }

    public String getLoggedInUsername()
    {
        return loggedInUsernameLbl.getText();
    }
}
