package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressResultPage extends BasePage{
    public DressResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Nike']")
    private WebElement chkOnDress;

    public void clickOnDress() throws InterruptedException {
        Thread.sleep(700);
        chkOnDress.click();
    }
}
