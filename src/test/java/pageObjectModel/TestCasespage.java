package pageObjectModel;

import org.openqa.selenium.WebDriver;

public class TestCasespage {
    WebDriver driver;

    public TestCasespage(WebDriver driver) {
        this.driver = driver;
    }
    // Méthode pour obtenir le titre de la page
    public String getPageTitle() {
        return driver.getTitle();
    }
}
