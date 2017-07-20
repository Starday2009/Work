package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormOnCartPage {
    //first field
    By OrderCash = By.id("OrderCash_id");
    //list from OrderCash
    By nalCash = By.xpath("html/body/div[1]/main/div[1]/div/div[2]/form/fieldset/div[1]/div[1]/span/div[2]/div/ul/li[2]");
    By cardCash = By.xpath("html/body/div[1]/main/div[1]/div/div[2]/form/fieldset/div[1]/div[1]/span/div[2]/div/ul/li[3]");
    By nalPlatCash = By.xpath("html/body/div[1]/main/div[1]/div/div[2]/form/fieldset/div[1]/div[1]/span/div[2]/div/ul/li[4]");

    //second field
    By OrderDelivery = By.id("OrderDelivery_id");
    //list from OrderDelivery
    By novPostDel = By.xpath("html/body/div[1]/main/div[1]/div/div[2]/form/fieldset/div[1]/div[2]/span/div[2]/div/ul/li[2]");
    By kyrDel = By.xpath("html/body/div[1]/main/div[1]/div/div[2]/form/fieldset/div[1]/div[2]/span/div[2]/div/ul/li[3]");
    By nightExprDel = By.xpath("html/body/div[1]/main/div[1]/div/div[2]/form/fieldset/div[1]/div[2]/span/div[2]/div/ul/li[4]");
    By ukrPostDel = By.xpath("html/body/div[1]/main/div[1]/div/div[2]/form/fieldset/div[1]/div[2]/span/div[2]/div/ul/li[5]");

    By OrderFirstName = By.id("OrderFirstName");
    By OrderLastName = By.id("OrderLastName");
    By OrderEmail = By.id("OrderEmail");
    By OrderPhone = By.id("OrderPhone");
    By OrderComment = By.id("OrderComment");
    By termsSpan = By.id("termsSpan");
    By save_order = By.id("save_order");

    private final WebDriver driver;

    public FormOnCartPage(WebDriver driver) {
        this.driver = driver;
    }
//OrderDropDown
    public FormOnCartPage clickOnOrderCash() {
        driver.findElement(OrderCash).click();
        return this;
    }
    //1
     public FormOnCartPage chooseOrderNalCash() {
        driver.findElement(nalCash).click();
        return this;
    }
    //2
    public FormOnCartPage chooseOrderCardCash() {
        driver.findElement(cardCash).click();
        return this;
    }
    //3
    public FormOnCartPage chooseOrdernalPlatCash() {
        driver.findElement(nalPlatCash).click();
        return this;
    }

    //OrderDelivery
    public FormOnCartPage clickOnOrderDelivery() {
        driver.findElement(OrderDelivery).click();
        return this;
    }
    //1
    public FormOnCartPage chooseNovPosDelivery() {
        driver.findElement(novPostDel).click();
        return this;
    }
    //2
    public FormOnCartPage chooseKyrDelivery() {
        driver.findElement(kyrDel).click();
        return this;
    }
    //3
    public FormOnCartPage chooseNightExprDelivery() {
        driver.findElement(nightExprDel).click();
        return this;
    }
    //4
    public FormOnCartPage chooseUkrPostDelDelivery() {
        driver.findElement(ukrPostDel).click();
        return this;
    }

    //name
    public FormOnCartPage typeFirstName(String FirstName) {
        driver.findElement(OrderFirstName).sendKeys(FirstName);
        return this;
    }
    public FormOnCartPage typeLastName(String LastName) {
        driver.findElement(OrderLastName).sendKeys(LastName);
        return this;
    }
    public FormOnCartPage typeEmail(String Email) {
        driver.findElement(OrderEmail).sendKeys(Email);
        return this;
    }
    public FormOnCartPage typePhone(String Phone) {
        driver.findElement(OrderPhone).sendKeys(Phone);
        return this;
    }

    public FormOnCartPage typeComment(String Comment) {
        driver.findElement(OrderComment).sendKeys(Comment);
        return this;
    }
    public FormOnCartPage clickToTermSpan() {
        driver.findElement(termsSpan).click();
        return this;
    }

    public FormOnCartPage clickToSaveOrder() {
        driver.findElement(save_order).click();
        return this;
    }

    public FormOnCartPage open() {
        driver.get("http://korm.ua/cart");
        return this;
    }






}

