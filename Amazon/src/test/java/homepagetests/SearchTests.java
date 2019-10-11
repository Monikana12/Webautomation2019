package homepagetests;

import SearchResult.ResultPage;
import homepage.Search;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTests extends Search {

    ResultPage resultPage = new ResultPage();

    @Test
    public void typeAbilityTestForSearchField() {
        searchFieldIsTypeAble();
    }

    @Test(enabled = false)
    public void vaildateSearchButtonWorks() {
        searchFieldIsTypeAble();
        clickOnSearchButton();
        sleepFor(20);
        resultPage.vaildateSearchpageDisplayed();

    }

    @Test
    public void validateResultPage() {

    }

    @Test(enabled = false)
    public void testAllDropDownMenu() {
        List<WebElement> elementList = getAllElementFromList("//*[contains(@value,'search-alias')]");
        System.out.println(elementList.size());
        //print all the value of the dropdown (not Xpath)

        for(int i=0; i<elementList.size();i++) {
            System.out.println(elementList.get(i).getText());
        }

    }

}









