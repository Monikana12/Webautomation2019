package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import report.TestLogger;

import java.util.List;

public class HomePage extends CommonAPI {

    public void clickOnSearchBar() {
        clickOnElementByXpath("//input[@id='twotabsearchtextbox']");
        TestLogger.log("search bar clicked");
    }

    public void typeOnSearchBar(String value) {
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']", value);
        TestLogger.log(value + "type on the seach bar");

    }

    public void clickOnSearchButton() {
        clickOnElementByXpath("//div[@id='nav-search']/form[@role='search']//input[@value='Go']");
        TestLogger.log("search button clicked");

    }

    public List<WebElement> getAllElementFromList() {
        //List<WebElement> elementList =driver.findElements(By.xpath("//*[contains(@value,'search-alias')]"));
        // return elementList;

        return driver.findElements(By.xpath("//*[contains(@value,'search-alias')]"));
    }

}

