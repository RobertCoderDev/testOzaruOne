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

WebUI.click(findTestObject('Contest/Span_Tips_contest'))

WebUI.click(findTestObject('Contest/Button_New_contest'))

WebUI.setText(findTestObject('Contest/Input_contest'), 'Test')

WebUI.setText(findTestObject('Contest/input_message'), 'Este es un test para comprobar funcionalidad, que opinas ')

WebUI.setText(findTestObject('Contest/input_description'), 'Este es un test para comprobar funcionalidad, que opinas ')

WebUI.click(findTestObject('Contest/Branch'))

WebUI.click(findTestObject('Contest/select_branch'))

WebUI.click(findTestObject('Contest/Click_screen'))

WebUI.click(findTestObject('Contest/Kickoff'))

WebUI.click(findTestObject('Contest/Kickoff_day'))

WebUI.setText(findTestObject('Contest/KickOff_time'), '12:00am')

WebUI.uploadFile(findTestObject('Contest/FileUploadInput'), 'C:\\Users\\arzat\\OneDrive\\Escritorio\\Brains\\test.jpg')

WebUI.click(findTestObject('Contest/Closure'))

WebUI.click(findTestObject('Contest/Closure_day'))

WebUI.setText(findTestObject('Contest/Closure_time'), '12:10am')

WebUI.uploadFile(findTestObject('Contest/FileUploadInput_closure'), 'C:\\Users\\arzat\\OneDrive\\Escritorio\\Brains\\test.jpg')

WebUI.click(findTestObject('Contest/Awards'))

WebUI.click(findTestObject('Contest/Awards_day'))

WebUI.setText(findTestObject('Contest/Awards_time'), '12:20am')

WebUI.uploadFile(findTestObject('Contest/FileUploadInput_awards'), 'C:\\Users\\arzat\\OneDrive\\Escritorio\\Brains\\test.jpg')

WebUI.click(findTestObject('Contest/Button_submit'))

