package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EbayHomePage extends BasePage{

    public EbayHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "gh-ac")
    private WebElement searchField;

    @FindBy(id = "gh-cat")
    private WebElement selectedCategory;

    @FindBy(id = "gh-search-btn")
    private WebElement clickSearchButton;

    String categoryName;


    public void fillSearchField(String searchTerm){
        searchField.clear();
        searchField.sendKeys(searchTerm);
    }

    public void selectCategory(String category){
        categoryName = category;
        new Select(selectedCategory).selectByVisibleText(category);
    }

    public <T> T clickSearchButton(){
        clickSearchButton.click();
        if(categoryName.equalsIgnoreCase("Cell Phones & Accessories")){
            return (T) PageFactory.initElements(driver, MobileResultPage.class);
        } else if(categoryName.equalsIgnoreCase("Clothing, Shoes & Accessories")){
            return (T) PageFactory.initElements(driver, DressResultPage.class);
        }
        return null;
    }

}
