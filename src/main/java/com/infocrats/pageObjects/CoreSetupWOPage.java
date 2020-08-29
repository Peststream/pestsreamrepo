package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infocrats.steps.pestreamSteps;
import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.JsonHelper;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CoreSetupWOPage extends pestreamSteps {

	BaseUtills utills = new BaseUtills();
	private Map<String, Integer> jsonData;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[7]/a")
	private WebElementFacade setupTab;
	
	@FindBy(xpath = "//*[@id=\"btnAdvanceSearchSetup\"]")
	private WebElementFacade advSearch_btn;
	
	@FindBy(xpath = "(//a[@class='btn btn-icon-only red'])[2]")
	private WebElementFacade action_btn;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[6]/a")
	private WebElementFacade serviceBtn_tab;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[6]/ul/li[2]/a")
	private WebElementFacade workOrder_tab;
	
	@FindBy(xpath = "//*[@id=\"btnAdvanceSearch\"]")
	private WebElementFacade adv_search;
	
	@FindBy(xpath = "//*[@id=\"btnSubmit\"]")
	private WebElementFacade svBtn;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[6]/ul/li[1]")
	private WebElementFacade pendingSetup;
	
	@FindBy(xpath = "//*[@id=\"sample_1\"]/tbody/tr[1]/td[1]/span")
	private WebElementFacade addIcon;
	
	@FindBy(xpath = "//*[@id=\"sample_1\"]/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input")
	private WebElementFacade addService;
	
	@FindBy(xpath = "//*[@id=\"sample_1\"]/tbody/tr[1]/td[6]/a[1]")
	private WebElementFacade viewSetup;
	
	@FindBy(xpath = "//*[@id=\"btnSubmit\"]")
	private WebElementFacade saveBtn;

	public void setup_tab() {
		setupTab.click();
		
	}

	public void advSearch_btn() throws Exception {
		
		advSearch_btn.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(action_btn));
		
	}

	public void action_btn() throws Exception {
		action_btn.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(serviceBtn_tab));
		
	}

	public void service_tab() throws Exception {
		serviceBtn_tab.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(workOrder_tab));
		
	}

	public void workOrder_tab() throws Exception {
		workOrder_tab.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(adv_search));
		
	}
	
	public void advsearch_btn() throws Exception {
		adv_search.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(svBtn));
	}

	public void svWork_order() throws Exception {
		svBtn.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(pendingSetup));
		
	}

	public void pending_tab() throws Exception {
		pendingSetup.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(addIcon));
		
	}

	public void add_icon() throws Exception {
		addIcon.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(addService));
		
	}

	public void check_service() throws Exception {
		addService.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(viewSetup));
		
	}

	public void view_setup() throws Exception {
		viewSetup.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
		
	}

	public void sv_btn() throws Exception {
		saveBtn.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
		
	}

	
}
