package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.ExcelUtils;
import com.infocrats.utils.JsonHelper;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ExitingUserPCROPage extends peststreamPage {

	BaseUtills utills = new BaseUtills();
	private Map<String, Integer> jsonData;
	static int rowNum;
	{
		ExcelUtils.setExcelFile("LoginPage");
	}

	@FindBy(xpath = "//*[@id=\"accountSaleshead\"]")
	private WebElementFacade exitAcct;

	@FindBy(xpath = "//*[@id=\"s2id_PrimaryServiceId\"]/a")
	private WebElementFacade service_ddl;

	@FindBy(xpath = "//*[@id=\"frmGeneralInfo\"]/div/div/div[3]/div[5]/div[2]/div/div")
	private WebElementFacade source_ddl;

	@FindBy(xpath = " //*[@id=\"frmGeneralInfo\"]/div/div/div[3]/div[5]/div[2]/div/div/div/ul/li[2]/a")
	private WebElementFacade customerPortalApp;

	@FindBy(linkText = "Customer")
	private WebElementFacade customerTab;

	@FindBy(linkText = "Opportunity")
	private WebElementFacade opportunityTab;

	@FindBy(xpath = "//*[@id=\"btnAdvanceSearch\"]")
	private WebElementFacade advBtn;

	@FindBy(xpath = "//*[@id=\"openTab\"]")
	private WebElementFacade open_tab;

	@FindBy(xpath = "(//*[@onClick=\"SaveFilterValues_Session()\"])[1]")
	private WebElementFacade selectOppo;

	@FindBy(xpath = "//*[@id=\"Note\"]")
	private WebElementFacade note;

	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade saveNote;
	
//	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
//	private WebElementFacade save_bttn;
	

	@FindBy(xpath = "//*[@id=\"btnContinueSalesProcess\"]") // *[@id="s2id_SelectServicePackageVm_ServiceMasterId"]
	private WebElementFacade contSalesProcess;

	@FindBy(xpath = "//input[@id='CompanyKey']")
	private WebElementFacade companyKey;
	@FindBy(xpath = "//input[@id='EmailOrUserName']")
	private WebElementFacade emailOrUserName;
	@FindBy(xpath = "//input[@id='Password']")
	private WebElementFacade password;
	@FindBy(xpath = "//button[@class='btn btn-success uppercase']")
	private WebElementFacade login;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div/button[1]")
	private WebElementFacade buttonforfocus;

	@FindBy(xpath = "//*[@id=\"AccountDescription\"]")
	private WebElementFacade newapapa;

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[9]/a ")
	private WebElementFacade appointmentTab;

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[9]/ul/li[1]/a")
	private WebElementFacade salesAppTab;

	@FindBy(xpath = "(//button[contains(@class,'btn dropdown-toggle selectpicker btn-default')])[3]")
	private WebElementFacade categoryDDL;

	@FindBy(xpath = "(//*[contains(@class,'opt')])[11]")
	private WebElementFacade categoryValue;

	@FindBy(xpath = "//*[@id=\"Services\"]")
	private WebElementFacade serviceDDL;

	@FindBy(xpath = "//*[@id=\"Services\"]/option[2]")
	private WebElementFacade serviceValue;

	@FindBy(xpath = "//*[@id=\"Package\"]")
	private WebElementFacade packageDDL;

	@FindBy(xpath = "//div[@class='select2-result-label'][contains(.,'One Time')]")
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

	@FindBy(xpath = "(//*[@id=\"submit2\"])[2]")
	private WebElementFacade mailSend;

	@FindBy(xpath = "(//*[@id=\"btnSubmitAgreement1\"])[1]")
	private WebElementFacade saveCont;

	@FindBy(xpath = "//input[contains(@name,'SpRequiredServiceAddressControl.ServiceAddressLine1')]")
	private WebElementFacade addr;
	@FindBy(xpath = "//input[contains(@class,'letters empty-zillow')]")
	private WebElementFacade zip;
	@FindBy(xpath = "//input[@name='SpRequiredServiceAddressControl.ServiceCityName']")
	private WebElementFacade city;

	@FindBy(xpath = "//div[@id='s2id_SelectServicePackageVm_ServiceMasterId']//a[@class='select2-choice']")
	private WebElementFacade serviceDDL_phnSales;

	@FindBy(xpath = "//div[@class='select2-result-label'][contains(.,'Pest Control')]")
	private WebElementFacade serviceValue_phnSales;

	@FindBy(xpath = "//div[@id='s2id_SelectServicePackageVm_PackageId']//a[@class='select2-choice']")
	private WebElementFacade package_ddl;

	@FindBy(xpath = "//div[@class='select2-result-label'][contains(.,'PestControl_Pckg_OneTime')]")
	private WebElementFacade package_value;

	@FindBy(xpath = "//*[@id=\"s2id_SelectServicePackageVm_FrequencyId\"]/a")
	private WebElementFacade frequency_ddl;

	@FindBy(xpath = "//div[@class='select2-result-label'][contains(.,'One Time')]")
	private WebElementFacade frequency_value;

	@Override
	public WebElementFacade getUniqueElement() {

		return null;
	}

	public void exit_acct(String acctDetails) throws Exception {

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(exitAcct));
		exitAcct.sendKeys("2984");
		// exitAcct.sendKeys(Keys.DOWN);
		// waitABit(3000);
		// exitAcct.sendKeys(Keys.ENTER);
		// waitABit(5000);

	}

	public void serviceAnd_source() throws Exception {
		service_ddl.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(service_ddl));
		service_ddl.sendKeys(Keys.DOWN);
		waitABit(jsonData.get("Time3"));
		service_ddl.sendKeys(Keys.ENTER);
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(source_ddl));
		source_ddl.click();
		waitABit(jsonData.get("Time3"));
		customerPortalApp.click();

	}

	public void customer_tab() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(customerTab));
		customerTab.click();

	}

	public void opportunity_tab() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(opportunityTab));
		opportunityTab.click();

	}

	public void advSrch_btn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(advBtn));
		waitABit(jsonData.get("Time3"));
		advBtn.click();

	}

	public void open_tab() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(open_tab));
		scrollUP(open_tab);
		waitABit(jsonData.get("Time3"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(open_tab));
		open_tab.click();
		waitABit(jsonData.get("Time3"));

	}

	public void select_opp() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(selectOppo));
		selectOppo.click();

	}

	public void write_note() throws Exception {
		note.sendKeys("note.......................");
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveNote));
		saveNote.click();
	}

