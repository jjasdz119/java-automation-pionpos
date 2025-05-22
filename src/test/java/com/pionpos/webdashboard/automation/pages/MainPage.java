package com.pionpos.webdashboard.automation.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private static final By STORE_EMAIL = By.xpath("//p[@class='store-email']");
    private static final By BUTTON_LOGOUT = By.xpath("//button[text()='Log out']");

    public static SelenideElement storeEmail() {
        return $(STORE_EMAIL);
    }

    public static SelenideElement buttonLogout() {
        return $(BUTTON_LOGOUT);
    }
}