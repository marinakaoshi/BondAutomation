import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

CustomKeywords.'bondAutomation.bondAutomation.identityLoginKey'('')

CustomKeywords.'bondAutomation.bondAutomation.searchCustomerID'('')

CustomKeywords.'bondAutomation.bondAutomation.clickVIPComp'('')

currDate = new Date()

WebUI.click(findTestObject('Add 5 Endowment 2/Page_TechStyle Bond/div_5 Endowment'))

WebUI.click(findTestObject('Add 5 Endowment 2/Page_TechStyle Bond/input_submit'))

WebUI.verifyElementPresent(findTestObject('Add 5 Endowment 2/Page_TechStyle Bond/div_Manager CodeOK'), 5)

//WebUI.click(findTestObject('Add 5 Endowment 2/Page_TechStyle Bond/div_Manager CodeOK'))
WebUI.doubleClick(findTestObject('Add 5 Endowment 2/Page_TechStyle Bond/input_mgrInput'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Add 5 Endowment 2/Page_TechStyle Bond/input_mgrInput'), '46224')

WebUI.click(findTestObject('Add 5 Endowment 2/Page_TechStyle Bond/button_OK'))

WebUI.selectOptionByValue(findTestObject('Add 5 Endowment 2/Page_TechStyle Bond/select_- Select Reason -Poor M'), 'number:4', 
    true)

WebUI.setText(findTestObject('Add 5 Endowment 2/Page_TechStyle Bond/textarea_comment'), 'test add')

WebUI.click(findTestObject('Add 5 Endowment 2/Page_TechStyle Bond/button_Submit'))

WebUI.click(findTestObject('Add 5 Endowment 2/Page_TechStyle Bond/div_OkCancel'))

WebUI.click(findTestObject('Add 5 Endowment 2/Page_TechStyle Bond/div_ConfirmAre you sure you wa'))

WebUI.click(findTestObject('Add 5 Endowment 2/Page_TechStyle Bond/button_Ok (1)'))

WebUI.click(findTestObject('Add 5 Endowment 2/Page_TechStyle Bond/div_5 Endowment added successf'))

WebUI.closeBrowser()
