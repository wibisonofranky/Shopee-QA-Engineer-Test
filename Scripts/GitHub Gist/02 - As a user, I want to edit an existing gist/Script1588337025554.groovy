import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.google.common.collect.FilteredEntryMultimap.Keys as Keys
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('GitHub Gist/01 - As a user, I want to create a public gist'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('GitHub Gist/Page_Create A New Gist/btEdit'))

'Edit gist detail'
WebUI.setText(findTestObject('GitHub Gist/Page_Create A New Gist/txtDetail'), GlobalVariable.dtGistDetailEdit)

'Update public gist'
WebUI.click(findTestObject('GitHub Gist/Page_Create A New Gist/btUpdatePublicGist'))

