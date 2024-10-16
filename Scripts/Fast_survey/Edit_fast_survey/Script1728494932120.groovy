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

WebUI.click(findTestObject('Fast_survey/Span_automation'))

WebUI.click(findTestObject('Fast_survey/Span_fast_surveys'))

WebUI.delay(2)

WebUI.click(findTestObject('Fast_survey/Select_day_Sentiment'))

WebUI.click(findTestObject('Fast_survey/mat_option day'))

WebUI.click(findTestObject('Fast_survey/CheckBox_Status_Sentiment'))

WebUI.click(findTestObject('Fast_survey/CheckBox_Status_Sentiment'))

WebUI.setText(findTestObject('Fast_survey/task_time_sentiment'), '12:20am')

WebUI.delay(1)

WebUI.click(findTestObject('Fast_survey/Select_day_Productivity'))

WebUI.click(findTestObject('Fast_survey/mat_option day'))

WebUI.click(findTestObject('Fast_survey/CheckBox_Status_Productivity'))

WebUI.click(findTestObject('Fast_survey/CheckBox_Status_Productivity'))

WebUI.setText(findTestObject('Fast_survey/task_time_Productivity'), '12:20am')

WebUI.delay(1)

WebUI.click(findTestObject('Fast_survey/Select_day_Product'))

WebUI.click(findTestObject('Fast_survey/mat_option day'))

WebUI.click(findTestObject('Fast_survey/CheckBox_Status_Product'))

WebUI.click(findTestObject('Fast_survey/CheckBox_Status_Product'))

WebUI.setText(findTestObject('Fast_survey/task_time_Product'), '12:20am')

