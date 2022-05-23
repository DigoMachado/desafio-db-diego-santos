package TestCases;

import Framework.Report;
import Framework.ReportType;
import Framework.TestBase;
import PageObject.*;
import Utils.FakerGenerator;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Assertions;

public class CreateAccountTest extends TestBase {
    private WebDriver driver = getDriver();
    private FrontPage frontPage = new FrontPage(driver);
    private HomePage homePage = new HomePage(driver);
    private NewUserPage newUserPage = new NewUserPage(driver);
    private AccountCreatedPage accountCreatedPage = new AccountCreatedPage(driver);


    @Test
    public void TestCreateAccount() throws Exception
    {
        frontPage.clickButtonWebAutomation();
        homePage.clickCollapsibleHeaderForm();
        homePage.clickCreateUser();
        newUserPage.typeUserName(FakerGenerator.getFirstName())
                .typeUserLastName(FakerGenerator.getLastName())
                .typeUserEmail(FakerGenerator.getEmailAddress())
                .typeUserAddress(FakerGenerator.getAddress())
                .clickCreateAccout();

        Assertions.assertEquals(accountCreatedPage.TITLE, accountCreatedPage.getTitleText());
        Assertions.assertTrue(accountCreatedPage.isDisplayedTitleText());
        Report.createTest("Account created", ReportType.SINGLE);
    }

}
