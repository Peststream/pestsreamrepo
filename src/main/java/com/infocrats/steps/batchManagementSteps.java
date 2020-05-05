package com.infocrats.steps;


import com.infocrats.pageObjects.batchManagementPage;

public class batchManagementSteps extends pestreamSteps {
	batchManagementPage batchmanagementpage;

	public void BatchManagementBtn() {
		batchmanagementpage.batchmanagementBtn();
		
	}

	public void AddBatchBtn() {
		batchmanagementpage.addBatchBtn();
		
	}

	public void batchTypreRadio() {
		batchmanagementpage.BatchTypeRadioBtn();
		
	}

	public void batchNameDate() {
		batchmanagementpage.BranchNameDate();
	}

	public void WorkOrderCheckBox() {
		batchmanagementpage.WorkOrderChckBox();
		
	}

	public void SaveButtonBatch() {
		batchmanagementpage.SaveBtnBAtchManagement();
		
	}

	public void batchRelease() {
		batchmanagementpage.batchReleaseAction();
		
	}

	public void batchReleaseTab() {
		batchmanagementpage.releaseBatchTab();
		
	}
}