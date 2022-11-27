package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPage extends BasePage {


    private By pageTitle=By.cssSelector("span.title");
    private By cartButton = By.id("shoping_cart_container");

    public WebElement getPageTittle(){
        return parluks.findElement(pageTitle);
    }

    public WebElement getCartButton (){
        return parluks.findElement(cartButton);
    }

    public ProductPage(WebDriver driver) {
        super(driver);
    }


}
