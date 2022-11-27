package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoTests extends BaseTest{

    @Test
            public void testLogin () throws InterruptedException {
    WebElement lietotajVardsIevadesLauks = parluks.findElement(By.id("user-name"));
            lietotajVardsIevadesLauks.sendKeys("standard_user");

    WebElement passwordField = parluks.findElement(By.id("password"));
            passwordField.sendKeys("secret_sauce");

    WebElement loginPoga = parluks.findElement(By.id("login-button"));
            loginPoga.click();

    WebElement productPageTitle = parluks.findElement(By.cssSelector("span.title"));
    String actualPageTitleText = productPageTitle.getText();
            Assert.assertEquals(actualPageTitleText, "PRODUCTS");

            WebElement addToCart= parluks.findElement(By.id("inventory_container"));
            addToCart.click();

            WebElement goToCart=parluks.findElement(By.id("shopping_cart_container"));
            goToCart.click();

            WebElement yourCart= parluks.findElement(By.cssSelector("cart_list"));
            String actualYourCart= yourCart.getText();
            Assert.assertEquals(actualYourCart, "YOUR CART");

            WebElement goToCheckout=parluks.findElement(By.id("checkout"));
            goToCheckout.click();

            WebElement FirstNameField=parluks.findElement(By.id("first-name"));
            FirstNameField.sendKeys("Inese");

            WebElement LastNameField=parluks.findElement(By.id("last-name"));
            LastNameField.sendKeys("Zake");

            WebElement ZipCodeField=parluks.findElement(By.id("postal-code"));
            ZipCodeField.sendKeys("LV1011");

            WebElement goToPageOwerview= parluks.findElement(By.id("continue"));
            goToPageOwerview.click();

            WebElement goToFinishPage=parluks.findElement(By.id("finish"));
            goToFinishPage.click();

            WebElement textFieldInFinishPage = parluks.findElement(By.cssSelector("div.checkout_complete_container"));
            String actualTextFieldInFinishPage = textFieldInFinishPage.getText();
            Assert.assertEquals(actualTextFieldInFinishPage, "CHECKOUT: COMPLETE!");

            WebElement goToBackHome= parluks.findElement(By.id("back-to-products"));
            goToBackHome.click();



            Thread.sleep(5000);
}
}
