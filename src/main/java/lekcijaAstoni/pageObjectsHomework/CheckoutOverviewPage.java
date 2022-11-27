package lekcijaAstoni.pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage {
    WebDriver parluks;

    public CheckoutOverviewPage(WebDriver parluks) {
        this.parluks = parluks;
    }

    private By pageTitle= By.className("title");
    private By informationFieldCheckoutOverview= By.id("checkout_summary_container");
    private By buttonFinish=By.id("finish");

    public void clickButtonFinish(){

        parluks.findElement(buttonFinish).click();
    }

    public WebElement getInformationFieldCheckoutOverview(){
        return parluks.findElement(informationFieldCheckoutOverview);
    }

    public WebElement getPageTitle(){

        return parluks.findElement(pageTitle);
    }



}

