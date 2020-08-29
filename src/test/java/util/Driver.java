package util;

import com.maxsoft.webdrivermanager.driver.DriverFactory;
import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;

public class Driver
{
    public static WebDriver driver;

    @BeforeScenario
    public void before()
    {
        driver = DriverFactory.getDriver(BrowserType.CHROME);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @AfterScenario
    public void after()
    {
        driver.quit();
    }

}
