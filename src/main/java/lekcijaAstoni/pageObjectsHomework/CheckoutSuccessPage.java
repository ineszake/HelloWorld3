package lekcijaAstoni.pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutSuccessPage {
    WebDriver parluks;

    public CheckoutSuccessPage(WebDriver parluks) {
        this.parluks = parluks;
    }

    private By pageTitle= By.className("title");
    private By theOrderIsSuccessful =By.id("checkout_complete_container");

    private By buttonBackToHome=By.id("back-to-products");

    public void clickBackToHome(){

        parluks.findElement(buttonBackToHome).click();
    }


    public WebElement checkTheOrderIsSuccessful(){

        return parluks.findElement(theOrderIsSuccessful);
    }


    public WebElement getPageTitle(){

        return parluks.findElement(pageTitle);
    }


}
