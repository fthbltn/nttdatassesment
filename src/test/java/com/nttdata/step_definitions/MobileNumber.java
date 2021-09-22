package com.nttdata.step_definitions;

import com.nttdata.pages.FormPage;
import io.cucumber.java.en.*;

import java.util.Map;

public class MobileNumber {
    FormPage formPage = new FormPage();

    @When("user enter the valid credentials")
    public void user_enter_the_valid_credentials(Map<String ,String> userInfo) {

        formPage.credentials(userInfo.get("firstName"),userInfo.get("lastName"),userInfo.get("email"),userInfo.get("gender"));
    }

    @When("user do not entered the correct the {string}")
    public void user_do_not_entered_the_correct_the(String mobileNumber) {

        formPage.MobileNumber.sendKeys(mobileNumber);
    }

    @When("user entered the correct the {string}")
    public void user_entered_the_correct_the(String mobileNumber) {

        formPage.MobileNumber.sendKeys(mobileNumber);
    }

}
