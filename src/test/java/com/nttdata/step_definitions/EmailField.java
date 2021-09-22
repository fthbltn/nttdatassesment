package com.nttdata.step_definitions;

import com.nttdata.pages.FormPage;
import com.nttdata.utilities.ConfigurationReader;
import com.nttdata.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;

public class EmailField {
    FormPage formPage = new FormPage();

    @Given("user is on the form page")
    public void user_is_on_the_form_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("user enter the valid credentials for name")
    public void user_enter_the_valid_credentials_for_name() {
        formPage.firstName.sendKeys("Mike");
        formPage.lastName.sendKeys("Smith");
    }

    @When("user do not enter the correct {string} format")
    public void user_do_not_enter_the_correct_format(String email) {

        formPage.userEmail.sendKeys(email);
    }

    @When("user selected the gender")
    public void user_selected_the_gender() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", formPage.genderFemale);
    }

    @When("user entered the correct the mobile number")
    public void user_entered_the_correct_the_mobile_number() {
        formPage.MobileNumber.sendKeys("1234567890");
    }

    @Then("user should not be able to submit the form")
    public void user_should_not_be_able_to_submit_the_form() {
        formPage.submitBttn.submit();

        try {
            String message = Driver.get().findElement(By.id("example-modal-sizes-title-lg")).getText();
            Assert.assertNotEquals("Thanks for submitting the form", message);

        } catch (NoSuchElementException e) {
            System.out.println("There is no such element");
        }
    }

    @When("user enter the correct {string} format")
    public void user_enter_the_correct_format(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should be able to submit the form")
    public void user_should_be_able_to_submit_the_form() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
