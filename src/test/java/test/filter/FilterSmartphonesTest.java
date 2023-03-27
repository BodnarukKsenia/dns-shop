package test.filter;

import core.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Epic(value = "Service")
@Feature(value = "Фильтр смартфонов")
public class FilterSmartphonesTest extends BaseTest {

    @Test(description = "Тест")
    public void checkingSamsung256GBTest() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(mainPage.smartphonesAndPhotoTechIsDisplayed(), "Элемент отсутствует");
        mainPage.smartphonesAndPhotoTechClick();
        smartPhonesAndPhotoTechPage.smartphonesAndGadgetsClick();
        smartPhonesAndGadgetsPage.smartphonesClick();
        smartphonesPage.checkboxSamsungClick();
        smartphonesPage.sectionROMClick();
        smartphonesPage.checkboxROM256GbClick();
        smartphonesPage.applyButtonClick();
        smartphonesPage.chooseRadiobuttonExpensiveFirstClick();
        productPage.expandAllCharacteristicsButtonClick();
        softAssert.assertTrue(productPage.checkingModelCharacteristics().contains("Samsung"),
                "Модель продукта не соответствует");
        softAssert.assertAll();

    }
}
