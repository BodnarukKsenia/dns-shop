package page;

import core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartPhonesAndPhotoTechPage extends BasePage {

    private static SmartPhonesAndPhotoTechPage instance;

    public SmartPhonesAndPhotoTechPage(WebDriver webDriver) {
        super(webDriver);
    }

    public static SmartPhonesAndPhotoTechPage getInstance(WebDriver webDriver) {
        if (instance == null)
            instance = new SmartPhonesAndPhotoTechPage(webDriver);
        return instance;
    }

    @FindBy(xpath = "//*[@href='/catalog/af47fe7c3bae7fd7/smartfony-i-gadzhety/']")
    private WebElement smartphonesAndGadgets;

    @Step("Нажимаем на кнопку 'Смартфоны и гаджеты'")
    public void smartphonesAndGadgetsClick() {
        smartphonesAndGadgets.click();
    }
}
