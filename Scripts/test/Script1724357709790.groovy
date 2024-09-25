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

// Navega a la URL deseada
WebUI.navigateToUrl('https://web.whatsapp.com/')

// Espera para asegurar que la página se cargue
WebUI.delay(20)

// Realiza clic en el contacto
WebUI.click(findTestObject('Page_(34) WhatsApp/div_Ozaru One'))

def filePath = 'C:\\Users\\arzat\\OneDrive\\Escritorio\\Brains\\test.jpg'

// Reemplaza 'yourXPathHere' con el XPath correcto del input file
TestObject inputFile = new TestObject('inputFile')

inputFile.addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'file\' and @accept=\'image/*\' and @style=\'display: none;\']')

// Utiliza uploadFile para subir el archivo
WebUI.uploadFile(inputFile, filePath)

WebUI.delay(5 // Asegúrate de dar tiempo para que se cargue la imagen
    )

WebUI.closeBrowser()

WebUI.acceptAlert()

