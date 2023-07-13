import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

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


'Open Browser'
WebUI.openBrowser("")

'Naviagate to URL'
WebUI.navigateToUrl("https://opensource-demo.orangehrmlive.com")

'Verify URL'
String url = WebUI.getUrl()
WebUI.verifyEqual(url, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")

'Click forgot your password button'
WebUI.click(findTestObject('Object Repository/Login/btn_Forgot your password'))

'Verify URL'
WebUI.verifyEqual(true, WebUI.getUrl().contains("/auth/requestPasswordResetCode"))

'Verify Cancel button is enable'
WebUI.verifyElementClickable(findTestObject('Object Repository/Reset Password/btn_Cancel'))

'Verify Reset button is enable'
WebUI.verifyElementClickable(findTestObject('Object Repository/Reset Password/btn_Reset password'))

'Click Cancel button'
WebUI.click(findTestObject('Object Repository/Reset Password/btn_Cancel'))

'Verify URL'
String url2 = WebUI.getUrl()
WebUI.verifyEqual(url2, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")

'Close browser'
WebUI.closeBrowser()

