package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.JsonHelper;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class SalesAutoPCROPage extends peststreamPage {

	BaseUtills utills = new BaseUtills();
	private Map<String, Integer> jsonData;

	@FindBy(xpath = "//span[contains(text(),'Appointments')]")
	private WebElementFacade appointmentTab;

	@FindBy(xpath = "//span[contains(text(),'Sales Appointment')]")
	private WebElementFacade salesAppTab;

	@FindBy(xpath = "//*[@id=\"AllTab\"]/a")
	private WebElementFacade AllTab;

	@FindBy(xpath = "(//button[contains(@class,'btn dropdown-toggle selectpicker btn-default')])[3]")
	private WebElementFacade categoryDDL;

	@FindBy(xpath = "//*[@id=\"divpackage\"]/div[1]/div/div/div/ul/li[4]/a")
	private WebElementFacade categoryValue;

	@FindBy(xpath = "//*[@id=\"Services\"]")
	private WebElementFacade serviceDDL;

	@FindBy(xpath = "//*[@id=\"Services\"]/option[3]")
	private WebElementFacade serviceValue;

	@FindBy(xpath = "//*[@id=\"Package\"]")
	private WebElementFacade packageDDL;

	@FindBy(xpath = "//*[@id=\"Package\"]/option[2]")
	private WebElementFacade packageValue;

	@FindBy(xpath = "//*[@id=\"Frequencies\"]")
	private WebElementFacade frequencyDDL;

	@FindBy(xpath = "//*[@id=\"Frequencies\"]/option[2]")
	private WebElementFacade frequenciValue;

	@FindBy(xpath = "//*[@id=\"submitserv\"]")
	private WebElementFacade addBtn;

	@FindBy(xpath = "//input[contains(@class,'ServiceChk')]")
	private WebElementFacade agreementCheckBtn;

	@FindBy(xpath = "//*[@id=\"CouponCode\"]")
	private WebElementFacade enterCoupon;

	@FindBy(xpath = "//*[@id=\"submitserv\"]")
	private WebElementFacade sbmitBtn;

	@FindBy(xpath = "//*[@id=\"submit44\"]")
	private WebElementFacade savSignAgreement;

	@FindBy(xpath = "(//*[@id=\"submit\"])[2]")
	private WebElementFacade salesSvCon;

	@FindBy(xpath = "//*[@id=\"btnSetup1\"]")
	private WebElementFacade initialSetup;

	@FindBy(xpath = "(//*[@id=\"btnSubmitAgreement1\"])[1]")
	private WebElementFacade saveCont;

	@FindBy(xpath = "//button[contains(@class,'btn blue button-next ladda-button formSendButton')]")
	private WebElementFacade mailSend;

	@Override
	public WebElementFacade getUniqueElement() {

		return null;
	}

	public void appoinment_tab() {
		appointmentTab.click();
		waitABit(2000);

	}

	public void salesApp_tab() {
		salesAppTab.click();
		waitABit(1000);
		AllTab.click();
		waitABit(1000);
	}

	public void package_details() {
		categoryDDL.click();
		categoryValue.click();
		waitABit(1000);
		serviceDDL.click();
		waitABit(1000);
		serviceValue.click();
		waitABit(2000);
		packageDDL.click();
		packageValue.click();
		waitABit(2000);
		frequencyDDL.click();
		frequenciValue.click();
		waitABit(1000);
		// addBtn.click();

	}

	public void add_btn() {
		sbmitBtn.click();
		waitABit(2000);
		enterCoupon.sendKeys("enterCoupon...");

	}

	public void addTo_agreement() {

		// agreementCheckBtn.click();
		// waitABit(1000);
		// scrollToClickAnelement(savSignAgreement);
		waitABit(3000);

		// Alert a=getDriver().switchTo().alert();
		// System.out.println(a.getText());
		// a.accept();
		//
		// waitABit(2000);
		// agreementCheckBtn.click();
		// waitABit(3000);
		//
	}

	public void svAndsignAgreeBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(savSignAgreement));

		scrollToClickAnelement(savSignAgreement);
		scrollToClickAnelement(savSignAgreement);

	}

	public void svContOnsales_app() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(salesSvCon));

		salesSvCon.click();
		waitABit(4000);

	}

	public void svContOnAgree_tab() {
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", saveCont);
		saveCont.click();
		waitABit(1000);

	}

	public void send_agreement() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(mailSend));

		mailSend.click();

	}

	public void intial_setup() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(initialSetup));

		initialSetup.click();
		waitABit(6000);

	}

}
