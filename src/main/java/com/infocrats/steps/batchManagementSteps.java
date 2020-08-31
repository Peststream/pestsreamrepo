package com.infocrats.steps;


import com.infocrats.pageObjects.batchManagementPage;

public class batchManagementSteps extends pestreamSteps {
	batchManagementPage batchmanagementpage;

	public void BatchManagementBtn() throws Exception {
		batchmanagementpage.batchmanagementBtn();
		
	}

	public void AddBatchBtn() throws Exception {
		batchmanagementpage.addBatchBtn();
		
	}

	public void batchTypreRadio() throws Exception {
		batchmanagementpage.BatchTypeRadioBtn();
		
	}

	public void batchNameDate() throws Exception {
		batchmanagementpage.BranchNameDate();
	}

	public void WorkOrderCheckBox() throws Exception {
		batchmanagementpage.WorkOrderChckBox();
		
	}

	public void SaveButtonBatch() throws Exception {
		batchmanagementpage.SaveBtnBAtchManagement();
		
	}

	public void batchRelease() throws Exception {
		batchmanagementpage.batchReleaseAction();
		
	}

	public void batchReleaseTab() throws Exception {
		batchmanagementpage.releaseBatchTab();
		
	}
}