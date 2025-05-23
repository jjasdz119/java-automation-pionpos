package com.pionpos.webdashboard.automation.tests;

import com.pionpos.webdashboard.automation.common.BrowserManager;
import com.pionpos.webdashboard.automation.pages.LoginPage;
import com.pionpos.webdashboard.automation.pages.MainPage;
import com.pionpos.webdashboard.automation.pages.StoreSettingsPage;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class StoreSettingsTest {

    @BeforeAll
    static void login() {
        open(BrowserManager.getUrl("loginPage"));
        LoginPage.Actions.tryLogin("dsmqa03@yopmail.com", "12e12e");
    }

    @BeforeEach
    void setup() {
        MainPage.buttonStoreSettings().click();
        StoreSettingsPage.loadingSpinner().shouldBe(disappear);
    }

    @AfterEach
    void gotoHome () {
        MainPage.buttonHome().click();
    }

    @Test
    @DisplayName("페이지 접근 테스트")
    void testAccessPage() {
        StoreSettingsPage.pageTitle().shouldBe(visible);
    }

    @Test
    @DisplayName("저장 되는지 테스트")
    void testSaveStoreInfo() {
        executeJavaScript("arguments[0].click();", StoreSettingsPage.buttonSave().getWrappedElement());
        StoreSettingsPage.modalBody().shouldHave()
                .shouldBe(visible)
                .shouldHave(text("Store Settings Updated Successfully."));
        StoreSettingsPage.buttonOK().click();
    }

    @Test
    @DisplayName("스토어정보 필수 값 가져오는지 테스트")
    void testRequiredStoreInfo() {
        StoreSettingsPage.Actions.checkRequiredStoreInfo();
    }
}
