package pom.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pom.pages.BasePage;
import pom.pages.DressResultPage;
import pom.pages.EbayHomePage;
import pom.pages.MobileResultPage;

public class EbayTest extends BaseTest{

    @Test
    public void searchMobileTest() throws InterruptedException {
        BasePage basePage = PageFactory.initElements(driver, BasePage.class);
        EbayHomePage ebayHomePage = basePage.initApp();
        ebayHomePage.fillSearchField("iphone");
        ebayHomePage.selectCategory("Cell Phones & Accessories");
        MobileResultPage mobileResultPage = ebayHomePage.clickSearchButton();
        mobileResultPage.clickOnApple();
    }

    @Test
    public void searchDressTest() throws InterruptedException {
        BasePage basePage = PageFactory.initElements(driver, BasePage.class);
        EbayHomePage ebayHomePage = basePage.initApp();
        ebayHomePage.fillSearchField("denim");
        ebayHomePage.selectCategory("Clothing, Shoes & Accessories");
        DressResultPage dressResultPage = ebayHomePage.clickSearchButton();
        dressResultPage.clickOnDress();
    }
}
