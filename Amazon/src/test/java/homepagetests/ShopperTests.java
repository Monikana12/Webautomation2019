package homepagetests;

import POM.HomepagePOM;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ShopperTests extends CommonAPI {

    @Test
    public void testShopperToolkit() {
        HomepagePOM homepagePOM = PageFactory.initElements(driver, HomepagePOM.class);
        homepagePOM.vaildateShopperDisplayed();
        homepagePOM.vaildShopperClickAble();


    }
}
