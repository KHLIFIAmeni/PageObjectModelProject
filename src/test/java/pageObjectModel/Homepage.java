package pageObjectModel;

import org.openqa.selenium.*;

public class Homepage {
    private WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }
    //selector
   private By linkLogin = By.xpath("//a[normalize-space()='Signup / Login']");

    public void clickLink(){
        driver.findElement(linkLogin).click();
    }
}
