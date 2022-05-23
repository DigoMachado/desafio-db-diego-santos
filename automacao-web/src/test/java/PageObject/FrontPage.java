package PageObject;

import Framework.BasePage;
import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrontPage extends BasePage {
    protected String TITLE = "Site para Automação";
    protected String WEB_AUTOMATION = "Automação de Web";

    protected By title = By.xpath("//h4[contains(text(),'Site para Automação')]");
    protected By buttonWebAutomation = By.xpath("//a[contains(text(),'Começar Automação Web')]");

    private WebDriver driver;
    private Waits waits;

    public FrontPage(WebDriver driver)
    {
        this.driver = driver;
        waits = new Waits(driver);
    }

    @Override
    public void loadPage()
    {
        waits.visibilityOfElement(title);
    }
    @Override
    public boolean isLoaded() {
        return  isDisplayed(title) &&
                isDisplayed(buttonWebAutomation);
    }

    public void clickButtonWebAutomation()
    {
        find(buttonWebAutomation).click();

    }
}
