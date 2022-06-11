package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductNinjaPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public WebElement quantityButton;
    public WebElement addToChartButton;
    public WebElement viewCartButton;

    public ProductNinjaPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getQuantityButton() {
        return driver.findElement(By.cssSelector(".quantity-button.quantity-up"));
    }

    public WebElement getAddToChartButton() {
        return driver.findElement(By.cssSelector(".single_add_to_cart_button.button.alt"));
    }

    public WebElement getViewCartButton() {
        return driver.findElement(By.cssSelector(".button.wc-forward"));
    }

    //------------------------------------
    public  void  clickQuantityButton(){
        this.getQuantityButton().click();
    }
    public void clickAddToChartButton(){
        this.getAddToChartButton().click();
    }
    public void clickViewCartButton(){
        this.getViewCartButton().click();
    }
}

