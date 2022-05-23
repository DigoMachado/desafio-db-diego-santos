package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage extends DriverManager{
    protected TestBase test;

    protected BasePage()
    {
        super();
    }
    public BasePage(TestBase test)
    {
        this.test = test;
    }

    public abstract void loadPage();

    public boolean isLoaded(){
        return false;
    }
    protected boolean isDisplayed(By locator)
    {
        try {
            WebElement el = find(locator);
            return el.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    protected WebElement find(By by)
    {
        return driver.findElement(by);
    }

    protected void fillField(By field, String value)
    {
        find(field).sendKeys(value);
    }


}
