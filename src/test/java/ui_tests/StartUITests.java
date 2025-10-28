package ui_tests;

import manager.AppManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage.*;
import pages.HomePage;
import pages.ru_pages.RuEventsPage;
import pages.en_pages.*;
import utils.enums.HeaderMenuItemsEn;
import utils.enums.HeaderMenuItemsRu;

import static pages.BasePage.*;

public class StartUITests extends AppManager {

    @Test
    public void startUITest(){
        HomePage homePage = new HomePage(getDriver());
        pause(20);
        RuEventsPage ruEventsPage = clickRuHeaderBtn(HeaderMenuItemsRu.EVENTS);
    }
    @Test
    public void HeaderMenuItemsEnTest(){
        HomePage homePage = new HomePage(getDriver());
        pause(5);
        EnHomePage enHomePage = clickRuHeaderBtn(HeaderMenuItemsRu.BTN_CHANGE_LANGUAGE_EN);
        EnAboutUsPage enAboutUsPage = clickEnHeaderBtn(HeaderMenuItemsEn.ABOUT_US);
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://en.shishi.co.il/about");

        EnContactsPage enContactsPage = clickEnHeaderBtn(HeaderMenuItemsEn.CONTACTS);
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://en.shishi.co.il/contacts");
        enHomePage = clickEnHeaderBtn(HeaderMenuItemsEn.BTN_CHANGE_LANGUAGE_RU);
       // Assert.assertEquals(getDriver().getCurrentUrl(),"https://shishi.co.il/");
    }
}
