package testCases;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectModel.Homepage;
import pageObjectModel.TestCasespage;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class Tc_07 {
    WebDriver driver;
    Homepage homePage;
    TestCasespage testCasesPage;
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Test
    public void testTestCasesPage() throws InterruptedException{
        homePage = new Homepage(driver);
        testCasesPage = new TestCasespage(driver);
      String  acceptedHomePageTitle = "Automation Exercise";
      String actuelHomePageTitle = homePage.getPageTitle();
      assertEquals(acceptedHomePageTitle,actuelHomePageTitle);
      homePage.clikLinkTestCases();
      String acceptedTestCasesPageTitle = "Automation Practice Website for UI Testing - Test Cases";
      String actuelTestCasesPageTitle = testCasesPage.getPageTitle() ;
      assertEquals(acceptedTestCasesPageTitle, actuelTestCasesPageTitle);
      System.out.println("Tests passed");

    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
