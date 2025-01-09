import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://www.saucedemo.com"

TrueTestScripts.navigate("")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to *"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}")

"Step 4: Select option with input value from select serviceOptions (ChooseService1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_interaction_pages/select_serviceOptions"
TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Dynamic Objects/Page_user_interaction_pages/select_serviceOptions', ['select_serviceOptions_internalHasText': select_serviceOptions_internalHasText]), select_serviceOptions)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Select option with input value from select serviceOptions ChooseService1.png')

"Step 5: Select option with input value from select serviceOptions (ChooseService2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_interaction_pages/select_serviceOptions"
TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Dynamic Objects/Page_user_interaction_pages/select_serviceOptions', ['select_serviceOptions_internalHasText': select_serviceOptions_internalHasText_1]), select_serviceOptions_1)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Select option with input value from select serviceOptions ChooseService2.png')

"Step 6: Select option with input value from select serviceOptions (ChooseService3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_interaction_pages/select_serviceOptions"
TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Dynamic Objects/Page_user_interaction_pages/select_serviceOptions', ['select_serviceOptions_internalHasText': select_serviceOptions_internalHasText_2]), select_serviceOptions_2)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Select option with input value from select serviceOptions ChooseService3.png')

"Step 7: Click on link Slider -> Navigate to page 'single#slider'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_interaction_pages/link_Slider'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on link Slider - Navigate to page singleslider.png')

"Step 8: Click on div ContentBlock1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'slider?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_single/div_ContentBlock1'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on div ContentBlock1.png')

"Step 9: Click on div ContentBlock2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'slider?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_single/div_ContentBlock2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on div ContentBlock2.png')

"Step 10: Click on div ContentBlock3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'slider?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_single/div_ContentBlock3'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on div ContentBlock3.png')

"Step 11: Click on link Select -> Navigate to page 'user interaction pages#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'slider?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_single/link_Select'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on link Select - Navigate to page user interaction pages.png')

"Step 12: Click on link Slide"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_interaction_pages/link_Slide'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on link Slide.png')

"Step 13: Click on div SearchResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_interaction_pages/div_SearchResult'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on div SearchResult.png')

"Step 14: Enter input value in input SearchDocs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_interaction_pages/input_SearchDocs'), input_SearchDocs)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Enter input value in input SearchDocs.png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Interact with User Interaction Pages and Verify Results in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}