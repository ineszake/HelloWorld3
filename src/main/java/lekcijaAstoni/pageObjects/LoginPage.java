package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver parluks;

    public LoginPage(WebDriver parluks) {
        this.parluks = parluks;
    }

    private By usernameInputField = By.id("user-name");//lokators
    private By passwordInputField = By.id("password");
    private By loginButton= By.id ("Login -button");

    private By errorTextField= By.cssSelector("div.error-message-container h3");

    public void login(String username, String password){
        getUsernameField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
    }

    public WebElement getUsernameField() {
        return parluks.findElement(usernameInputField);
    }

    public WebElement getPasswordField() {
        return parluks.findElement(passwordInputField);
    }

    public WebElement getLoginButton() {
      return parluks.findElement(loginButton);
    }

    public String getErrorText(){
      return  parluks.findElement(errorTextField).getText();
    }






    }





