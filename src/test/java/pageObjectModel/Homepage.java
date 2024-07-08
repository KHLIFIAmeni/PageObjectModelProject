package pageObjectModel;

import org.openqa.selenium.*;

public class Homepage {
    private WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }
    //selector
   private By linkLogin = By.xpath("//a[normalize-space()='Signup / Login']");
    private By linkContactUs = By.xpath("//a[normalize-space()='Contact us']");
    private By linkTestCases = By.xpath("//a[normalize-space()='Test Cases']");
    private By linkProducts = By.xpath("//a[@href='/products']");


    public void clickLink(){
        driver.findElement(linkLogin).click();
    }
    public void clickLinkContactUs(){
        driver.findElement(linkContactUs).click();
    }
    public void clikLinkTestCases(){driver.findElement(linkTestCases).click();}
    public void clickLinkProducts(){driver.findElement(linkProducts).click();}
    // Méthode pour obtenir le titre de la page
    public String getPageTitle() {
        return driver.getTitle();
    }
}
