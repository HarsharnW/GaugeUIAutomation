package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage
{

    @FindBy(name = "email")
    WebElement userNameTextBox;

    @FindBy(name = "passwd")
    WebElement passwordTextBox;

    @FindBy(name = "SubmitLogin")
    WebElement submitButton;

    @FindBy(xpath = "//p[contains(text(),'There is 1 error')]")
    WebElement loginErrorLbl;



    public LoginPage()                      //initializing the driver using the Constructor
    {
        PageFactory.initElements(driver,this);
    }

    public void setUsername(String userName)
    {
        userNameTextBox.sendKeys(userName);
    }

    public void setPassword(String password)
    {
        passwordTextBox.sendKeys(password);
    }

    public void clickLoginBtn()
    {
        submitButton.click();
    }

    public boolean isLoginErrorVisible()
    {
        return loginErrorLbl.isDisplayed();
    }


}
