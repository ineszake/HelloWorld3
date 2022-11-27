package lekcijaSeptiniTest.labDarbs;

import lekcijaAstoni.pageObjects.LoginPage;
import lekcijaAstoni.pageObjects.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondSauceDemoLoginTest {
    WebDriver parluks;

    @BeforeMethod
    public void setUpBrowser() {
        parluks = new ChromeDriver();
        parluks.navigate().to("https://www.saucedemo.com/");
        parluks.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownBrowser() {
        parluks.quit();   }

    @Test
    public  void testLoginPageObjectExapmle1 (){
        LoginPage loginPage= new LoginPage( parluks);
        loginPage.getUsernameField().sendKeys("ghgjhm");
        loginPage.getPasswordField().sendKeys("jhkjll");
        loginPage.getLoginButton().click();
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username and password do not match " +
                "any user in this service");
    }

        @Test
    public void testLoginPageObjectExapmle (){
        LoginPage loginPage= new LoginPage( parluks);
        loginPage.login ("adsdsfdf","sdsdfddf");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username and password do not match " +
                "any user in this service");
    }
    @Test
    public void testLoginEmptyUserAndPassword1() {
        LoginPage loginPage= new LoginPage( parluks);
        loginPage.login ("","");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username is required");

    }
    @Test
    public void  testLoginEmptyPassword1() {
        LoginPage loginPage= new LoginPage( parluks);
        loginPage.login ("user-standart","");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Password is required");
    }

    @Test
    public void  testLoginEmptyUsername1() {
        LoginPage loginPage= new LoginPage( parluks);
        loginPage.login ("","saurce-sauce");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username is required");
    }

    @Test
    public void testSuccessfulLogin (){
        LoginPage loginPage= new LoginPage( parluks);
        loginPage.login ("standart-user","secret-sauce");
    }

    @Test
    public void testSuccessfulLogin1 (){
        LoginPage loginPage= new LoginPage( parluks);
        loginPage.login ("standart-user","secret-sauce");
        ProductPage productPage=new ProductPage(parluks);
        Assert.assertEquals(productPage.getPageTittle().getText(),"PRODUCTS");
    }
        @Test
          public void testLoginEmptyUserAndPassword() {
       testLogin("","","Epic sadface: Username is required");

    }
       @Test
       public void  testLoginEmptyPassword() {
        testLogin("ffggghg","","Epic sadface: Password is required");

       }

       @Test
        public void  testLoginEmptyUsername() {
        testLogin("","ghghjhk678","Epic sadface: Username is required");
       }
        @Test
     public void testLoginWrongUserAndPassword() {
       testLogin("dfdhgjjj","gfghfjjj6777","Epic sadface: Username and password " +
               "do not match any user in this service");

           }

    private  void testLogin(String username, String password, String expectedErrorMessage) {

       WebElement lietotajaVardsIevadesLauks = parluks.findElement(By.id("user-name"));
       lietotajaVardsIevadesLauks.sendKeys(username);

        WebElement lietotajaParolesIevadesLauks = parluks.findElement(By.id("password"));
        lietotajaParolesIevadesLauks.sendKeys(password);

        WebElement loginPoga = parluks.findElement(By.id("login-button"));
        loginPoga.click();

        WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));
        String errorTExt = errorTextField.getText();
        Assert.assertEquals(errorTExt,expectedErrorMessage);
    }


}