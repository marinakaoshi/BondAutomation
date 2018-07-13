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
WebUI.waitForAngularLoad(5)

WebUI.click(findTestObject('Add Member Credit/Page_TechStyle Bond/a_00.00'))
WebUI.delay(5)
WebUI.click(findTestObject('Add Member Credit/Page_TechStyle Bond/a_00.00_1'))
WebUI.selectOptionByValue(findTestObject('Add Member Credit/Page_TechStyle Bond/select_Select...AddRemoveConve'), 'add', 
    true)
WebUI.selectOptionByValue(findTestObject('Add Member Credit/Page_TechStyle Bond/select_Select a Reason15 - Man'), '15', 
    true)
WebUI.setText(findTestObject('Add Member Credit/Page_TechStyle Bond/textarea_comment'), 'test')
WebUI.click(findTestObject('Add Member Credit/Page_TechStyle Bond/button_Submit'))

CustomKeywords.'bondAutomation.bondAutomation.getManagerCode'('Add Member Credit/Page_TechStyle Bond/input_mgrInput')

WebUI.click(findTestObject('Add Member Credit/Page_TechStyle Bond/button_OK'))
WebUI.click(findTestObject('Add Member Credit/Page_TechStyle Bond/div_1 member credits (39.95) h'))


