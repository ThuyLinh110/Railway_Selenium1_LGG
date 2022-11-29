package org.logigear.pageObjects.railway;

import org.logigear.common.Log;
import org.logigear.constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    public static String REGISTER_USERNAME = "hang" + (int) (Math.random() * 1000) + "@gmail.com";
    public static String REGISTERED_ACCOUNT_PATH = "data/registeredAccount.json";
    public static String NON_REGISTER_USERNAME = "abc" + (int) (Math.random() * 10) + "@co.vn";

    //Locators
    private final By txtUsername = By.id("email");
    private final By txtPassword = By.id("password");
    private final By txtConfirmPass = By.id("confirmPassword");
    private final By txtPID = By.id("pid");
    private final By btnRegister = By.xpath("//input[@type='submit' and @value='Register']");
    private final By successRegisterMsg = By.xpath("//div[@id='content']/p[contains(text(),'here')]");
    private final By lblRegisterErrorMsg = By.xpath("//p[@class='message error']");
    private final By lblInvalidErrorMsg = By.xpath("//label[@class='validation-error']");

    //Elements
    private WebElement getTxtUsername() {
        return Constant.WEBDRIVER.findElement(txtUsername);
    }

    private WebElement getTxtPassword() {
        return Constant.WEBDRIVER.findElement(txtPassword);
    }

    private WebElement getTxtConfirmPass() {
        return Constant.WEBDRIVER.findElement(txtConfirmPass);
    }

    private WebElement getTxtPID() {
        return Constant.WEBDRIVER.findElement(txtPID);
    }

    private WebElement getBtnRegister() {
        return Constant.WEBDRIVER.findElement(btnRegister);
    }

    private WebElement getLblRegisterErrorMsg() {
        return Constant.WEBDRIVER.findElement(lblRegisterErrorMsg);
    }

    private WebElement getLblInvalidErrorMsg() {
        return Constant.WEBDRIVER.findElement(lblInvalidErrorMsg);
    }

    private WebElement getSuccessRegisterMsg() {
        return Constant.WEBDRIVER.findElement(successRegisterMsg);
    }

    public String getSuccessRegisterMsgTxt() {
        return this.getSuccessRegisterMsg().getText();
    }

    public String getLblRegisterErrorMsgTxt() {
        return this.getLblRegisterErrorMsg().getText();
    }

    public String getLblInvalidErrorMsgTxt() {
        return this.getLblInvalidErrorMsg().getText();
    }

    public void register(String username, String password, String confirmPassword, String pID) {
        getTxtUsername().sendKeys(username);
        getTxtPassword().sendKeys(password);
        getTxtConfirmPass().sendKeys(confirmPassword);
        getTxtPID().sendKeys(pID);
        Log.info("Click on 'Register' button");
        getBtnRegister().click();
    }

}
