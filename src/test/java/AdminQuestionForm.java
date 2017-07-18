import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ui.FormsOnMainPage;

import java.util.concurrent.TimeUnit;


public class AdminQuestionForm {
    FormsOnMainPage loginPage;
    WebDriver driver;

    @BeforeTest
    public void before() {
        System.setProperty("webdriver.gecko.driver",
                "C:\\selenium\\geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);

        driver = new FirefoxDriver(capabilities);
        loginPage = new FormsOnMainPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(groups = {"functest", "questionToAdmin"})
    public void questionToAdmin() throws InterruptedException {
        loginPage.open();
        loginPage.clickOnRequest();
        loginPage.typeName("Oks");
        loginPage.typeEmail("test@test.com");
        loginPage.typePhone("+380695698585");
        loginPage.typeComment("Hello from selenium!");
        loginPage.clickOnSubmit();
       // Assert.assertTrue(driver.findElement(By.xpath("html/body/div[5]/div")).isDisplayed());

    }
    @Test(groups = {"functest", "questionToVet"})
    public void questionToVet() throws InterruptedException {
        //  loginPage.open();
        loginPage.clickOnRequestVet();
        loginPage.typeNameVet("Oks");
        loginPage.typeEmailVet("test@test.com");
        loginPage.typePhoneVet("+380695698585");
        loginPage.typeCommentVet("Hello from selenium!");
        loginPage.clickOnSubmitVet();
       // Assert.assertTrue(driver.findElement(By.xpath("html/body/div[5]/div")).isDisplayed());

    }
    @Test(groups = {"functest", "contactForm"})
    public void contactForm() throws InterruptedException {
        loginPage.open();
        driver.manage().window().maximize();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        loginPage.clickOnForForm();
        loginPage.typeNameContact("Oks");
        loginPage.typeEmailContact("test@test.com");
        loginPage.clickOnSubmitContact();
     //  Assert.assertTrue(driver.findElement(By.xpath("html/body/div[5]/div")).isDisplayed());

    }
    @AfterTest
    public void after() {
        driver.quit();
    }
}