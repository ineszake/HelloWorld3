package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage  {
    WebDriver parluks;
    public CartPage(WebDriver parluks){
        this.parluks=parluks;
    }

    private By checkoutButton = By.cssSelector("checkout");
    private By pageTitle= By.className("title");

    public WebElement getCheckoutButton() {
        return parluks.findElement(checkoutButton);
    }
    public WebElement getPageTitle(){
        return parluks.findElement(pageTitle);
    }

}