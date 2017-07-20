import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import ui.*;

import java.util.concurrent.TimeUnit;


public class PurchaseForm {

    FormsOnMainPage FormsOnMainPage;
    FormOnCartPage FormOnCartPage;
    ProductsPage ProductsPage;
    WebDriver driver;
    final static Logger logger = Logger.getLogger(AdminQuestionForm.class);
    @BeforeTest
    public void before() {
        System.setProperty("webdriver.gecko.driver",
                "C:\\selenium\\geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);

        driver = new FirefoxDriver(capabilities);
        FormsOnMainPage = new FormsOnMainPage(driver);
        FormOnCartPage = new FormOnCartPage(driver);
        ProductsPage = new ProductsPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test(groups = {"functest", "ordering"})
    public void questionToAdmin() throws InterruptedException {
        ProductsPage.open();
        driver.manage().window().maximize();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Assert.assertTrue(driver.findElement(By.xpath("html/body/div[1]/main/div[1]/div/div[1]/div[2]/div/div[1]/div[3]/div")).isDisplayed());
        ProductsPage.clickOnBuyButton();
        FormOnCartPage.open();
        FormOnCartPage.clickOnOrderCash();
        FormOnCartPage.chooseOrderNalCash();
        FormOnCartPage.clickOnOrderDelivery();
        FormOnCartPage.chooseNovPosDelivery();
        FormOnCartPage.typeFirstName("Oks");
        FormOnCartPage.typeLastName("Oxy");
        FormOnCartPage.typeEmail("test@test.com");
        FormOnCartPage.typePhone("+385658965895");
        FormOnCartPage.typeComment("Hello from selenium;)");
        FormOnCartPage.clickToTermSpan();
        FormOnCartPage.clickToSaveOrder();

     //   Assert.assertTrue(driver.findElement(By.xpath("html/body/div[4]/div")).isDisplayed());

    }
}
