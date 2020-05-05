package com.infocrats.pageObjects;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.Log;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class peststreamHomePage extends peststreamPage {
	BaseUtills baseUtils;
	@FindBy(xpath = "//a[@href='/']/span")
	private WebElementFacade dashboard_page;

	@FindBy(xpath = "//div[3]/div[2]/div[1]/h4")
	private WebElementFacade pageTitle;
	
	@FindBy(id = "btnSearch")
	private WebElementFacade searchBtn;

	
	public void dashboardPage() {
		waitFor(dashboard_page);
		baseUtils.isElementVisible(pageTitle);
		baseUtils.isClickable(searchBtn);
		Log.info("land on dashboard page");
	}
	public void clickOnLogoutBtn() {
		try {
			Log.info("Logout from application");
		} catch (Exception e) {
			Log.error("User must login to application first before clicking Logout");
		}

	}

	public void titelOfThePage() {
		getDriver().getTitle();
	}

	@Override
	public WebElementFacade getUniqueElement() {
		
		return pageTitle;
	}

}
