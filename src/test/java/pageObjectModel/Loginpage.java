package pageObjectModel;

import org.openqa.selenium.*;

public class Loginpage {
    private WebDriver driver;

    public Loginpage(WebDriver driver) {
        this.driver = driver;
    }
    // selectors
    private By emailAdress = By.xpath("//input[@data-qa='login-email']");
    private By psw = By.xpath("//input[@data-qa='login-password']");
    private By clickButton = By.xpath("//button[normalize-space()='Login']");
    //functions

    public void setemailAdress(String email){
        driver.findElement(emailAdress).sendKeys(email);
    }
    public void setpassword(String password){
        driver.findElement(psw).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(clickButton).click();
    }
    public String getTitle(){
        String titleLoginpage = driver.getTitle();
        return titleLoginpage;
    }
    public String getErrorMessage(){
        String errorMesage = driver.findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']")).getText();
        return errorMesage;
    }
}
