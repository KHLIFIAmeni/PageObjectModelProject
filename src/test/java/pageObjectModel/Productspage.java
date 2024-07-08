package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Productspage {
    WebDriver driver;
    By listProducts = By.cssSelector(".features_items");
    By firstProductViewButton = By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]");


    public Productspage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitlePage(){
        return driver.getTitle();
    }
    public boolean isProductsListVisible(){
        return driver.findElement(listProducts).isDisplayed();

    }
    public void clickOnFirstProductView() {
        driver.findElement(firstProductViewButton).click();
    }

}
