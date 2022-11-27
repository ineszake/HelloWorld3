package seleniumHomework;



import lekcijaAstoni.pageObjects.ProductPage;
import lekcijaAstoni.pageObjectsHomework.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoTests extends BaseTest {

        @Test
        public void testCheckoutPageMandatoryFields() throws InterruptedException {
                System.out.println("1. Navigēt uz saiti https://www.saucedemo.com/");

                System.out.println("2. Ielogoties ar pareizu lietotāja vārdu/paroli");
                LoginPage loginPage = new LoginPage(parluks);
                loginPage.login("standard_user", "secret_sauce");

                System.out.println(("3.Pārbaudīt,ka lietotājs ir ielogojies"));
                ProductPage produktuLapa = new ProductPage(parluks);
                Assert.assertEquals(produktuLapa.getPageTitle().getText(), "PRODUCTS");

                System.out.println("4.Ievietot grozā 1 produktu");
                produktuLapa.clickButtonAddToCart();

                System.out.println("5. Doties uz grozu");
                CartPage grozaLapa = new CartPage(parluks);
                produktuLapa.getCartButton().click();
                Assert.assertEquals(grozaLapa.getPageTitle().getText(), "YOUR CART");

                System.out.println("6.Pārbaudīt, ka šī prece ir grozā");
                Assert.assertEquals(grozaLapa.getNumberOfItemsInCart().getText(), "1");

                System.out.println("7.Doties uz Checkout");
                grozaLapa.getCheckoutButton().click();


                System.out.println(" 8. Ievadīt Firstname/Lastname/Zip code un pārbaudīt vai parāda pareizu kļūdas " +
                        "paziņojumu");
                CheckoutPage checkoutLapa = new CheckoutPage(parluks);
                Assert.assertEquals(checkoutLapa.getPageTitle().getText(), "CHECKOUT: YOUR INFORMATION");
                checkoutLapa.clickContinueButton();

                Assert.assertEquals(checkoutLapa.getErrorText(), "Error: First name ir required");

                checkoutLapa.inputFirstName("Inese");
                checkoutLapa.clickContinueButton();
                Assert.assertEquals(checkoutLapa.getErrorText(), "Error: Last name ir required");

                checkoutLapa.inputLastName("Liepina");
                checkoutLapa.clickContinueButton();
                Assert.assertEquals(checkoutLapa.getErrorText(), "Error: Postal Code is required");

                checkoutLapa.inputZipCode("LV1011");
                checkoutLapa.clickContinueButton();

                System.out.println("9.Doties uz Checkout overview lapu, pārbaudīt datus");
                CheckoutOverviewPage checkoutOverviewLapa = new CheckoutOverviewPage(parluks);
                Assert.assertEquals(checkoutOverviewLapa.getPageTitle().getText(), "CHECKOUT: OVERVIEW");
                Assert.assertEquals(checkoutOverviewLapa.getInformationFieldCheckoutOverview().getText(),
                        "Sauce Labs Backpack" + "1");
                checkoutOverviewLapa.clickButtonFinish();


                System.out.println("10. Doties uz finish lapu un pārbaudīt vai tas ir veiksmīgs");
                CheckoutSuccessPage checkoutSuccesLapa = new CheckoutSuccessPage(parluks);
                Assert.assertEquals(checkoutSuccesLapa.getPageTitle().getText(), "CHECKOUT: COMPLETE!");
                Assert.assertEquals(checkoutSuccesLapa.checkTheOrderIsSuccessful().getText(),
                        "THANK YOU FOR YOUR ORDER");

                System.out.println("11. Doties atpakaļ uz pirmo lapu ar pogu Back home");
                CheckoutSuccessPage checkoutSuccessLapa = new CheckoutSuccessPage(parluks);
                checkoutSuccessLapa.clickBackToHome();


        }
}
