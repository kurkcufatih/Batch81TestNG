package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SearchProductPage {
    public SearchProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()=' Products']")
    public WebElement products;

    @FindBy(xpath = "//*[text()='All Products']")
    public WebElement allProductsTitle;

    @FindBy(xpath = "//*[@id='search_product']")
    public WebElement searchBox;

    @FindBy (xpath = "//button[@id='submit_search']")
    public WebElement searchButton;

    @FindBy(xpath = "//*[text()='Searched Products']")
    public WebElement searchedProducts;

    @FindBy(xpath = "//*[text()='View Product']")
    public WebElement viewProduct;

    @FindBy(xpath = "(//h2)[3]")
    public WebElement blueTop;

    @FindBy (xpath = "//div[@class='product-image-wrapper']")
    public List<WebElement> searchedProductList;
}