package com.infocrats.stepdefs;

import com.infocrats.steps.MechCsrSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MechCsrStepDefs {
	
	@Steps
	MechCsrSteps mechcsrsteps;
	
	

@When("^user click on CSRDashBoard_Mech$")
public void user_click_on_CSRDashBoard_Mech() throws Exception {
	mechcsrsteps.CSRDashBoard_Mech();
}

@When("^user clicked on AdvanceSearch_CSRDB_Mech$")
public void user_clicked_on_AdvanceSearch_CSRDB_Mech() throws Exception {
	mechcsrsteps.AdvanceSearch_CSRDB_Mech();
}

@Then("^click on MechOpp_CSRDB_Mech$")
public void click_on_MechOpp_CSRDB_Mech() {
	mechcsrsteps.MechOpp_CSRDB_Mech();
}


@Then("^click on CallBttn_CSRDB_Mech$")
public void click_on_CallBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.CallBttn_CSRDB_Mech();
}

@Then("^click on DDCalledFor_CallBttn_CSRDB_Mech$")
public void click_on_DDCalledFor_CallBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.DDCalledFor_CallBttn_CSRDB_Mech();
}

@Then("^click on ValueDDCalledFor_CallBttn_CSRDB_Mech$")
public void click_on_ValueDDCalledFor_CallBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.ValueDDCalledFor_CallBttn_CSRDB_Mech();
}

@Then("^click on Des_CallBttn_CSRDB_Mech$")
public void click_on_Des_CallBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.Des_CallBttn_CSRDB_Mech();
}

@Then("^click on Note_CallBttn_CSRDB_Mech$")
public void click_on_Note_CallBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.Note_CallBttn_CSRDB_Mech();
}

@Then("^click on Save_CallBttn_CSRDB_Mech$")
public void click_on_Save_CallBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.Save_CallBttn_CSRDB_Mech();
}


@Then("^click on ThreeNext_CallBttn_CSRDB_Mech$")
public void click_on_ThreeNext_CallBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.ThreeNext_CallBttn_CSRDB_Mech();
}


@Then("^click on AccountNo_CSRDB_Mech$")
public void click_on_AccountNo_CSRDB_Mech() throws Exception {
	mechcsrsteps.AccountNo_CSRDB_Mech();
}

@Then("^click on OkAccountAlert_CSRDB_Mech$")
public void click_on_OkAccountAlert_CSRDB_Mech() {
	mechcsrsteps.OkAccountAlert_CSRDB_Mech();
}

@Then("^click on AddCallBttn_CSRDB_Mech$")
public void click_on_AddCallBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.AddCallBttn_CSRDB_Mech();
}

@Then("^click on DDTarget_CSRDB_Mech$")
public void click_on_DDTarget_CSRDB_Mech() throws Exception {
	mechcsrsteps.DDTarget_CSRDB_Mech();
}

@Then("^click on ValueDDTarget_CSRDB_Mech$")
public void click_on_ValueDDTarget_CSRDB_Mech() throws Exception {
	mechcsrsteps.ValueDDTarget_CSRDB_Mech();
}


@Then("^click on AddOppBttn_CSRDB_Mech$")
public void click_on_AddOppBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.AddOppBttn_CSRDB_Mech();
}

@Then("^click on SecondaryPhoneNo_Opp_CSRDB_Mech$")
public void click_on_SecondaryPhoneNo_Opp_CSRDB_Mech() throws Exception {
	mechcsrsteps.SecondaryPhoneNo_Opp_CSRDB_Mech();
}

@Then("^click on DDDep_Opp_CSRDB_Mech$")
public void click_on_DDDep_Opp_CSRDB_Mech() throws Exception {
	mechcsrsteps.DDDep_Opp_CSRDB_Mech();
}

@Then("^click on ValueDDDep_Opp_CSRDB_Mech$")
public void click_on_ValueDDDep_Opp_CSRDB_Mech() throws Exception {
	mechcsrsteps.ValueDDDep_Opp_CSRDB_Mech();
}

@Then("^click on DDService_Opp_CSRDB_Mech$")
public void click_on_DDService_Opp_CSRDB_Mech() throws Exception {
	mechcsrsteps.DDService_Opp_CSRDB_Mech();
}

@Then("^click on ValueDDService_Opp_CSRDB_Mech$")
public void click_on_ValueDDService_Opp_CSRDB_Mech() throws Exception {
	mechcsrsteps.ValueDDService_Opp_CSRDB_Mech();
}

@Then("^click on DDSource_Opp_CSRDB_Mech$")
public void click_on_DDSource_Opp_CSRDB_Mech() throws Exception {
	mechcsrsteps.DDSource_Opp_CSRDB_Mech();
}

@Then("^click on ValueDDSource_Opp_CSRDB_Mech$")
public void click_on_ValueDDSource_Opp_CSRDB_Mech() throws Exception {
	mechcsrsteps.ValueDDSource_Opp_CSRDB_Mech();
}

