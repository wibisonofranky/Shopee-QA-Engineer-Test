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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Go to GitHub Gist'
WebUI.openBrowser(GlobalVariable.urlGist)

WebUI.maximizeWindow()

'Sign in to GitHub'
WebUI.click(findTestObject('GitHub Gist/Page_Discover GitHub Gists/btSignIn'), FailureHandling.STOP_ON_FAILURE)

'Input username or email address'
WebUI.setText(findTestObject('GitHub Gist/Page_Sign In To GitHub/txtUsername'), GlobalVariable.dtUsername)

'Input password'
WebUI.setText(findTestObject('GitHub Gist/Page_Sign In To GitHub/txtPassword'), GlobalVariable.dtPassword)

WebUI.click(findTestObject('GitHub Gist/Page_Sign In To GitHub/btSignIn'))

