package com.infocrats.pageObjects;

import com.infocrats.steps.pestreamSteps;
import com.infocrats.utils.BaseUtills;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CoreSetupWOPage extends pestreamSteps {

	BaseUtills utills = new BaseUtills();
	
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

	public void advSearch_btn() {
		
		advSearch_btn.click();
		waitABit(2000);
		
	}

	public void action_btn() {
		action_btn.click();
		waitABit(6000);
		
	}

	public void service_tab() {
		serviceBtn_tab.click();
		waitABit(2000);
		
	}

	public void workOrder_tab() {
		workOrder_tab.click();
		waitABit(2000);
		
	}
	
	public void advsearch_btn() {
		adv_search.click();
		waitABit(2000);
	}

	public void svWork_order() {
		svBtn.click();
		waitABit(5000);
		
	}

	public void pending_tab() {
		pendingSetup.click();
		waitABit(4000);
		
	}

	public void add_icon() {
		addIcon.click();
		waitABit(2000);
		
	}

	public void check_service() {
		addService.click();
		waitABit(2000);
		
	}

	public void view_setup() {
		viewSetup.click();
		waitABit(2000);
		
	}

	public void sv_btn() {
		saveBtn.click();
		waitABit(5000);
		
	}

	
}
