package lekcijaAstoniTest;

import lekcijaAstoni.pageObjects.CartPage;
import lekcijaAstoni.pageObjects.CheckoutPage;
import lekcijaAstoni.pageObjects.LoginPage;
import lekcijaAstoni.pageObjects.ProductPage;
import lekcijaSeptiniTest.labDarbs.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenarioDivi extends BaseTest {

    @Test
    public void testCheckoutPageMandatoryFields() throws InterruptedException {
        System.out.println("1. Navigēt uz saiti https://www.saucedemo.com/");

        System.out.println("2. Ielogoties ar pareizu lietotāja vārdu/paroli");
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("standard_user","secret_sauce");
        ProductPage produktuLapa = new ProductPage(parluks);
        Assert.assertEquals(produktuLapa.getPageTitle().getText(), "PRODUCTS");

        System.out.println("3. Doties uz grozu");
        CartPage grozaLapa = new CartPage(parluks);
        produktuLapa.getCartButton().click();
        Assert.assertEquals(grozaLapa.getPageTitle().getText(),"YOUR CART");

        System.out.println("4.Doties uz Checkout");
        grozaLapa.getCheckoutButton().click();


        System.out.println(" 5. Pārbaudīt, ka Firstname/Lastname/Zip code ir obligats");
        CheckoutPage checkoutLapa =new CheckoutPage(parluks);
        Assert.assertEquals(checkoutLapa.getPageTitle().getText(),"CHECKOUT: YOUR INFORMATION" );
        checkoutLapa.clickContinueButton();

        Assert.assertEquals(checkoutLapa.getErrorText(),"Error: First name ir required");

        checkoutLapa.inputFirstName("Inese");
        checkoutLapa.clickContinueButton();
        Assert.assertEquals(checkoutLapa.getErrorText(),"Error: Last name ir required");

        Thread.sleep(5000);


    }

}
