import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://egis-uat.hkairport.com/itfm-eb/index.html')

WebUI.click(findTestObject('Object Repository/Page_IT Facilities Map/button_LOGIN'))

WebUI.setText(findTestObject('Object Repository/Page_Sign In/input_JavaScript required_UserName'), 'FANBLH@hkairport.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In/input_JavaScript required_Password'), 'UfFASGiAkdy31eCRMpFztA==')

WebUI.click(findTestObject('Object Repository/Page_Sign In/span_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Sign In/div_ArcGIS login'))

WebUI.setText(findTestObject('Object Repository/Page_Sign In/input_ArcGIS login_username'), 'stevenlam')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In/input_ArcGIS login_password'), 'uCLeToQGi0DcymIrrztOlQ==')

WebUI.click(findTestObject('Object Repository/Page_Sign In/input_Keep me signed in_persist'))

WebUI.click(findTestObject('Object Repository/Page_Sign In/button_Sign In'))

