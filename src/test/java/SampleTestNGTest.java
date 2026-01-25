import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestNGTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
    }


    @Test
    public void ebayTest() throws InterruptedException {
//        String title = driver.getTitle();
//        System.out.println("Page Title: " + title);

        driver.findElement(By.id("gh-ac")).sendKeys("iphone");
        Thread.sleep(2000);
        new Select(driver.findElement(By.id("gh-cat"))).selectByVisibleText("Cell Phones & Accessories");
        Thread.sleep(2000);
        driver.findElement(By.id("gh-search-btn")).click();
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
