package lekcijaDevini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    WebDriver driver;
    WebDriverWait wait;



private By searchInputField = By.cssSelector("header.b-header input.b-search");
    private By signInButton= By.id("fti-header-login");
    public void clickSignInButton(){
        driver.findElement(signInButton).click();
    }
    public MainPage(WebDriver driver) {
    }

    public void searchProduct (String productName){

    driver.findElement(searchInputField).sendKeys ();
}


}
