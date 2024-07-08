package pageObjectModel;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

public class ContactUspage {
    private WebDriver driver;

    public ContactUspage(WebDriver driver) {
        this.driver = driver;
    }
    private By actuelTitle = By.xpath("//h2[normalize-space()='Get In Touch']");
    private By inputName = By.xpath("//input[@data-qa='name']");
    private By inputEmail = By.xpath("//input[@data-qa='email']");
    private By inputSubject = By.xpath("//input[@data-qa='subject']");
    private By inputMsg = By.xpath("//textarea[@data-qa='message']");
    private By file = By.xpath("//input[@name='upload_file']");
    private By submitBtn  = By.xpath("//input[@data-qa='submit-button']");
    private By succesMessage = By.xpath("//div[@class='status alert alert-success']");
    private By homeBtn = By.xpath("//span[normalize-space()='Home']");

    public String getTitle(){
        String title = driver.findElement(actuelTitle).getText();
        return title;
    }
    public void setName(String name) {
        driver.findElement(inputName).sendKeys(name);
    }

    public void setEmail(String email) {
       driver.findElement(inputEmail).sendKeys(email);
    }

    public void setSubject(String subject) {
        driver.findElement(inputSubject).sendKeys(subject);
    }

    public void setMsg(String msg) {
        driver.findElement(inputMsg).sendKeys(msg);
    }

    public void uploadFile(String  filePath) {
        driver.findElement(file).sendKeys(filePath);
    }

    public void clickBtn() {
        driver.findElement(submitBtn).click();
    }
    // Méthode pour accepter l'alerte
    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public String getSuccesMsg(){
        String SuccessMsg = driver.findElement(succesMessage).getText();
        return SuccessMsg;
    }
    public void clickHomeBtn(){
        driver.findElement(homeBtn).click();
    }
}
