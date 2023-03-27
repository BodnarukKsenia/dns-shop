package page;

import core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartphonesPage extends BasePage {

    private static SmartphonesPage instance;

    public SmartphonesPage(WebDriver webDriver) {
        super(webDriver);
    }
    public static SmartphonesPage getInstance(WebDriver webDriver) {
        if (instance == null)
            instance = new SmartphonesPage(webDriver);
        return instance;
    }
    @FindBy(xpath = "//label[@class='ui-checkbox ui-checkbox_list']/input[@value='samsung']")
    private WebElement checkboxSamsungBrand;

    @FindBy(xpath = "//span[@class='ui-collapse__link-text'][text()='Объем встроенной памяти (ГБ)']")
    private WebElement sectionROM;

    @FindBy(xpath = "//input[@type='checkbox'][@class='ui-checkbox__input ui-checkbox__input_list'][@value='l6w97']")
    private WebElement checkboxROM256Gb;

    @FindBy(xpath = "//button[@class='button-ui button-ui_brand left-filters__button']")
    private WebElement applyButton;

    @FindBy(xpath = "//span[@class='top-filter__selected']")
    private WebElement sortingDropdown;

    @FindBy(xpath = "//span[@data-gtm-vis-first-on-screen-32166084_1800='2244627']")
    private WebElement chooseRadiobuttonExpensiveFirst;

    @FindBy(xpath = "//a[@class='catalog-product__name ui-link ui-link_black'][1]")
    private WebElement chooseFirstProductOnPage;

    @Step("Нажимаем на чекбокс 'Объем встроенной памяти (ГБ)'")
    public void sectionROMClick() {
        sectionROM.click();
    }

    @Step("Нажимаем в чекбоксе 'Объем встроенной памяти (ГБ)' на пункт '256 ГБ'")
    public void checkboxROM256GbClick() {
        checkboxROM256Gb.click();
    }

    @Step("Нажимаем на кнопку 'Применить")
    public void applyButtonClick() {
        applyButton.click();
    }

    @Step("Нажимаем в радиобатоне Сортировки 'Сначала дорогие'")
    public void chooseRadiobuttonExpensiveFirstClick() {
        chooseRadiobuttonExpensiveFirst.click();
    }

    @Step("Нажимаем на первый продукт в списке")
    public void firstProductClick() {
        chooseFirstProductOnPage.click();
    }

    @Step("Нажимаем на производителя 'Samsung'")
    public void checkboxSamsungClick() {
        checkboxSamsungBrand.click();
    }

}
