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

WebUI.click(findTestObject('Add 1000 Reward Points/Page_TechStyle Bond/div_1000 Reward Points'))
WebUI.click(findTestObject('Add 1000 Reward Points/Page_TechStyle Bond/input_submit'))

CustomKeywords.'bondAutomation.bondAutomation.getManagerCode'('Add 1000 Reward Points/Page_TechStyle Bond/input_mgrInput')


WebUI.click(findTestObject('Add 1000 Reward Points/Page_TechStyle Bond/button_OK'))
WebUI.selectOptionByValue(findTestObject('Add 1000 Reward Points/Page_TechStyle Bond/select_- Select Reason -Poor M'), 'number:4', 
    true)
WebUI.setText(findTestObject('Add 1000 Reward Points/Page_TechStyle Bond/textarea_comment'), 'test add 1000 RP automation '+currDate)
WebUI.click(findTestObject('Add 1000 Reward Points/Page_TechStyle Bond/button_Submit'))
WebUI.click(findTestObject('Add 1000 Reward Points/Page_TechStyle Bond/button_Ok (1)'))


WebUI.click(findTestObject('Add 1000 Reward Points/Page_TechStyle Bond/div_Member is not eligible for'))


