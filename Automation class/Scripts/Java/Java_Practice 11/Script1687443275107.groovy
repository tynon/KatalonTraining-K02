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

def map = ["ten":"ABC",
	"chieu cao":1.80]
Scanner cannang = new Scanner(System.in)
println ("Nhap can nang :")
float t = cannang.nextFloat()
float KQ
KQ = t / (map.get("chieu cao")* map.get("chieu cao"))
if (KQ < 16)
{
map.put("KQ","Thể trạng của bạn là : Gầy độ III")
println map
}
if(KQ >= 16 && KQ < 17)
{
map.put("KQ","Thể trạng của bạn là : Gầy độ II")
println map
}
if(KQ >= 17 && KQ < 18.5)
{
map.put("KQ","Thể trạng của bạn là : Gầy độ I")
println map
}
if(KQ >= 18.5 && KQ < 25)
{
map.put("KQ","Thể trạng của bạn là : Bình thường")
println map
}
if(KQ >= 25 && KQ < 30)
{
map.put("KQ","Thể trạng của bạn là :  Thừa cân")
println map
}
if(KQ >= 30 && KQ < 35)
{
map.put("KQ","Thể trạng của bạn là :  Béo phì độ I")
println map
}
if(KQ >= 35 && KQ < 40)
{
map.put("KQ","Thể trạng của bạn là :  Béo phì độ II")
println map
}
if(KQ >= 40)
{
map.put("KQ","Thể trạng của bạn là :  Béo phì độ III")
println map
}