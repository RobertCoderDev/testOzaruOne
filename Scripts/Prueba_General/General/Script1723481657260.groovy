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

WebUI.setText(findTestObject('Page_OzaruOne/input_name'), 'test')

WebUI.setText(findTestObject('Page_OzaruOne/input_location'), 'la piedad,mich')

WebUI.scrollToElement(findTestObject('Page_OzaruOne/reference'), 0)

WebUI.setText(findTestObject('Page_OzaruOne/time_zone'), 'America/Monterrey')

WebUI.setText(findTestObject('Page_OzaruOne/opening_time'), '08:11am')

WebUI.setText(findTestObject('Page_OzaruOne/closing_time'), '16:00')

WebUI.scrollToElement(findTestObject('Page_OzaruOne/add_branche'), 0)

WebUI.click(findTestObject('Page_OzaruOne/add_branche'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_OzaruOne/tres_puntos'))

WebUI.click(findTestObject('Page_OzaruOne/edit_bramche'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_OzaruOne/name_edit'), 'test_2')

WebUI.setText(findTestObject('Page_OzaruOne/location_edit'), 'la piedrita')

WebUI.click(findTestObject('Page_OzaruOne/update_brunch'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_OzaruOne/span_Operational Roles'))

WebUI.click(findTestObject('Page_OzaruOne/button_New Operational Role'))

WebUI.click(findTestObject('Page_OzaruOne/div_Select Branch'))

WebUI.click(findTestObject('Page_OzaruOne/span_test'))

WebUI.setText(findTestObject('Page_OzaruOne/mat-label_Role Name'), 'testing')

WebUI.setText(findTestObject('Page_OzaruOne/mat-label_Description'), 'testing')

WebUI.click(findTestObject('Page_OzaruOne/button_Submit'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_OzaruOne/button_New Operational Role'))

WebUI.click(findTestObject('Page_OzaruOne/div_Select Branch'))

WebUI.click(findTestObject('Page_OzaruOne/span_test'))

WebUI.setText(findTestObject('Page_OzaruOne/mat-label_Role Name'), 'testing')

WebUI.setText(findTestObject('Page_OzaruOne/mat-label_Description'), 'testing')

WebUI.click(findTestObject('Page_OzaruOne/button_Submit'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_OzaruOne/div_OR_2'))

WebUI.click(findTestObject('Page_OzaruOne/div_Edit Role'))

WebUI.setText(findTestObject('Page_OzaruOne/mat-label_Role Name'), 'Hola')

WebUI.setText(findTestObject('Page_OzaruOne/mat-label_Description'), 'Hola')

WebUI.click(findTestObject('Page_OzaruOne/button_Submit'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_OzaruOne/span_Supervisors'))

WebUI.click(findTestObject('Page_OzaruOne/button_New User'))

WebUI.click(findTestObject('Page_OzaruOne/div_Select Branch'))

WebUI.click(findTestObject('Page_OzaruOne/mat-option_test'))

WebUI.setText(findTestObject('Page_OzaruOne/time_zone'), 'America/Monterrey')

WebUI.setText(findTestObject('Page_OzaruOne/input_Username_username'), 'Misael')

WebUI.setText(findTestObject('Page_OzaruOne/input_Email_email'), 'Misael@hola.com')

WebUI.setText(findTestObject('Page_OzaruOne/input_Country Code_country_code'), '+521')

WebUI.setText(findTestObject('Page_OzaruOne/input_WhatsApp_whatsapp'), '3515006338')

WebUI.click(findTestObject('Page_OzaruOne/button_Submit'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_OzaruOne/button_New User'))

WebUI.click(findTestObject('Page_OzaruOne/div_Select Branch'))

WebUI.click(findTestObject('Page_OzaruOne/span_test2'))

WebUI.setText(findTestObject('Page_OzaruOne/time_zone'), 'America/Monterrey')

WebUI.setText(findTestObject('Page_OzaruOne/input_Username_username'), 'Misael')

WebUI.setText(findTestObject('Page_OzaruOne/input_Email_email'), 'Misael@hola.com')

WebUI.setText(findTestObject('Page_OzaruOne/input_Country Code_country_code'), '+521')

WebUI.setText(findTestObject('Page_OzaruOne/input_WhatsApp_whatsapp'), '3511234567')

WebUI.click(findTestObject('Page_OzaruOne/button_Submit'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_OzaruOne/div_'))

WebUI.click(findTestObject('Page_OzaruOne/div_Edit User'))

WebUI.setText(findTestObject('Page_OzaruOne/input_Username_username'), 'Jesus')

WebUI.setText(findTestObject('Page_OzaruOne/input_Email_email'), 'jesus@hola.com')

WebUI.setText(findTestObject('Page_OzaruOne/input_Country Code_country_code'), '+86')

WebUI.setText(findTestObject('Page_OzaruOne/input_WhatsApp_whatsapp'), '0000000000')

WebUI.click(findTestObject('Page_OzaruOne/button_Submit'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_OzaruOne/span_Operators'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_OzaruOne/button_New User Operator'))

WebUI.click(findTestObject('Page_OzaruOne/svg_Select Branch_ng-tns-c3393473648-5'))

WebUI.click(findTestObject('Page_OzaruOne/mat-option_test OP'))

WebUI.click(findTestObject('Page_OzaruOne/div_Select Operational Rol'))

WebUI.click(findTestObject('Page_OzaruOne/span_prueba'))

WebUI.setText(findTestObject('Page_OzaruOne/mat-label_Time Zone'), 'America/Monterrey')

WebUI.setText(findTestObject('Page_OzaruOne/input_Username_username'), 'Misael')

WebUI.setText(findTestObject('Page_OzaruOne/input_Email_email'), 'Misa@hola.com')

WebUI.setText(findTestObject('Page_OzaruOne/input_Country Code_country_code'), '+521')

WebUI.setText(findTestObject('Page_OzaruOne/input_WhatsApp_whatsapp'), '3510000000')

WebUI.click(findTestObject('Page_OzaruOne/button_Submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Page_OzaruOne/div_trespuntos'))

WebUI.click(findTestObject('Page_OzaruOne/div_Edit User'))

WebUI.setText(findTestObject('Page_OzaruOne/input_Username_username'), 'Arzate')

WebUI.setText(findTestObject('Page_OzaruOne/input_Email_email'), 'arzate@hola.com')

WebUI.setText(findTestObject('Page_OzaruOne/input_Country Code_country_code'), '+91')

WebUI.setText(findTestObject('Page_OzaruOne/input_WhatsApp_whatsapp'), '3520000000')

WebUI.click(findTestObject('Page_OzaruOne/button_Submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Page_OzaruOne/span_Checklist'))

WebUI.click(findTestObject('Page_OzaruOne/button_New Check List'))

WebUI.setText(findTestObject('Page_OzaruOne/input_CheckList Name_title'), 'testeo')

WebUI.click(findTestObject('Page_OzaruOne/div_Monthly'))

WebUI.click(findTestObject('Page_OzaruOne/span_Weekly'))

WebUI.setText(findTestObject('Page_OzaruOne/textarea_Description_description'), 'testeo')

WebUI.click(findTestObject('Page_OzaruOne/span_Select Branch'))

WebUI.click(findTestObject('Page_OzaruOne/span_test2'))

WebUI.click(findTestObject('Page_OzaruOne/div_Select Operational Role'))

WebUI.click(findTestObject('Page_OzaruOne/span_testting'))

WebUI.click(findTestObject('Page_OzaruOne/button_Submit'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_OzaruOne/span_Checklist'))

WebUI.click(findTestObject('Page_OzaruOne/div_trespuntos'))

WebUI.click(findTestObject('Page_OzaruOne/div_Edit'))

WebUI.setText(findTestObject('Page_OzaruOne/input_CheckList Name_title'), 'testeo_1')

WebUI.setText(findTestObject('Page_OzaruOne/textarea_Description_description'), 'testeo_!')

WebUI.click(findTestObject('Page_OzaruOne/button_Submit'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_OzaruOne/h6_Testeo_1'))

WebUI.click(findTestObject('Page_OzaruOne/button_Add Task'))

WebUI.setText(findTestObject('Page_OzaruOne/tittle'), 'testeo')

WebUI.click(findTestObject('Page_OzaruOne/mat-label_Schedule Day'))

WebUI.click(findTestObject('Page_OzaruOne/mat-pseudo-checkbox_Description_mat'))

WebUI.click(findTestObject('Page_OzaruOne/Close'))

WebUI.setText(findTestObject('Page_OzaruOne/input_Task Time_taskTime'), '08:00am')

WebUI.setText(findTestObject('Page_OzaruOne/textarea_Description_description'), 'testeo_!')

WebUI.click(findTestObject('Page_OzaruOne/button_Submit'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_OzaruOne/tres_puntos_Cl'))

WebUI.click(findTestObject('Page_OzaruOne/div_edit_Cl'))

WebUI.setText(findTestObject('Page_OzaruOne/tittle'), 'testeo_misa')

WebUI.click(findTestObject('Page_OzaruOne/mat-label_Schedule Day'))

WebUI.click(findTestObject('Page_OzaruOne/Day_Selector'))

WebUI.setText(findTestObject('Page_OzaruOne/input_Task Time_taskTime'), '11:00am')

WebUI.click(findTestObject('Page_OzaruOne/span_Not Apply'))

WebUI.click(findTestObject('Page_OzaruOne/mat-option_Image'))

WebUI.setText(findTestObject('Page_OzaruOne/textarea_Description_description'), 'testeo_misa')

WebUI.click(findTestObject('Page_OzaruOne/button_Submit'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_OzaruOne/tres_puntos_Cl'))

WebUI.click(findTestObject('Page_OzaruOne/div_Delete'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_OzaruOne/input_Filter by day_mat-mdc-checkbox-1-input'))

WebUI.click(findTestObject('Page_OzaruOne/a_Delete'))

WebUI.click(findTestObject('Page_OzaruOne/Delete_Check'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_OzaruOne/span_Knowled'))

WebUI.click(findTestObject('Page_OzaruOne/mat-icon_Supervisors_mat-icon notranslate icon material-icons mat-ligature-font mat-icon-no-color'))

WebUI.click(findTestObject('Page_OzaruOne/button_Upload file cloud_upload'))

WebUI.setText(findTestObject('Page_OzaruOne/textarea_Name_mat-input-2'), 'test')

WebUI.uploadFile(findTestObject('Page_OzaruOne/FileUploadInput'), 'C:\\\\Users\\\\arzat\\\\OneDrive\\\\Escritorio\\\\Brains\\\\direcciongeneral.pdf')

WebUI.click(findTestObject('Page_OzaruOne/button_Upload'))

WebUI.click(findTestObject('Page_OzaruOne/div_brains'))

WebUI.click(findTestObject('Page_OzaruOne/button_Delete_Brains'))

WebUI.click(findTestObject('Page_OzaruOne/span_Operators'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_OzaruOne/div_trespuntos'))

WebUI.click(findTestObject('Page_OzaruOne/div_Delete User'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_OzaruOne/span_Supervisors'))

WebUI.click(findTestObject('Page_OzaruOne/div_'))

WebUI.click(findTestObject('Page_OzaruOne/div_Delete User'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_OzaruOne/span_Checklist'))

WebUI.click(findTestObject('Page_OzaruOne/div_trespuntos'))

WebUI.click(findTestObject('Page_OzaruOne/div_Delete'))

WebUI.click(findTestObject('Page_OzaruOne/button_Delete'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_OzaruOne/span_Operational Roles'))

WebUI.click(findTestObject('Page_OzaruOne/div_OR_2'))

WebUI.click(findTestObject('Page_OzaruOne/div_Delete Role_2'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_OzaruOne/span_Branches'))

WebUI.click(findTestObject('Page_OzaruOne/tres_puntos'))

WebUI.click(findTestObject('Page_OzaruOne/delete_Branches'))

WebUI.delay(2)

WebUI.closeBrowser()

