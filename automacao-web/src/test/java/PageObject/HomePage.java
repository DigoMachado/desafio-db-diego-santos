package PageObject;

import Framework.BasePage;
import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    protected String TITLE = "Bem vindo ao Site de Automação do Batista.";

    protected By title = By.cssSelector("//h5[contains(text(),'Bem vindo ao Site de Automação do Batista.')]");
    protected By collapsibleHeaderForm = By.xpath("//a[contains(text(),'Formulário')]");



    private WebDriver driver;
    private Waits waits;

    public HomePage(WebDriver driver)
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

    public void clickCollapsibleHeaderForm()
    {
        find(collapsibleHeaderForm).click();
    }

    public WebElement createUser()
    {
        return waits.visibilityOfElement(By.xpath("//a[contains(text(),'Criar Usuários')]"));
    }

    public void clickCreateUser()
    {
        createUser().click();
    }

}
