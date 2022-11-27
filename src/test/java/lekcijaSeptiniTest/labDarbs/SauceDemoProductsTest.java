package lekcijaSeptiniTest.labDarbs;

import lekcijaAstoni.pageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import lekcijaSeptiniTest.labDarbs.BaseTest;

public class SauceDemoProductsTest extends BaseTest {


        @Test
        public void testAddProductToCart() throws InterruptedException {
            WebElement lietotajVardsIevadesLauks = parluks.findElement(By.id("user-name"));
            lietotajVardsIevadesLauks.sendKeys("standard_user");

            WebElement passwordField = parluks.findElement(By.id("password"));
            passwordField.sendKeys("secret_sauce1");

            WebElement loginPoga = parluks.findElement(By.id("login-button"));
            loginPoga.click();

            WebElement productPageTitle = parluks.findElement(By.cssSelector("span.title"));
            String actualPageTitleText = productPageTitle.getText();
            Assert.assertEquals(actualPageTitleText, "PRODUCTS");


            Thread.sleep(5000);
        }
    }



