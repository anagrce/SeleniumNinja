
package Base;

import Pages.CartPage;
import Pages.HappyNinjaPage;
import Pages.HomepagePage;
import Pages.ProductNinjaPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;



public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public HomepagePage homepagePage;
    public HappyNinjaPage happyNinjaPage;
    public ProductNinjaPage productNinjaPage;
    public CartPage cartPage;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        wdwait= new WebDriverWait(driver, Duration.ofSeconds(10));
        homepagePage= new HomepagePage(driver, wdwait);
        happyNinjaPage= new HappyNinjaPage(driver,wdwait);
        productNinjaPage= new ProductNinjaPage(driver,wdwait);
        cartPage= new CartPage(driver,wdwait);
    }
    public void visabilityWait(WebElement element){
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }
    public void clickabilityWait(WebElement element){
        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void scrollIntoView(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true) ;",element );

    }
    @AfterClass
    public void tearDown(){
        //driver.close();
        // driver.quit();

    }
}





