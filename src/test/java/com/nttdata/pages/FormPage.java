package com.nttdata.pages;

import com.nttdata.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage extends BasePage {

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy (id = "lastName")
    public WebElement lastName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(id = "gender-radio-1")
    public WebElement genderMale;

    @FindBy(id = "gender-radio-2")
    public WebElement genderFemale;

    @FindBy(id = "gender-radio-3")
    public WebElement genderOther;

    @FindBy(id = "userNumber")
    public WebElement MobileNumber;

    @FindBy(id = "submit")
    public WebElement submitBttn;

    public void credentials(String firstN, String lastN, String email, String gender){
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();

        firstName.sendKeys(firstN);
        lastName.sendKeys(lastN);
        userEmail.sendKeys(email);
        switch (gender){
            case "Male":
            case "male":
                jse.executeScript("arguments[0].click();", genderMale);
                break;

            case "Female":
            case "female":
                jse.executeScript("arguments[0].click();", genderFemale);
                break;

            case "Other":
            case "other":
                jse.executeScript("arguments[0].click();", genderOther);
                break;
        }





    }
}
