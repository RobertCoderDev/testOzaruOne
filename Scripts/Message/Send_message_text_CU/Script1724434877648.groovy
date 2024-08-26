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

WebUI.click(findTestObject('Page_OzaruOne/span_Branches'))

WebUI.click(findTestObject('Page_OzaruOne/Newbranch'))

WebUI.setText(findTestObject('Page_OzaruOne/input_name'), 'test2')

WebUI.setText(findTestObject('Page_OzaruOne/input_location'), 'la piedad,mich')

WebUI.scrollToElement(findTestObject('Page_OzaruOne/reference'), 0)

WebUI.setText(findTestObject('Page_OzaruOne/time_zone'), 'America/Monterrey')

WebUI.setText(findTestObject('Page_OzaruOne/opening_time'), '08:11am')

WebUI.setText(findTestObject('Page_OzaruOne/closing_time'), '16:00')

WebUI.scrollToElement(findTestObject('Page_OzaruOne/add_branche'), 0)

WebUI.click(findTestObject('Page_OzaruOne/add_branche'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_OzaruOne/span_Operational Roles'))

WebUI.click(findTestObject('Page_OzaruOne/button_New Operational Role'))

WebUI.click(findTestObject('Page_OzaruOne/div_Select Branch'))

WebUI.click(findTestObject('Page_OzaruOne/span_test'))

WebUI.setText(findTestObject('Page_OzaruOne/mat-label_Role Name'), 'testing')

WebUI.setText(findTestObject('Page_OzaruOne/mat-label_Description'), 'testing')

WebUI.click(findTestObject('Page_OzaruOne/button_Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_OzaruOne/span_Operators'))

WebUI.click(findTestObject('Page_OzaruOne/button_New User Operator'))

WebUI.click(findTestObject('Page_OzaruOne/svg_Select Branch_ng-tns-c3393473648-5'))

WebUI.click(findTestObject('Page_OzaruOne/mat-option_test OP'))

WebUI.click(findTestObject('Page_OzaruOne/div_Select Operational Rol'))

WebUI.click(findTestObject('Page_OzaruOne/span_prueba'))

WebUI.setText(findTestObject('Page_OzaruOne/mat-label_Time Zone'), 'America/Monterrey')

WebUI.setText(findTestObject('Page_OzaruOne/input_Username_username'), 'Anselmo')

WebUI.setText(findTestObject('Page_OzaruOne/input_Email_email'), 'Anselmo@hola.com')

WebUI.setText(findTestObject('Page_OzaruOne/input_Country Code_country_code'), '+521')

WebUI.setText(findTestObject('Page_OzaruOne/input_WhatsApp_whatsapp'), '3521329139')

WebUI.click(findTestObject('Page_OzaruOne/button_Submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Page_OzaruOne/button_New User Operator'))

WebUI.click(findTestObject('Page_OzaruOne/svg_Select Branch_ng-tns-c3393473648-5'))

WebUI.click(findTestObject('Page_OzaruOne/mat-option_test OP'))

WebUI.click(findTestObject('Page_OzaruOne/div_Select Operational Rol'))

WebUI.click(findTestObject('Page_OzaruOne/span_prueba'))

WebUI.setText(findTestObject('Page_OzaruOne/mat-label_Time Zone'), 'America/Monterrey')

WebUI.setText(findTestObject('Page_OzaruOne/input_Username_username'), 'Felipon')

WebUI.setText(findTestObject('Page_OzaruOne/input_Email_email'), 'Felipon@hola.com')

WebUI.setText(findTestObject('Page_OzaruOne/input_Country Code_country_code'), '+521')

WebUI.setText(findTestObject('Page_OzaruOne/input_WhatsApp_whatsapp'), '3521429805')

WebUI.click(findTestObject('Page_OzaruOne/button_Submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Page_OzaruOne/button_New User Operator'))

WebUI.click(findTestObject('Page_OzaruOne/svg_Select Branch_ng-tns-c3393473648-5'))

WebUI.click(findTestObject('Page_OzaruOne/mat-option_test OP'))

WebUI.click(findTestObject('Page_OzaruOne/div_Select Operational Rol'))

WebUI.click(findTestObject('Page_OzaruOne/span_prueba'))

WebUI.setText(findTestObject('Page_OzaruOne/mat-label_Time Zone'), 'America/Monterrey')

WebUI.setText(findTestObject('Page_OzaruOne/input_Username_username'), 'Maicol')

WebUI.setText(findTestObject('Page_OzaruOne/input_Email_email'), 'Maicol@hola.com')

WebUI.setText(findTestObject('Page_OzaruOne/input_Country Code_country_code'), '+521')

WebUI.setText(findTestObject('Page_OzaruOne/input_WhatsApp_whatsapp'), '3515006338')

WebUI.click(findTestObject('Page_OzaruOne/button_Submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Messages/Span_messages'))

WebUI.click(findTestObject('Messages/Span_sendMessages'))

WebUI.click(findTestObject('Messages/span_Options_mat-mdc-select-placeholder mat-mdc-select-min-line'))

WebUI.click(findTestObject('Messages/span_Branch'))

WebUI.click(findTestObject('Messages/Span_Branches'))

WebUI.click(findTestObject('Messages/Span_test2'))

WebUI.click(findTestObject('Messages/mat-label-OperationalRoles'))

WebUI.click(findTestObject('Messages/Span_testing'))

WebUI.click(findTestObject('Messages/mat-label-employees'))

WebUI.click(findTestObject('Messages/mat-option-everyone'))

WebUI.click(findTestObject('Messages/mat-label-massage-type'))

WebUI.click(findTestObject('Messages/span_text'))

WebUI.click(findTestObject('Messages/imput_message'))

WebUI.setText(findTestObject('Messages/text_area_mesagge'), 'Hola')

WebUI.click(findTestObject('Messages/Button_sendMessage'))

