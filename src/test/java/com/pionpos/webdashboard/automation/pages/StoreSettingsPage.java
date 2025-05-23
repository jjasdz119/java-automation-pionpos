package com.pionpos.webdashboard.automation.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Selenide.$;

public class StoreSettingsPage {

    // 스토어설정 화면의 컴포넌트
    private static final By PAGE_TITLE = By.xpath("//h4[text()='Store Settings']");
    private static final By BUTTON_SAVE = By.xpath("//button[text()='Save']");
    private static final By MODAL_BODY = By.xpath("//div[@class='modal-body']");
    private static final By BUTTON_SUBMIT = By.xpath("//button[@class='btn modal-success-btn']");
    private static final By LOADING_SPINNER = By.xpath("//div[@class='spinner-border black-spinner']");
    private static final By GENERAL_INFO_TAB = By.xpath("//button[@id='ngb-nav-0']");
    private static final By OPEN_HOURS_TAB = By.xpath("//button[@id='ngb-nav-1']");

    // 기본 정보
    private static final By FIELD_STORE_NAME = By.xpath("//input[@id='name']");
    private static final By FIELD_BRANCH_NAME = By.xpath("//input[@id='branchName']");
    private static final By FIELD_OWNER_NAME = By.xpath("//input[@id='ownerName']");
    private static final By FIELD_ADDRESS = By.xpath("//input[@id='address1']");
    private static final By FIELD_CITY = By.xpath("//input[@id='address2']");
    private static final By FIELD_STATE = By.xpath("//input[@id='address3']");
    private static final By FIELD_ZIP = By.xpath("//input[@id='address4']");
    private static final By FIELD_PHONE = By.xpath("//input[@id='phone']");
    private static final By FIELD_FAX = By.xpath("//input[@id='fax']");
    private static final By FIELD_EMAIL = By.xpath("//input[@id='email']");
    private static final By FIELD_WEBSITE = By.xpath("//input[@id='website']");

    // 스토어 영업시간
    private static final By OPEN_HOURS_MON = By.xpath("//div[contains(@class, 'row') and contains(., 'Mon')]");
    private static final By OPEN_HOURS_TUE = By.xpath("//div[contains(@class, 'row') and contains(., 'Tue')]");
    private static final By OPEN_HOURS_WED = By.xpath("//div[contains(@class, 'row') and contains(., 'Wed')]");
    private static final By OPEN_HOURS_THU = By.xpath("//div[contains(@class, 'row') and contains(., 'Thu')]");
    private static final By OPEN_HOURS_FRI = By.xpath("//div[contains(@class, 'row') and contains(., 'Fri')]");
    private static final By OPEN_HOURS_SAT = By.xpath("//div[contains(@class, 'row') and contains(., 'Sat')]");
    private static final By OPEN_HOURS_SUN = By.xpath("//div[contains(@class, 'row') and contains(., 'Sun')]");

    public static SelenideElement pageTitle() {
        return $(PAGE_TITLE);
    }

    public static SelenideElement buttonSave() {
        return $(BUTTON_SAVE);
    }

    public static SelenideElement modalBody() {
        return $(MODAL_BODY);
    }

    public static SelenideElement buttonOK() {
        return $(BUTTON_SUBMIT);
    }

    public static SelenideElement loadingSpinner() {
        return $(LOADING_SPINNER);
    }

    public static SelenideElement generalInfoTab() {
        return $(GENERAL_INFO_TAB);
    }

    public static SelenideElement openHoursTab() {
        return $(OPEN_HOURS_TAB);
    }



    public static SelenideElement fieldStoreName() {
        return $(FIELD_STORE_NAME);
    }

    public static SelenideElement fieldBranchName() {
        return $(FIELD_BRANCH_NAME);
    }

    public static SelenideElement fieldOwnerName() {
        return $(FIELD_OWNER_NAME);
    }

    public static SelenideElement fieldAddress() {
        return $(FIELD_ADDRESS);
    }

    public static SelenideElement fieldCity() {
        return $(FIELD_CITY);
    }

    public static SelenideElement fieldState() {
        return $(FIELD_STATE);
    }

    public static SelenideElement fieldZip() {
        return $(FIELD_ZIP);
    }

    public static SelenideElement fieldPhone() {
        return $(FIELD_PHONE);
    }

    public static SelenideElement fieldFax() {
        return $(FIELD_FAX);
    }

    public static SelenideElement fieldEmail() {
        return $(FIELD_EMAIL);
    }

    public static SelenideElement fieldWebsite() {
        return $(FIELD_WEBSITE);
    }

    public static SelenideElement openHoursMon() {
        return $(OPEN_HOURS_MON);
    }

    public static SelenideElement openHoursTue() {
        return $(OPEN_HOURS_TUE);
    }

    public static SelenideElement openHoursWed() {
        return $(OPEN_HOURS_WED);
    }

    public static SelenideElement openHoursThu() {
        return $(OPEN_HOURS_THU);
    }

    public static SelenideElement openHoursFri() {
        return $(OPEN_HOURS_FRI);
    }

    public static SelenideElement openHoursSat() {
        return $(OPEN_HOURS_SAT);
    }

    public static SelenideElement openHoursSun() {
        return $(OPEN_HOURS_SUN);
    }


    public static class Actions {
        public static void checkRequiredStoreInfo() {
            fieldStoreName().shouldNotBe(empty);
            System.out.println("Store Name: " + StoreSettingsPage.fieldStoreName().getValue());
            fieldBranchName().shouldNotBe(empty);
            System.out.println("Branch Name: " + StoreSettingsPage.fieldBranchName().getValue());
            fieldOwnerName().shouldNotBe(empty);
            System.out.println("Owner Name: " + StoreSettingsPage.fieldOwnerName().getValue());
            fieldAddress().shouldNotBe(empty);
            System.out.println("Address: " + StoreSettingsPage.fieldAddress().getValue());
            fieldCity().shouldNotBe(empty);
            System.out.println("City: " + StoreSettingsPage.fieldCity().getValue());
            fieldState().shouldNotBe(empty);
            System.out.println("State: " + StoreSettingsPage.fieldState().getValue());
            fieldZip().shouldNotBe(empty);
            System.out.println("Zipcode: " + StoreSettingsPage.fieldZip().getValue());
            fieldPhone().shouldNotBe(empty);
            System.out.println("Phone Number: " + StoreSettingsPage.fieldPhone().getValue());
        }
    }
}

