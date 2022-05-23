package PageObject;

import Framework.BasePage;
import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AccountCreatedPage extends BasePage {
    public String TITLE = "Usuário Criado com sucesso";

    protected By title = By.id("notice");

    private WebDriver driver;
    private Waits waits;

    public AccountCreatedPage(WebDriver driver)
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
        return  isDisplayed(title);
    }

    public String getTitleText()
    {
        return find(title).getText();
    }
    public boolean isDisplayedTitleText()
    {
        return isDisplayed(title);
    }
}
