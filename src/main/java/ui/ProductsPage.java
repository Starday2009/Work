package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    By goodsDiv = By.xpath("html/body/div[1]/main/div[1]/div/div[1]/div[2]/div/div[1]/div[3]/div");
    By kgSelect = By.xpath("html/body/div[1]/main/div[1]/div/div[1]/div[2]/div/div[1]/div[3]/div/div[1]/div[2]/div[1]/span/div[1]");
    //LIST FOR KG
    By firstChoise = By.xpath("html/body/div[1]/main/div[1]/div/div[1]/div[2]/div/div[1]/div[3]/div/div[1]/div[2]/div[1]/span/div[2]/div/ul/li[1]");
    By secondChoise = By.xpath("html/body/div[1]/main/div[1]/div/div[1]/div[2]/div/div[1]/div[3]/div/div[1]/div[2]/div[1]/span/div[2]/div/ul/li[2]");
    By buyButton = By.xpath("html/body/div[1]/main/div[1]/div/div[1]/div[2]/div/div[1]/div[5]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]");
    By favoriteButton = By.id("html/body/div[1]/main/div[1]/div/div[1]/div[2]/div/div[1]/div[3]/div/div[2]/div[1]/i");
    By comparisonButon = By.id("html/body/div[1]/main/div[1]/div/div[1]/div[2]/div/div[1]/div[3]/div/div[2]/div[2]/div/span");
    By commentsButon = By.id("html/body/div[1]/main/div[1]/div/div[1]/div[2]/div/div[1]/div[3]/div/div[2]/div[3]/a/i");


    private final WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductsPage clickOnBuyButton() {
        driver.findElement(buyButton).click();
        return this;
    }
    public ProductsPage open() {
        driver.get("http://korm.ua/products");
        return this;
    }




}
