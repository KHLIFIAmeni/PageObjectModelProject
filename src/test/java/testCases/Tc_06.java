package testCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectModel.ContactUspage;
import pageObjectModel.Homepage;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class Tc_06 {
    WebDriver driver;
    Homepage homePage;
    ContactUspage contactPage;
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void testContactUs() throws InterruptedException{
        homePage = new Homepage(driver);
        contactPage = new ContactUspage(driver);
        String  acceptedHomePageTitle = "Automation Exercise";
        String actuelHomePageTitle = homePage.getPageTitle();
        assertEquals(acceptedHomePageTitle,actuelHomePageTitle);
        homePage.clickLinkContactUs();
        String expectedTitle ="GET IN TOUCH";
        String actuelTitle = contactPage.getTitle();
        assertEquals(actuelTitle, expectedTitle);
        contactPage.setName("Khlifi");
        contactPage.setEmail("Khlifiameni@gmail.com");
        contactPage.setSubject("Subject of message");
        contactPage.setMsg("Lorem ispum lorem ispum");
        contactPage.uploadFile("D:\\ISEG\\contrôle S2\\administrer des données.docx");
        contactPage.clickBtn();
        contactPage.acceptAlert();
        String actuelSuccesMsg = contactPage.getSuccesMsg();
        String acceptedSuccesMsg = "Success! Your details have been submitted successfully.";
        assertEquals(actuelSuccesMsg,acceptedSuccesMsg);
        contactPage.clickHomeBtn();
        assertEquals("Automation Exercise",homePage.getPageTitle());
        System.out.println("Tests passed");

    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
