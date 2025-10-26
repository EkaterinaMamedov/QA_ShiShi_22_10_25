package utils.enums;

public enum HeaderMenuItemsEn {
    ABOUT_US("//ul[@class='vertical medium-horizontal menu align-right show-for-medium show-for-large']//a[@title='About Us']"),
    ACTIVITY_UPDATES("//ul[@class='vertical medium-horizontal menu align-right show-for-medium show-for-large']//a[@title='Activity Updates']"),
    TEAM("//ul[@class='vertical medium-horizontal menu align-right show-for-medium show-for-large']//a[@title='Team']"),
    OUR_PARTNERS("//ul[@class='vertical medium-horizontal menu align-right show-for-medium show-for-large']//a[@title='Our Partners']"),
    PHOTO("//ul[@class='vertical medium-horizontal menu align-right show-for-medium show-for-large']//a[@title='Photo']"),
    VIDEO("//ul[@class='vertical medium-horizontal menu align-right show-for-medium show-for-large']//a[@title='Video']"),
    CONTACTS("//ul[@class='vertical medium-horizontal menu align-right show-for-medium show-for-large']//a[@title='Contacts']"),
    BTN_CHANGE_LANGUAGE_RU("//*[@id='topnav']/li[9]/a");

    private final String locator;

    HeaderMenuItemsEn(String locator) {
        this.locator = locator;
    }


    public String getLocator(){
        return locator;
    }
}