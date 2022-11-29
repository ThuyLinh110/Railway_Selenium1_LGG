package org.logigear.pageObjects.railway;

import org.logigear.constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyTicketPage extends BasePage {
    private By titleMyTicketPage = By.xpath("//h1[contains(text(),'Manage Tickets')]");
    private String btnCancelWithRowNumber = "//td[.='%s']/..//input[@type='button' and @value='Cancel' or @value='Delete']";
    private String btnCancelSelectedById = "//input[@onclick='%s']";

    private WebElement getBtnCancelById(String id) {
        return Constant.WEBDRIVER.findElement(By.xpath(String.format(btnCancelSelectedById, id)));
    }

    private WebElement getBtnCancelWithRow(String rowNumber) {
        return Constant.WEBDRIVER.findElement(By.xpath(String.format(btnCancelWithRowNumber, rowNumber)));
    }

    public String getIdOfBtnCancel(String no){
        return getBtnCancelWithRow(no).getAttribute("onclick") ;
    }
    public String getTitleMyTicketPage() {
        return Constant.WEBDRIVER.findElement(titleMyTicketPage).getText();
    }

    public void cancelTicketByStringRow(String rowNumber) {
        getBtnCancelWithRow(rowNumber).click();
    }

    public boolean checkTicketDisappear(String id) {
        try {
            WebElement btnCancel = getBtnCancelById(id);
        } catch (Exception e) {
            return true;
        }
        return false;
    }
}
