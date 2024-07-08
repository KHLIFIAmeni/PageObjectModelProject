package testCases;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectModel.ContactUspage;
import pageObjectModel.Homepage;
import pageObjectModel.ProductDetailpage;
import pageObjectModel.Productspage;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tc_08 {
    WebDriver driver;
    Productspage productsPage;
    Homepage homePage;
    ProductDetailpage productDetailPage;
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void testContactUs() throws InterruptedException {
        homePage = new Homepage(driver);
        productsPage = new Productspage(driver);
        String acceptedHomePageTitle = "Automation Exercise";
        String actuelHomePageTitle = homePage.getPageTitle();
        assertEquals(acceptedHomePageTitle, actuelHomePageTitle);
        homePage.clickLinkProducts();
        String acceptedProductsPageTitle ="Automation Exercise - All Products";
        String actuelProductsPageTitle = productsPage.getTitlePage();
        assertEquals(actuelProductsPageTitle,acceptedProductsPageTitle);
        assertTrue(productsPage.isProductsListVisible());
        productsPage.clickOnFirstProductView();
        productDetailPage = new ProductDetailpage(driver);
        assertEquals("Automation Exercise - Product Details",productDetailPage.getTitlePage());
        assertTrue(productDetailPage.isNameProductVisible());
        assertTrue(productDetailPage.isCategoryProductVisible());
        assertTrue(productDetailPage.isPriceProductVisible());
        assertTrue(productDetailPage.isAvailabilityProductVisible());
        assertTrue(productDetailPage.isConditionProductVisible());
        assertTrue(productDetailPage.isBrandProductVisible());
        System.out.println("Tests passed");


    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
