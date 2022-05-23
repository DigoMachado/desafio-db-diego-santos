package PageObject;

import Framework.TestBase;

public class BasePage {

    protected TestBase test;

    public BasePage(TestBase test)
    {
        this.test = test;
    }

    public <T extends BasePage> T createPage(java.lang.Class<T> type)
    {
        return test.createPage(type);
    }
}
