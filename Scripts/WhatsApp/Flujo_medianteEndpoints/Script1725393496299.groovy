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

ResponseQTQH = WS.sendRequest(findTestObject('EndPoints_Whats/Send_Message_QTQH'))

WS.verifyResponseStatusCode(ResponseQTQH, 204)

WS.delay(30)

ResponseYL = WS.sendRequest(findTestObject('EndPoints_Whats/Send_Message_YaLlame'))

WS.verifyResponseStatusCode(ResponseYL, 204)

WS.delay(25)

ResponseYAV = WS.sendRequest(findTestObject('EndPoints_Whats/Send_Message_YaAbriV'))

WS.verifyResponseStatusCode(ResponseYAV, 204)

WS.delay(25)

ResponseYAVI = WS.sendRequest(findTestObject('EndPoints_Whats/Send_Imagen_YaAbriV'))

WS.verifyResponseStatusCode(ResponseYAVI, 204)

WS.delay(25)

ResponseYPC = WS.sendRequest(findTestObject('EndPoints_Whats/Send_Message_YaPuseC'))

WS.verifyResponseStatusCode(ResponseYPC, 204)

WS.delay(25)

ResponseYAVI = WS.sendRequest(findTestObject('EndPoints_Whats/Send_Imagen_YaAbriV'))

WS.verifyResponseStatusCode(ResponseYAVI, 204)

WS.delay(25)

ResponseYPCI = WS.sendRequest(findTestObject('EndPoints_Whats/Send_Image_YaPuseC'))

WS.verifyResponseStatusCode(ResponseYPCI, 204)

WS.delay(25)

ResponseYPT = WS.sendRequest(findTestObject('EndPoints_Whats/Send_Message_YaPrendiT'))

WS.verifyResponseStatusCode(ResponseYPT, 204)

WS.delay(25)

ResponseQTQH = WS.sendRequest(findTestObject('EndPoints_Whats/Send_Message_QTQH'))

WS.verifyResponseStatusCode(ResponseQTQH, 204)

