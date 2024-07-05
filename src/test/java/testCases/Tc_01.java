package testCases;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectModel.Homepage;
import pageObjectModel.Loginpage;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class Tc_01 {
    WebDriver driver;
    Homepage homepage;
    Loginpage loginpage;
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void testLogin() throws InterruptedException{
        homepage = new Homepage(driver);
        loginpage = new Loginpage(driver);
        homepage.clickLink();
        Thread.sleep(3000);
        assertEquals("Automation Exercise - Signup / Login", loginpage.getTitle());
        loginpage.setemailAdress("khlifiameni@gmail.com");
        loginpage.setpassword("test123");
        loginpage.clickLoginButton();
        String expectedMessage = "Your email or password is incorrect!";
        String actualMessage = loginpage.getErrorMessage();
        assertEquals(actualMessage,expectedMessage);


    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
