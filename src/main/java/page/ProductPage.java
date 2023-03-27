package page;

import core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    private static ProductPage instance;

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public static ProductPage getInstance(WebDriver webDriver) {
        if (instance == null)
            instance = new ProductPage(webDriver);
        return instance;
    }
    @FindBy(xpath = "//button[@class='button-ui button-ui_white product-characteristics__expand")
    private WebElement expandAllCharacteristicsButton;

    @FindBy(xpath = "//div[@id='pcv-G7jtS'][@class='product-characteristics__spec-value']")
    private WebElement modelCharacteristics;

    @Step("Нажимаем на кнопку 'Развернуть все'")
    public void expandAllCharacteristicsButtonClick() {
        expandAllCharacteristicsButton.click();
    }

    @Step("Проверяем соответствие модели 'Samsung'")
    public String checkingModelCharacteristics() {
        return modelCharacteristics.getText();
    }
}
