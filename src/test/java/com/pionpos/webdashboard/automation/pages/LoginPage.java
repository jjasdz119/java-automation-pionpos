package com.pionpos.webdashboard.automation.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static final By INPUT_FIELD_USER_NAME = By.xpath("//input[@id='userId']");
    private static final By INPUT_FIELD_PASSWORD = By.xpath("//input[@id='password']");
    private static final By SUBMIT = By.xpath("//button[@type='submit']");
    private static final By ALERT_ID_NOT_FOUND = By.xpath("//div[@class='modal-body']");
    private static final By ALERT_SUBMIT = By.xpath("//button[@class='btn modal-success-btn']");

    public static SelenideElement inputFieldUserName() {
        return $(INPUT_FIELD_USER_NAME);
    }

    public static SelenideElement inputFieldPassword() {
        return $(INPUT_FIELD_PASSWORD);
    }

    public static SelenideElement submit() {
        return $(SUBMIT);
    }

    public static SelenideElement alertIdNotFound() {
        return $(ALERT_ID_NOT_FOUND);
    }

    public static SelenideElement alertSubmit() {
        return $(ALERT_SUBMIT);
    }

    public static class Actions {
        public static void tryLogin(String email, String password) {
            LoginPage.inputFieldUserName().setValue(email);
            LoginPage.inputFieldPassword().setValue(password);
            LoginPage.submit().click();
        }
    }

}
