package com.infocrats.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.ExcelUtils;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ExitingUserPCROPage extends peststreamPage {

	BaseUtills utills = new BaseUtills();
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

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[4]")
	private WebElementFacade customerTab;

	@FindBy(xpath = "//span[contains(@class,'title')][contains(text(),'Opportunity')]")
	private WebElementFacade opportunityTab;

	@FindBy(xpath = "//*[@id=\"btnAdvanceSearch\"]")
	private WebElementFacade advBtn;

	@FindBy(xpath = "//*[@id=\"openTab\"]")
	private WebElementFacade open_tab;

	@FindBy(xpath = "//*[@id=\"sample_1\"]/tbody/tr/td[2]/a")
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

	public void exit_acct(String acctDetails) {

		exitAcct.sendKeys("2984");
		waitABit(4000);
		// exitAcct.sendKeys(Keys.DOWN);
		// waitABit(3000);
		// exitAcct.sendKeys(Keys.ENTER);
		// waitABit(5000);

	}

	public void serviceAnd_source() {
		service_ddl.click();
		waitABit(5000);
		service_ddl.sendKeys(Keys.DOWN);
		waitABit(3000);
		service_ddl.sendKeys(Keys.ENTER);
		waitABit(2000);
		source_ddl.click();
		waitABit(1000);
		customerPortalApp.click();

	}

	public void customer_tab() {
		customerTab.click();
		waitABit(1000);

	}

	public void opportunity_tab() {
		opportunityTab.click();
		waitABit(2000);

	}

	public void advSrch_btn() {
		advBtn.click();
		waitABit(3000);

	}

	public void open_tab() {
		scrollUP(open_tab);
		waitABit(2000);
		open_tab.click();
		waitABit(4000);

	}

	public void select_opp() {
		waitABit(2000);
		selectOppo.click();
		waitABit(3000);

	}

	public void write_note() {
		note.sendKeys("note.......................");
		waitABit(3000);
		saveNote.click();
		waitABit(4000);
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

	public void appoinment_tab() {

		appointmentTab.click();
		waitABit(2000);

	}

	public void salesApp_tab() {
		salesAppTab.click();
		waitABit(2000);

	}

	public void servicePackage_details() {
		categoryDDL.click();
		categoryValue.click();
		waitABit(1000);
		serviceDDL.click();
		serviceValue.click();
		waitABit(1000);
		packageDDL.click();
		packageValue.click();
		waitABit(1000);
		frequencyDDL.click();
		frequenciValue.click();
		waitABit(1000);

	}

	public void add_btn() {
		sbmitBtn.click();
		waitABit(2000);
		enterCoupon.sendKeys("enterCoupon...");
	}

	public void agreementCheck_btn() {

		agreementCheckBtn.click();
		waitABit(3000);

	}

	public void sign_agreement() {
		scrollToClickAnelement(savSignAgreement);
		// waitABit(2000);
		scrollToClickAnelement(savSignAgreement);
		waitABit(4000);

	}

	public void salesAppoSvCon_btn() {

		salesSvCon.click();
		waitABit(4000);
	}

	public void sav_con() {
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", saveCont);
		saveCont.click();
		waitABit(1000);
	}

	public void sent_mail() {
		mailSend.click();
		waitABit(2000);

	}

	public void initial_steup() {
		initialSetup.click();
		waitABit(6000);

	}

	public void packageDetailsOnPhn_sales() {
		waitABit(2000);
		addr.sendKeys("streets of boston ");
		waitABit(2000);
		zip.sendKeys("654156");
		waitABit(2000);
		city.sendKeys("boston");
		waitABit(2000);
		serviceDDL_phnSales.click();
		serviceValue_phnSales.click();
		waitABit(2000);
		package_ddl.click();
		package_value.click();
		waitABit(2000);
		frequency_ddl.click();
		waitABit(2000);
		frequency_value.click();
		waitABit(2000);
		waitABit(2000);
	}
}