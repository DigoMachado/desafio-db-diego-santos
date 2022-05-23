package PageObject;

import Framework.BasePage;
import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewUserPage extends BasePage {
    protected String TITLE = "Novo Usuário!!";

    protected By title = By.className(".center");
    protected By userName = By.id("user_name");
    protected By userLastName = By.id("user_lastname");
    protected By userEmail = By.id("user_email");
    protected By userAddress = By.id("user_address");
    protected By userUniversity = By.id("user_university");
    protected By userGender = By.id("user_gender");
    protected By userAge = By.id("user_age");
    protected By buttonCreateUser = By.xpath("//body/div[2]/div[2]/div[3]/div[2]/form[1]/div[5]/div[1]/div[1]");
    protected By buttonBack = By.xpath("//a[contains(text(),'Voltar')]");

    private WebDriver driver;
    private Waits waits;

    public NewUserPage(WebDriver driver)
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
                isDisplayed(userName) &&
                isDisplayed(userLastName);
    }

    public NewUserPage typeUserName(String value)
    {
        fillField(userName, value);
        return this;
    }

    public NewUserPage typeUserLastName(String value)
    {
        fillField(userLastName, value);
        return this;
    }

    public NewUserPage typeUserEmail(String value)
    {
        fillField(userEmail, value);
        return this;
    }

    public NewUserPage typeUserAddress(String value)
    {
        fillField(userAddress, value);
        return this;
    }

    public void clickCreateAccout()
    {
        find(buttonCreateUser).click();
    }

}
