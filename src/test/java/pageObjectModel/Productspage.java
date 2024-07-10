package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Productspage {
    WebDriver driver;
    By listProducts = By.cssSelector(".features_items");
    By firstProductViewButton = By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]");
    By searchProduct = By.xpath("//input[@id='search_product']");
    By btnSearch = By.xpath("//button[@id='submit_search']");
    By searchProductTitle = By.xpath("//h2[normalize-space()='Searched Products']");

    public Productspage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitlePage(){
        return driver.getTitle();
    }
    public boolean isProductsListVisible(){
        return driver.findElement(listProducts).isDisplayed();

    }
    // input search product
    public void SearchProductInput(String productName){
        driver.findElement(searchProduct).sendKeys(productName);
    }
    public boolean isSearchProductVisible(){
        return driver.findElement(searchProductTitle).isDisplayed();
    }
    public void clickOnSearchButton(){
        driver.findElement(btnSearch).click();
    }
    public void clickOnFirstProductView() {
        driver.findElement(firstProductViewButton).click();
    }
    public boolean areSearchedProductsVisible() {

        return driver.findElements(By.className("single-products")).size() > 0;
    }

}
