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

WebUI.openBrowser('https://ozaru.myscriptcase.com/scriptcase9/app/OzaruOne/menu_admin/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Create_User/span_Usuarios'))

WebUI.delay(3)

WebUI.click(findTestObject('Create_User/a_Nuevo Director'))

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('Create_User/iframe_OzaruNewUser'), 10)

WebUI.setText(findTestObject('Create_User/input_name'), 'Test')

WebUI.setText(findTestObject('Create_User/input_correo'), 'test@gmail.com')

WebUI.setText(findTestObject('Create_User/input_whatsapp'), '3515006338')

WebUI.click(findTestObject('Create_User/ComboBox'))

WebUI.click(findTestObject('Create_User/input_asignarEmpresa'))

WebUI.click(findTestObject('Create_User/Button_CrearDirector'))

WebUI.delay(3)

WebUI.switchToDefaultContent()

