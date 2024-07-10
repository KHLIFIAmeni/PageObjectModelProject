package testCases;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectModel.Homepage;
import pageObjectModel.Productspage;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tc_09 {
    WebDriver driver;
    Productspage productsPage;
    Homepage homePage;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void testSearchProduct() throws InterruptedException{
        homePage = new Homepage(driver);
        productsPage = new Productspage(driver);
        String acceptedHomePageTitle = "Automation Exercise";
        String actuelHomePageTitle = homePage.getPageTitle();
        assertEquals(acceptedHomePageTitle, actuelHomePageTitle);
        homePage.clickLinkProducts();
        String acceptedProductsPageTitle ="Automation Exercise - All Products";
        String actuelProductsPageTitle = productsPage.getTitlePage();
        assertEquals(actuelProductsPageTitle,acceptedProductsPageTitle);
        productsPage.SearchProductInput("T-shirt");
        productsPage.clickOnSearchButton();
        assertTrue(productsPage.isSearchProductVisible());
        assertTrue(productsPage.areSearchedProductsVisible());
        System.out.println(("Tests passed"));

    }
    public void tearDown(){
        driver.quit();
    }

}
