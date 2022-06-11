package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public WebElement quantityDownButton;
    public WebElement updateCartButton;
    public WebElement cartTitle;




    public CartPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;

    }
    public WebElement getQuantityDownButton() {
        return driver.findElement(By.cssSelector(".input-text.qty.text"));

    }

    public WebElement getCartTitle() {
        return driver.findElement(By.className("page-title"));
    }



    public WebElement getUpdateCartButton() {
        return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[2]/td/button"));





    }  //---------------------------------------------
    public void clickQuantityDownButton(){
        this.getQuantityDownButton().clear();
        this.getQuantityDownButton().sendKeys("1");
    }
    public void clickUpdateCartButton(){

        this.getUpdateCartButton().click();
    }
}

