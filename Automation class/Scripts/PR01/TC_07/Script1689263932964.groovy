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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Open browser'
WebUI.openBrowser("")

'Navigate to URL'
WebUI.navigateToUrl("https://opensource-demo.orangehrmlive.com")

'Verify Login page'
//String url = WebUI.getUrl()
//WebUI.verifyEqual(url, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
WebUI.verifyEqual(true, WebUI.getUrl().contains("/auth/login"))

'Input Username'
WebUI.setText(findTestObject('Object Repository/Login/txt_Username'), "Admin")

'Verify username is inpputed properly'
String user_input = WebUI.getAttribute(findTestObject('Object Repository/Login/txt_Username'), "value")
WebUI.verifyEqual(user_input, "Admin")

'Input Password'
WebUI.setText(findTestObject('Object Repository/Login/txt_Password'), "admin123")

'Verify password is inpputed properly'
String pass_input = WebUI.getAttribute(findTestObject('Object Repository/Login/txt_Password'), "value")
WebUI.verifyEqual(pass_input, "admin123")

'Click Login button'
WebUI.click(findTestObject('Object Repository/Login/btn_Login'))

'Set delay'
WebUI.delay(3)

'Verify to login successfully to dashboard page'
WebUI.verifyEqual(true, WebUI.getUrl().contains("/dashboard/index"))

'Verify dashboard menu is selected by default'
WebUI.verifyEqual(true, WebUI.getAttribute(findTestObject('Object Repository/Dashboard/menu_Dashboard'), "class").contains("active"))

'Close browser'
WebUI.closeBrowser()


