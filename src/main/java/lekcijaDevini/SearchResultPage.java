package lekcijaDevini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SearchResultPage {
    WebDriver driver;
    WebDriverWait wait;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    private By searchResultList= By.cssSelector( " div.b-product-- wrap2");

    public List<WebElement> getSearchResultList (){
       return driver.findElements(searchResultList);

    }

    @Test
    public void testRegistrationWindowClosesCorrectly ()throws InterruptedException{
        MainPage mainPage= new MainPage(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("b-mui-carousel--placeholder")));
        Thread.sleep(3000);
        mainPage.clickSignInButton();

        SignInModal signModal= new SignInModal(driver);
        signModal.waitForSignInModalToAppear();
        signModal.closeButtonClick();

    }
}
