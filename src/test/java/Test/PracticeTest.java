package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeTest extends BaseTest {



    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.navigate().to("https://cms.demo.katalon.com/");
    }
    @Test
    public void test() throws InterruptedException {
        homepagePage.enterTextInSearchTextBox();
        homepagePage.clickOnSearchIcon();
        scrollIntoView(happyNinjaPage.getHappyNinjaImage());
        clickabilityWait(happyNinjaPage.getHappyNinjaImage());
        happyNinjaPage.clickHappyNinjaImage();
        productNinjaPage.clickQuantityButton();
        productNinjaPage.clickAddToChartButton();
        visabilityWait(productNinjaPage.getViewCartButton());
        productNinjaPage.clickViewCartButton();
        clickabilityWait(cartPage.getQuantityDownButton());
        cartPage.clickQuantityDownButton();
        clickabilityWait(cartPage.getUpdateCartButton());
        cartPage.clickUpdateCartButton();


        Assert.assertTrue(cartPage.getCartTitle().isDisplayed());
        Assert.assertEquals(cartPage.getQuantityDownButton().getAttribute("value"), "1");




    }

}

