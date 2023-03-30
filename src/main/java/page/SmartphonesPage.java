package page;

import core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SmartphonesPage extends BasePage {
    Actions actions = new Actions(driver);
    private static SmartphonesPage instance;

    public SmartphonesPage(WebDriver webDriver) {
        super(webDriver);
    }

    public static SmartphonesPage getInstance(WebDriver webDriver) {
        if (instance == null)
            instance = new SmartphonesPage(webDriver);
        return instance;
    }

    @FindBy(xpath = "//span[contains(text(),'Samsung  ')]")
    private WebElement checkboxSamsungBrand;

    @FindBy(xpath = "//span[@class='ui-collapse__link-text'][text()='Объем встроенной памяти (ГБ)']")
    private WebElement sectionROM;

    @FindBy(xpath = "//input[@type='checkbox'][@class='ui-checkbox__input ui-checkbox__input_list'][@value='l6w97']")
    private WebElement checkboxROM256Gb;

    @FindBy(xpath = "//span[@class='top-filter__selected'][1]")
    private WebElement sortingDropdown;

    @FindBy(xpath = "//label[@class='ui-radio__item'][2]")
    private WebElement chooseRadiobuttonExpensiveFirst;

    @FindBy(xpath = "//a[@class='catalog-product__name ui-link ui-link_black']")
    private WebElement chooseFirstProductOnPage;

    @FindBy(xpath = "//button[@class='button-ui button-ui_brand']")
    private WebElement applyButtonWithAllFilters;

    @FindBy(xpath = "//div[@class='apply-filters-float-btn']")
    private WebElement chooseShowButton;

    @Step("Нажимаем на чекбокс 'Объем встроенной памяти (ГБ)'")
    public SmartphonesPage sectionROMClick() {
        actions.moveToElement(sectionROM).click().perform();
        return this;
    }

    @Step("Нажимаем в чекбоксе 'Объем встроенной памяти (ГБ)' на пункт '256 ГБ'")
    public SmartphonesPage checkboxROM256GbClick() {
        actions.moveToElement(checkboxROM256Gb).click().perform();
        return this;
    }

    @Step("Нажимаем на кнопку 'Применить")
    public SmartphonesPage applyButtonClick() {
        actions.moveToElement(chooseShowButton).click().perform();
        return this;
    }

    @Step("Нажимаем в радиобатоне Сортировки 'Сначала дорогие'")
    public SmartphonesPage chooseRadiobuttonExpensiveFirstClick() {
        actions.moveToElement(chooseRadiobuttonExpensiveFirst).click().perform();
        return this;
    }

    @Step("Нажимаем на первый продукт в списке")
    public SmartphonesPage firstProductClick() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", chooseFirstProductOnPage);
        return this;
    }

    @Step("Нажимаем на производителя 'Samsung'")
    public SmartphonesPage checkboxSamsungClick() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1700);", "");
        actions.moveToElement(checkboxSamsungBrand).click().perform();
        return this;
    }

    @Step("Нажимаем на сортировку")
    public SmartphonesPage sortingDropdownClick() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, -document.body.scrollHeight);", "");
        sortingDropdown.click();
        return this;
    }

}
