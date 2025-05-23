package com.pionpos.webdashboard.automation.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private static final By STORE_EMAIL = By.xpath("//p[@class='store-email']");
    private static final By BUTTON_LOGOUT = By.xpath("//button[text()='Log out']");
    private static final By BUTTON_HOME = By.xpath("//a[text()='Home']");
    private static final By BUTTON_STORE_SETTINGS = By.xpath("//button[text()='Store Settings']");

    public static SelenideElement storeEmail() {
        return $(STORE_EMAIL);
    }

    public static SelenideElement buttonLogout() {
        return $(BUTTON_LOGOUT);
    }

    public static SelenideElement buttonHome() {
        return $(BUTTON_HOME);
    }

    public static SelenideElement buttonStoreSettings() {
        return $(BUTTON_STORE_SETTINGS);
    }
}