package test.filter;

import core.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Epic(value = "Smartphones")
@Feature(value = "Smartphones Filter")
public class FilterSmartphonesTest extends BaseTest {

    @Test(description = "Smartphones filter: Samsung, ROM: 256 GB")
    public void checkingSamsung256GBTest() {

        SoftAssert softAssert = new SoftAssert();
        mainPage.smartphonesAndPhotoTechClick();
        smartPhonesAndPhotoTechPage.smartphonesAndGadgetsClick();
        smartPhonesAndGadgetsPage.smartphonesWaiting();
        smartPhonesAndGadgetsPage.smartphonesClick();
        smartphonesPage.checkboxSamsungClick();
        smartphonesPage.sectionROMClick();
        smartphonesPage.checkboxROM256GbClick();
        smartphonesPage.applyButtonClick();
        smartphonesPage.sortingDropdownClick();
        smartphonesPage.chooseRadiobuttonExpensiveFirstClick();
        smartphonesPage.firstProductClick();
        softAssert.assertTrue(productPage.productCardIsDisplayed(), "Product page is not open");
        productPage.expandAllCharacteristicsButtonClick();
        softAssert.assertTrue(productPage.checkingBrandCharacteristics().contains("Samsung "),
                "Product model is not Samsung");
        softAssert.assertTrue(productPage.checkingROMCharacteristics().contains("256 ГБ"),
                "Product ROM is not 256 GB");
        softAssert.assertAll();
    }
}
