package lekcijaAstoni.pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver parluks;

    public CartPage(WebDriver parluks) {
        this.parluks = parluks;
    }

    private By checkoutButton = By.cssSelector("checkout");
    private By pageTitle= By.className("title");

    private By numberOfItemsInCart= By.cssSelector("span.shopping_cart_badge");

    public WebElement getNumberOfItemsInCart() {
        return parluks.findElement(numberOfItemsInCart);
    }

    public WebElement getCheckoutButton() {
        return parluks.findElement(checkoutButton);
    }
    public WebElement getPageTitle(){
        return parluks.findElement(pageTitle);
    }



}
