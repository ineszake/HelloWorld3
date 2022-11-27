package lekcijaDeviniTest;

import lekcijaDevini.MainPage;
import lekcijaDevini.SearchResultPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSearch extends BaseTest{
    @Test
    public void testSearchFunctionality () throws InterruptedException{
        MainPage mainPage= new MainPage(driver);
        mainPage.searchProduct("apelsīni");

        SearchResultPage searchResultPage= new SearchResultPage(driver);
        List<WebElement> searchResultList= searchResultPage.getSearchResultList();

        Assert.assertEquals(searchResultList.size(),6);

        mainPage.searchProduct("krējums");
        searchResultList=searchResultPage.getSearchResultList();
        for (WebElement webElement : searchResultList) {
            System.out.println(webElement.getText());
        }
        Assert.assertEquals(searchResultList.size(),44);
    }



}
