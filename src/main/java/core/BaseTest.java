package core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import page.*;

import static core.CommonActions.initialisation;

public class BaseTest {

    protected WebDriver driver;
    protected MainPage mainPage;
    protected  SmartPhonesAndPhotoTechPage smartPhonesAndPhotoTechPage;
    protected SmartPhonesAndGadgetsPage smartPhonesAndGadgetsPage;
    protected SmartphonesPage smartphonesPage;
    protected ProductPage productPage;


    @BeforeClass
    public void setUp() {
        driver = initialisation();
        mainPage = MainPage.getInstance(driver);
        smartPhonesAndPhotoTechPage = SmartPhonesAndPhotoTechPage.getInstance(driver);
        smartPhonesAndGadgetsPage = SmartPhonesAndGadgetsPage.getInstance(driver);
        smartphonesPage = SmartphonesPage.getInstance(driver);
        productPage = ProductPage.getInstance(driver);
        driver.get("https://www.dns-shop.ru/");
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
