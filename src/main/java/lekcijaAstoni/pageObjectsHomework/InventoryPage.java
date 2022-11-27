package lekcijaAstoni.pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {

    WebDriver parluks;

    public InventoryPage(WebDriver parluks) {
        this.parluks = parluks;
    }

    private By pageTitle=By.cssSelector("span.title");
    private By cartButton = By.id("shoping_cart_container");

    private By buttonAddToCart= By.cssSelector("inventory_container");



            public void clickButtonAddToCart(){
                parluks.findElement(buttonAddToCart).click();
            }



    public WebElement getPageTittle(){

                return parluks.findElement(pageTitle);
    }

    public WebElement getCartButton (){

                return parluks.findElement(cartButton);
    }


}