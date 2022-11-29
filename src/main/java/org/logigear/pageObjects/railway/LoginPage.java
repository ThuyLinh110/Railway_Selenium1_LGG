package org.logigear.pageObjects.railway;

import org.logigear.constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    //Locators
    private final By txtUsername = By.id("username");
    private final By txtPassword = By.id("password");
    private final By btnLogin = By.xpath("//input[@type='submit' and @value='Login']");
    private final By lblLoginErrorMsg = By.xpath("//p[@class='message error LoginForm']");
    private final By titleLoginPage = By.xpath("//h1[contains(text(),'Login Page')]");


    //Elements
    private WebElement getTxtUsername() {
        return Constant.WEBDRIVER.findElement(txtUsername);
    }

    private WebElement getTxtPassword() {
        return Constant.WEBDRIVER.findElement(txtPassword);
    }

    private WebElement getBtnLogin() {return Constant.WEBDRIVER.findElement(btnLogin);}

    private WebElement getLblLoginErrorMsg() {
        return Constant.WEBDRIVER.findElement(lblLoginErrorMsg);
    }

    public void fillDataLogin(String username, String password) {
        getTxtUsername().sendKeys(username);
        getTxtPassword().sendKeys(password);
    }

    public void clickBtnLogin(){
        getBtnLogin().click();
    }
}



