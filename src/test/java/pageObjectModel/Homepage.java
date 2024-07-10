package pageObjectModel;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

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
    private By subsriptionEmail = By.xpath("//input[@id='susbscribe_email']");
    private By subsriptionBtn = By.xpath("//button[@id='subscribe']");
    private By subscription = By.xpath("//h2[normalize-space()='Subscription']");
    private By footer = By.xpath("//footer[@id='footer']");


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
    public void scrollToFooter() {
        WebElement footerElement = driver.findElement(footer);
        Actions actions = new Actions(driver);
        actions.moveToElement(footerElement).perform();
    }
    public void sendSubscriptionEmail(String email){
        driver.findElement(subsriptionEmail).sendKeys(email);
    }
    public String sendSubsciptionText(){
        return driver.findElement(subscription).getText();
    }
    public void clickBtnSubsription(){
        driver.findElement(subsriptionBtn).click();
    }

}
