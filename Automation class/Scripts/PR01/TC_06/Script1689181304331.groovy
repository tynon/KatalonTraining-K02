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

'Click OrangeHRM, Inc hyperlink'
WebUI.click(findTestObject('Object Repository/Login/link_orangehrm'))

'Naviagte to current tab'
WebUI.switchToWindowTitle("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM")

'Verify URL'
WebUI.verifyEqual(true, WebUI.getUrl().contains("orangehrm.com"))

'Verify title'
WebUI.verifyEqual(true, WebUI.getWindowTitle().contains("OrangeHRM HR Software"))

'Close browser'
WebUI.closeBrowser()
