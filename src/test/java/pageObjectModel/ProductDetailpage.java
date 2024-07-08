package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailpage {
    WebDriver driver;
    By productName = By.xpath("//div[@class='product-information']//h2");
    By productCategory = By.xpath("//div[@class='product-information']//p");
    By productPrice = By.xpath("//div[@class='product-information']//span//span[1]");
    By productAvailability = By.xpath("//div[@class='product-details']//p[1]");
    By productCondition = By.xpath("//div[@class='product-details']//p[2]");
    By productBrand = By.xpath("//div[@class='product-details']//p[3]");
    public ProductDetailpage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTitlePage(){
        return driver.getTitle();
    }
    public boolean isNameProductVisible(){
        return driver.findElement(productName).isDisplayed();
    }
    public boolean isCategoryProductVisible(){
        return driver.findElement(productCategory).isDisplayed();
    }
    public boolean isPriceProductVisible(){
        return driver.findElement(productPrice).isDisplayed();
    }
    public boolean isAvailabilityProductVisible(){
        return driver.findElement(productAvailability).isDisplayed();
    }
    public boolean isConditionProductVisible(){
        return driver.findElement(productCondition).isDisplayed();
    }
    public boolean isBrandProductVisible(){
        return driver.findElement(productBrand).isDisplayed();
    }
}