@Then("^click on Cont_Opp_CSRDB_Mech$")
public void click_on_Cont_Opp_CSRDB_Mech() throws Exception {
	mechcsrsteps.Cont_Opp_CSRDB_Mech();
}


@Then("^click on AddWOBttn_CSRDB_Mech$")
public void click_on_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.AddWOBttn_CSRDB_Mech();
}

@Then("^click on KeepSameBillingAddress_AddWOBttn_CSRDB_Mech$")
public void click_on_KeepSameBillingAddress_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.KeepSameBillingAddress_AddWOBttn_CSRDB_Mech();
}

@Then("^click on Notes_AddWOBttn_CSRDB_Mech$")
public void click_on_Notes_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.Notes_AddWOBttn_CSRDB_Mech();
}

@Then("^click on Direction_AddWOBttn_CSRDB_Mech$")
public void click_on_Direction_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.Direction_AddWOBttn_CSRDB_Mech();
}

@Then("^click on ServiceDatePOP_AddWOBttn_CSRDB_Mech$")
public void click_on_ServiceDatePOP_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.ServiceDatePOP_AddWOBttn_CSRDB_Mech();
}

@Then("^click on ServiceDateValue_AddWOBttn_CSRDB_Mech$")
public void click_on_ServiceDateValue_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.ServiceDateValue_AddWOBttn_CSRDB_Mech();
}

@Then("^click on RangeTimeRdioBttn_AddWOBttn_CSRDB_Mech$")
public void click_on_RangeTimeRdioBttn_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.RangeTimeRdioBttn_AddWOBttn_CSRDB_Mech();
}

@Then("^click on DDTimeRange_AddWOBttn_CSRDB_Mech$")
public void click_on_DDTimeRange_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.DDTimeRange_AddWOBttn_CSRDB_Mech();
}

@Then("^click on ValueTimeRange_AddWOBttn_CSRDB_Mech$")
public void click_on_ValueTimeRange_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.ValueTimeRange_AddWOBttn_CSRDB_Mech();
}

@Then("^click on DDSecondTimeRange_AddWOBttn_CSRDB_Mech$")
public void click_on_DDSecondTimeRange_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.DDSecondTimeRange_AddWOBttn_CSRDB_Mech();
}

@Then("^click on ValueSecondTimeRange_AddWOBttn_CSRDB_Mech$")
public void click_on_ValueSecondTimeRange_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.ValueSecondTimeRange_AddWOBttn_CSRDB_Mech();
}

@Then("^click on DDPrimaryRoute_AddWOBttn_CSRDB_Mech$")
public void click_on_DDPrimaryRoute_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.DDPrimaryRoute_AddWOBttn_CSRDB_Mech();
}

@Then("^click on ValuePrimaryRoute_AddWOBttn_CSRDB_Mech$")
public void click_on_ValuePrimaryRoute_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.ValuePrimaryRoute_AddWOBttn_CSRDB_Mech();
}

@Then("^click on SpecialInstruction_AddWOBttn_CSRDB_Mech$")
public void click_on_SpecialInstruction_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.SpecialInstruction_AddWOBttn_CSRDB_Mech();
}

@Then("^click on ServiceInstruction_AddWOBttn_CSRDB_Mech$")
public void click_on_ServiceInstruction_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.ServiceInstruction_AddWOBttn_CSRDB_Mech();
}

@Then("^click on InternalInstruction_AddWOBttn_CSRDB_Mech$")
public void click_on_InternalInstruction_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.InternalInstruction_AddWOBttn_CSRDB_Mech();
}

@Then("^click on SetUpInstruction_AddWOBttn_CSRDB_Mech$")
public void click_on_SetUpInstruction_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.SetUpInstruction_AddWOBttn_CSRDB_Mech();
}

@Then("^click on Save_AddWOBttn_CSRDB_Mech$")
public void click_on_Save_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.Save_AddWOBttn_CSRDB_Mech();
}


@Then("^click on DDServiceCategory_AddWOBttn_CSRDB_Mech$")
public void click_on_DDServiceCategory_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.DDServiceCategory_AddWOBttn_CSRDB_Mech();
}

@Then("^click on ValueDDServiceCategory_AddWOBttn_CSRDB_Mech$")
public void click_on_ValueDDServiceCategory_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.ValueDDServiceCategory_AddWOBttn_CSRDB_Mech();
}

@Then("^click on Services_AddWOBttn_CSRDB_Mech$")
public void click_on_Services_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.Services_AddWOBttn_CSRDB_Mech();
}

@Then("^click on ValueServices_AddWOBttn_CSRDB_Mech$")
public void click_on_ValueServices_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.ValueServices_AddWOBttn_CSRDB_Mech();
}

@Then("^click on Add_AddWOBttn_CSRDB_Mech$")
public void click_on_Add_AddWOBttn_CSRDB_Mech() throws Exception {
	mechcsrsteps.Add_AddWOBttn_CSRDB_Mech();
}



}