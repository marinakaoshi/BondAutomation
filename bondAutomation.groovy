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

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class bondAutomation {

	@Keyword

	def identityLoginKey (String msg){

		WebUI.setText(findTestObject('Identity Login/Page_Login/input_username'), 'mnakaoshi-c')
		WebUI.setText(findTestObject('Identity Login/Page_Login/input_password'), 'p2ncL3FJ5')
		WebUI.click(findTestObject('Identity Login/Page_Login/input_btn btn-block btn-primar'))
	}

	def searchCustomerID (String msg){

		WebUI.click(findTestObject('Search Customer ID/Page_TechStyle Bond/i_fa fa-search'))
		WebUI.setText(findTestObject('Search Customer ID/Page_TechStyle Bond/input_searchBox'), '285702967')
		WebUI.click(findTestObject('Search Customer ID/Page_TechStyle Bond/span_ (F3) Cust ID'))
	}
}
