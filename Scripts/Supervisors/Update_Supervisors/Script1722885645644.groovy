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

WebUI.openBrowser('https://console.ozaru.one/#/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_OzaruOne/input_Email'), 'misa73@hotmail.com')

WebUI.click(findTestObject('Page_OzaruOne/button_Send Verification Code'))

WebUI.setText(findTestObject('Page_OzaruOne/input_Verification Code_user-code'), '5213524444444')

WebUI.click(findTestObject('Page_OzaruOne/button_Verify'))

WebUI.click(findTestObject('Page_OzaruOne/span_Task Manager'))

WebUI.click(findTestObject('Page_OzaruOne/span_Supervisors'))

WebUI.click(findTestObject('Page_OzaruOne/div_'))

WebUI.click(findTestObject('Page_OzaruOne/div_Edit User'))

WebUI.setText(findTestObject('Page_OzaruOne/input_Username_username'), 'Jesus')

WebUI.setText(findTestObject('Page_OzaruOne/input_Email_email'), 'jesus@hola.com')

WebUI.setText(findTestObject('Page_OzaruOne/input_Country Code_country_code'), '+86')

WebUI.setText(findTestObject('Page_OzaruOne/input_WhatsApp_whatsapp'), '0000000000')

WebUI.click(findTestObject('Page_OzaruOne/button_Submit'))

WebUI.delay(2)

WebUI.closeBrowser()

