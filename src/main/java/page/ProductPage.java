package page;

import core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    private static ProductPage instance;
    Actions actions = new Actions(driver);

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public static ProductPage getInstance(WebDriver webDriver) {
        if (instance == null)
            instance = new ProductPage(webDriver);
        return instance;
    }
    @FindBy(xpath = "//button[@class='button-ui button-ui_white product-characteristics__expand']")
    private WebElement expandAllCharacteristicsButton;

    @FindBy(xpath = "//div[@class='product-characteristics__spec-value'][contains(text(),'Samsung ')]")
    private WebElement modelCharacteristics;

    @FindBy(xpath = "//div[@class='product-characteristics__spec-value'][contains(text(), '256 ГБ')]")
    private WebElement ROMCharacteristics;
    @FindBy(xpath = "//div[@class='product-card-top product-card-top_full']")
    private WebElement productCard;

    @Step("Нажимаем на кнопку 'Развернуть все'")
    public ProductPage expandAllCharacteristicsButtonClick() {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,700)", "");
        actions.moveToElement(expandAllCharacteristicsButton).click().perform();
        return  this;
    }

    @Step("Проверяем отображение карты продукта")
    public boolean productCardIsDisplayed() {
        return productCard.isDisplayed();

    }

    @Step("Проверяем соответствие производителя")
    public String checkingBrandCharacteristics() {
        return modelCharacteristics.getText();
    }

    @Step("Проверяем соответствие Объем встроенной памяти")
    public String checkingROMCharacteristics() {
        return ROMCharacteristics.getText();
    }
}
