package utils.enums;

public enum HeaderMenuItemsRu {
    EVENTS("//ul[@class='menu align-right  hide-for-small-only']//a[@title='События']"),
    PHOTO("//ul[@class='menu align-right  hide-for-small-only']//a[@title='Фото']"),
    VIDEO("//ul[@class='menu align-right  hide-for-small-only']//a[@title='Видео']"),
    ABOUT_US("//ul[@class='menu align-right  hide-for-small-only']//a[@title='О нас']"),
    CONTACTS("//ul[@class='menu align-right  hide-for-small-only']//a[@title='Контакты']"),
    BTN_CHANGE_LANGUAGE_EN("////ul[@class='menu align-right  hide-for-small-only']//*[@class='flag-icon flag-icon-gb']")
    ;
    private final String locator;

    HeaderMenuItemsRu(String locator) {
        this.locator = locator;
    }
    public String getLocator(){
        return locator;
    }
}
