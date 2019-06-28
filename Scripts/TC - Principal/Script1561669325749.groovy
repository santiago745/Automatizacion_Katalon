import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//WebUI.openBrowser('')
//WebUI.navigateToUrl('www.youtube.com')
//WebUI.sendKeys(findTestObject('Page_YouTube/input_Skip navigation_search_query'), 'anabelle')
WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.ucc.edu.co/Paginas/inicio.aspx')

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_Universidad Cooperativa de Colombia - Universidad Cooperativa de Colombia - Universidad Cooperativa de Colombia/span_Programas'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Universidad Cooperativa de Colombia - Universidad Cooperativa de Colombia - Universidad Cooperativa de Colombia/a_Pregrados'))

