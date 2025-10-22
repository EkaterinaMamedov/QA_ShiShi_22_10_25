package ui_tests;

import manager.AppManager;
import org.testng.annotations.Test;
import pages.HomePage;

public class StartUITests extends AppManager {

    @Test
    public void startUITest(){
        HomePage homePage = new HomePage(getDriver());
    }
}
