package org.logigear.common;
import org.logigear.constant.Constant;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class WebElementManager {
    public static void clickToElement(WebElement element){

        scrollToElement(element);
        element.click();

    }
    public static void scrollToElement( WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor)(Constant.WEBDRIVER);
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static Alert getAlert(){
        return Constant.WEBDRIVER.switchTo().alert();
    }


}
