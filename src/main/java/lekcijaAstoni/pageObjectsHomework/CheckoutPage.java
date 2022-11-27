package lekcijaAstoni.pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    WebDriver parluks;

    public CheckoutPage(WebDriver parluks) {
        this.parluks = parluks;
    }

    private By pageTitle= By.className("title");
    private By continueButton= By.id("continue");

    private By errorText= By.cssSelector("h3");

    private By firstNameInputField= By.id("first-name");

    private By lastNameInputField= By.id("last-name");

    private By zipCodeInputField= By.id("postal-code");

    public void inputZipCode (String zipCode){
        parluks.findElement(zipCodeInputField).sendKeys(zipCode);
    }

    public void inputFirstName(String firstName){

        parluks.findElement(firstNameInputField).sendKeys(firstName);
    }

    public void inputLastName (String lastName){
        parluks.findElement(lastNameInputField).sendKeys(lastName);
    }

    public void clickContinueButton(){
        parluks.findElement(continueButton).click();

    }
    public String getErrorText(){
        return parluks.findElement(errorText).getText();
    }

    public WebElement getPageTitle(){
        return parluks.findElement(pageTitle);
    }
}
