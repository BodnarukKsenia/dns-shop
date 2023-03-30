package page;

import core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SmartPhonesAndGadgetsPage extends BasePage {
    private static SmartPhonesAndGadgetsPage instance;

    private SmartPhonesAndGadgetsPage(WebDriver webDriver) {
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
    public SmartPhonesAndGadgetsPage smartphonesClick() {
        smartphones.click();
        return this;
    }
    @Step("Ожидаем кнопку 'Смартфоны'")
    public SmartPhonesAndGadgetsPage smartphonesWaiting() {
        waitWebElement(smartphones);
        return this;
    }
    public WebElement waitWebElement(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
