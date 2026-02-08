package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobileResultPage extends BasePage{
    public MobileResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Apple']")
    private WebElement chkOnApple;

    public void clickOnApple() throws InterruptedException {
        Thread.sleep(7000);
        chkOnApple.click();
    }
}
