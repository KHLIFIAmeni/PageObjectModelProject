package testCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectModel.Homepage;
import pageObjectModel.Productspage;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tc_10 {
    WebDriver driver;
    Homepage homePage;
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void testSubstructionHome() throws InterruptedException {
        homePage = new Homepage(driver);
        String acceptedHomePageTitle = "Automation Exercise";
        String actuelHomePageTitle = homePage.getPageTitle();
        assertEquals(acceptedHomePageTitle, actuelHomePageTitle);
        homePage.scrollToFooter();
        assertEquals("SUBSCRIPTION",homePage.sendSubsciptionText());
        homePage.sendSubscriptionEmail("khlifiameni@gmail.com");
        homePage.clickBtnSubsription();
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
