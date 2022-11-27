package lekcijaSeptiniTest.labDarbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver parluks;

    @BeforeMethod
    public void setUpBrowser(){
        parluks=new ChromeDriver();
        parluks.navigate().to( "https://www.lu.lv/");
        parluks.manage().window().maximize();
    }
    @AfterMethod
    public void tearDownBrowser(){
        parluks.quit();

    }

    @Test
    public void testFirstSelenium (){
        System.out.println("Mans pirmais tests");
         parluks.get("https://www.lu.lv/");

    }

    @Test
    public void testPageTitle(){
        parluks.getTitle();
        String nosaukums= parluks.getTitle();
        Assert.assertEquals(nosaukums,"Latvijas Universitāte");

    }
     @Test
    public void testRandom(){

     }

}
