package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormsOnMainPage {

    By request = By.xpath("html/body/div[1]/main/div[2]/div/a[2]/span/em");
    By nameField = By.xpath("html/body/div[1]/main/div[2]/form[2]/div[2]/div[3]/input");
    By emailField = By.xpath("html/body/div[1]/main/div[2]/form[2]/div[2]/div[4]/input");
    By phoneField = By.xpath("html/body/div[1]/main/div[2]/form[2]/div[2]/div[5]/input");
    By commentField = By.xpath("html/body/div[1]/main/div[2]/form[2]/div[2]/div[6]/textarea");
    By submitButton = By.xpath("html/body/div[1]/main/div[2]/form[2]/div[2]/div[7]/button");
    By successMessage = By.xpath("html/body/div[5]/div");
    //questionToVet form
    By questionToVet = By.xpath("html/body/div[1]/main/div[2]/div/a[1]");
    By nameFieldVet = By.xpath("html/body/div[1]/main/div[2]/form[1]/div[2]/div[3]/input");
    By emailFieldVet = By.xpath("html/body/div[1]/main/div[2]/form[1]/div[2]/div[4]/input");
    By phoneFieldVet = By.xpath("html/body/div[1]/main/div[2]/form[1]/div[2]/div[5]/input");
    By commentFieldVet = By.xpath("html/body/div[1]/main/div[2]/form[1]/div[2]/div[6]/textarea");
    By submitButtonVet = By.xpath("html/body/div[1]/main/div[2]/form[1]/div[2]/div[7]/button");
    By successMessageVet = By.xpath("html/body/div[5]/div");

    //contactForm
    By nameContact = By.xpath("html/body/footer/div/div[1]/div[1]/div/div[2]/div/div[2]/form/label[1]/input");
    By emailContact = By.xpath("html/body/footer/div/div[1]/div[1]/div/div[2]/div/div[2]/form/label[2]/input");
    By submitButtonContact = By.xpath("html/body/footer/div/div[1]/div[1]/div/div[2]/div/div[2]/form/input");
    By buttonForForm = By.xpath("html/body/footer/div/div[1]/div[1]/div/div[2]/div/div[1]");

    private final WebDriver driver;

    public FormsOnMainPage(WebDriver driver) {
        this.driver = driver;
    }
    //question to admin form
    public FormsOnMainPage typeName(String username) {
        driver.findElement(nameField).sendKeys(username);
        return this;
    }

    public FormsOnMainPage typeEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public FormsOnMainPage typePhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
        return this;
    }
    public FormsOnMainPage typeComment(String comment) {
        driver.findElement(commentField).sendKeys(comment);
        return this;
    }
    public FormsOnMainPage clickOnSubmit() {
        driver.findElement(submitButton).click();
        return this;
    }
    public FormsOnMainPage clickOnRequest() {
        driver.findElement(request).click();
        return this;
    }
    public FormsOnMainPage open() {
        driver.get("http://korm.ua/");
        return this;
    }
//questionToVet form


    public FormsOnMainPage typeNameVet(String username) {
        driver.findElement(nameFieldVet).sendKeys(username);
        return this;
    }

    public FormsOnMainPage typeEmailVet(String email) {
        driver.findElement(emailFieldVet).sendKeys(email);
        return this;
    }

    public FormsOnMainPage typePhoneVet(String phone) {
        driver.findElement(phoneFieldVet).sendKeys(phone);
        return this;
    }
    public FormsOnMainPage typeCommentVet(String comment) {
        driver.findElement(commentFieldVet).sendKeys(comment);
        return this;
    }
    public FormsOnMainPage clickOnSubmitVet() {
        driver.findElement(submitButtonVet).click();
        return this;
    }
    public FormsOnMainPage clickOnRequestVet() {
        driver.findElement(questionToVet).click();
        return this;
    }

    //contactForm
    public FormsOnMainPage typeNameContact(String username) {
        driver.findElement(nameContact).sendKeys(username);
        return this;
    }

    public FormsOnMainPage typeEmailContact(String email) {
        driver.findElement(emailContact).sendKeys(email);
        return this;
    }

    public FormsOnMainPage clickOnSubmitContact() {
        driver.findElement(submitButtonContact).click();
        return this;
    }
    public FormsOnMainPage clickOnForForm() {
        driver.findElement(buttonForForm).click();
        return this;
    }


}