//	public void sv_btn() {
//
//		save_bttn.click();
//
////		String MainWindow = getDriver().getWindowHandle(); // get parent(current) window name
////		for (String agreement : getDriver().getWindowHandles()) // iterating on child windows
////		{
////			getDriver().switchTo().window(agreement);
////		}
//	}

	public void appoinment_tab() throws Exception {

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(appointmentTab));
		appointmentTab.click();

	}

	public void salesApp_tab() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(salesAppTab));
		salesAppTab.click();

	}

	public void servicePackage_details() throws Exception {
		categoryDDL.click();
		categoryValue.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(serviceDDL));
		serviceDDL.click();
		serviceValue.click();
		waitABit(jsonData.get("Time3"));
		packageDDL.click();
		packageValue.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(frequencyDDL));
		frequencyDDL.click();
		frequenciValue.click();

	}

	public void add_btn() throws Exception {

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(sbmitBtn));
		sbmitBtn.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(enterCoupon));
		enterCoupon.sendKeys("enterCoupon...");
	}

	public void agreementCheck_btn() throws Exception {

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(agreementCheckBtn));
		agreementCheckBtn.click();
		waitABit(jsonData.get("Time3"));

	}

	public void sign_agreement() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(savSignAgreement));
		scrollToClickAnelement(savSignAgreement);
		scrollToClickAnelement(savSignAgreement);
		waitABit(jsonData.get("Time3"));

	}

	public void salesAppoSvCon_btn() throws Exception {

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(salesSvCon));
		salesSvCon.click();
	}

	public void sav_con() throws Exception {
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", saveCont);
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(saveCont));
		saveCont.click();
	}

	public void sent_mail() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(mailSend));
		mailSend.click();

	}

	public void initial_steup() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(initialSetup));
		initialSetup.click();
		waitABit(jsonData.get("Time3"));

	}

	public void packageDetailsOnPhn_sales() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(addr));
		addr.sendKeys("streets of boston ");
		waitABit(jsonData.get("Time3"));
		zip.sendKeys("654156");
		waitABit(jsonData.get("Time3"));
		city.sendKeys("boston");
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait3 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait3.until(ExpectedConditions.elementToBeClickable(serviceDDL_phnSales));
		serviceDDL_phnSales.click();
		serviceValue_phnSales.click();
		waitABit(jsonData.get("Time3"));
		package_ddl.click();
		package_value.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(frequency_ddl));
		frequency_ddl.click();
		waitABit(jsonData.get("Time3"));
		frequency_value.click();
		waitABit(jsonData.get("Time3"));
		waitABit(jsonData.get("Time3"));
	}
}