package bondAutomation

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.testdata.ExcelData as ExcelData

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class bondAutomation {

	@Keyword

	//UPDATE URL FOR:
	//QA: https://bond-qa3.techstyle.net
	//Staging: https://bond-staging.techstyle.net
	//UPDATE THE USERNAME AND PASSWORD
	def identityLoginKey (String msg){
		
		ExcelData data = findTestData("Login_Data")
		
		// QA
		//WebUI.navigateToUrl('https://bond-qa3.techstyle.net/')
		// Staging
		//WebUI.navigateToUrl('https://bond-staging.techstyle.net')
		//Prod
		WebUI.navigateToUrl('https://bond.techstyle.net')
		//Training Link
		//WebUI.navigateToUrl('https://bond-training.techstyle.net/')

		WebUI.setText(findTestObject('IdentityLogin/Page_Login/input_username'), data.internallyGetValue("username", 0))
		WebUI.setText(findTestObject('IdentityLogin/Page_Login/input_password'), data.internallyGetValue("password", 0))
		WebUI.click(findTestObject('IdentityLogin/Page_Login/input_btn btn-block btn-primar'))
	}

	//UPDATE THE CUSTOMER ID FOR DIFFERENT ENVIRONMENTS
	def searchCustomerID (String msg){
		WebUI.waitForAngularLoad(5)
		WebUI.click(findTestObject('SearchCustomerID/Page_TechStyle Bond/i_fa fa-search'))
		WebUI.setText(findTestObject('SearchCustomerID/Page_TechStyle Bond/input_searchBox'), '285702967')
		WebUI.click(findTestObject('SearchCustomerID/Page_TechStyle Bond/span_ (F3) Cust ID'))
	}

	//Actions from Any Page to VIP Comp

	def clickVIPComp (String msg){
		WebUI.waitForAngularLoad(5)
		WebUI.click(findTestObject('Add 10 Off One Item/Page_TechStyle Bond/span_Member'))
		WebUI.waitForAngularLoad(5)
		WebUI.click(findTestObject('Add 10 Off One Item/Page_TechStyle Bond/span_VIP Compensation'))
		WebUI.waitForAngularLoad(5)
	}

	// Input Manager Code
	def getManagerCode (String msg){

		ExcelData data = findTestData("ManagerCode_Data")
		
		
		WebUI.setText(findTestObject(msg), data.internallyGetValue("managercode", 0))
	}
}


