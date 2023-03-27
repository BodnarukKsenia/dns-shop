package page;

import core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartPhonesAndGadgetsPage extends BasePage {
    private static SmartPhonesAndGadgetsPage instance;

    public SmartPhonesAndGadgetsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public static SmartPhonesAndGadgetsPage getInstance(WebDriver webDriver) {
        if (instance == null)
            instance = new SmartPhonesAndGadgetsPage(webDriver);
        return instance;
    }

    @FindBy(xpath = "//*[@href='/catalog/17a8a01d16404e77/smartfony/']")
    private WebElement smartphones;

    @Step("Нажимаем на кнопку 'Смартфоны'")
    public void smartphonesClick() {
        smartphones.click();
    }
}
