package page;

import core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage{
    private static MainPage instance;

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public static MainPage getInstance(WebDriver webDriver) {
        if (instance == null)
            instance = new MainPage(webDriver);
        return instance;
    }
    @FindBy(xpath = "//*[@href='/catalog/17a890dc16404e77/smartfony-i-fototexnika/']")
    private WebElement smartphonesAndPhotoTech;

    @Step("Нажимаем на кнопку 'Смартфоны и фототехника'")
    public boolean smartphonesAndPhotoTechIsDisplayed() {
        return smartphonesAndPhotoTech.isDisplayed();
    }
    @Step("Нажимаем на кнопку 'Смартфоны и фототехника'")
    public void smartphonesAndPhotoTechClick() {
        smartphonesAndPhotoTech.click();
    }
}
