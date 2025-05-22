package com.pionpos.webdashboard.automation.tests;

import com.pionpos.webdashboard.automation.common.BrowserManager;
import com.pionpos.webdashboard.automation.pages.LoginPage;
import com.pionpos.webdashboard.automation.pages.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest {
    @BeforeEach
    void setup() {
        open(BrowserManager.getUrl("loginPage"));
    }

    @Test
    @DisplayName("로그인 테스트")
    void testLogin() {
        LoginPage.Actions.tryLogin("dsmqa03@yopmail.com","12e12e");
        MainPage.storeEmail().shouldHave(visible);
        MainPage.buttonLogout().click();
    }

    @Test
    @DisplayName("로그인 유효성 실패 테스트")
    void testInvalid() {
        LoginPage.Actions.tryLogin("123","123");
        LoginPage.alertIdNotFound()
                .shouldBe(visible)
                .shouldHave(text("Store user ID not found."));
        LoginPage.alertSubmit().click();
    }

}
