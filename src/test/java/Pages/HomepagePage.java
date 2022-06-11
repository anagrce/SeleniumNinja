package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomepagePage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public WebElement searchTextBox;
    public WebElement searchIcon;


    public HomepagePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getSearchTextBox() {
        return driver.findElement(By.className("search-field"));
    }

    public WebElement getSearchIcon() {
        return driver.findElement(By.className("ellie-icon-search"));
    }
    //-------------------------------

    public void enterTextInSearchTextBox(){
        this.getSearchTextBox().clear();
        this.getSearchTextBox().sendKeys("Happy Ninja");
    }

    public void clickOnSearchIcon(){
        this.getSearchIcon().click();
    }
}

