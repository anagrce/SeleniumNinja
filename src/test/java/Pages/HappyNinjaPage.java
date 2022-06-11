package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HappyNinjaPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public WebElement happyNinjaImage;

    public HappyNinjaPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getHappyNinjaImage() {
        return driver.findElement(By.id("post-27"));
    }
    //----------------------------------------------------

    public void clickHappyNinjaImage(){
        this.getHappyNinjaImage().click();
    }
}

