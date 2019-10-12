package POM;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomepagePOM extends CommonAPI {


    //option1
    @FindBy(xpath = "//h2[contains(text(),'Get more value out of shopping')]")
    public static WebElement element2;

    //option2
    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Get more value out of shopping')]")
    public static WebElement element3;


    //option3
    @FindBy(linkText = "shopper Toolkit")
    public static WebElement element;

    // WebElement element =getElementByLinkText("Shopper Toolkit");
    // WebElement element2 =getElement("//h2[contains(text(),'Get more value out of shopping')]");

    public void vaildateShopperDisplayed() {
        System.out.println(element.isDisplayed());
        Assert.assertEquals(element.isDisplayed(), true);
    }

    public void vaildShopperClickAble() {
        element.click();
        Assert.assertEquals(element2.isDisplayed(), true);

    }


}
