package com.infocrats.steps;

import com.infocrats.pageObjects.peststreamHomePage;
import com.infocrats.pageObjects.SignInPage;
import com.infocrats.utils.Log;

import net.thucydides.core.annotations.Step;

public class SignInSteps extends pestreamSteps {
	SignInPage signInPage;
	peststreamHomePage homePage;

	@Step
	public void openURL() {
		signInPage.open();
		Log.info("Launching the browser");
		getDriver().manage().window().maximize();
	}

	@Step
	public void loginToPeststream(String loginDetails) {

		signInPage.login(loginDetails);

	}

	@Step
	public void clickLoginBtnStep() {
		signInPage.clickOnSignInBtn();
	}
	@Step
	public void sendCompanynaMe() {
		signInPage.sendNameOfCompany();
	}


	@Step
	public void validateMAindashBoardPage() {
		homePage.dashboardPage();
	}

	@Step
	public void validateErrorMessage() {
		signInPage.loginFailedErrorMessage();

	}

}
