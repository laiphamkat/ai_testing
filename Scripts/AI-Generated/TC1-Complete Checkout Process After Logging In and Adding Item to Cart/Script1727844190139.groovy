import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.completeCheckoutForm
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on div loginCredentials"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_loginCredentials'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on div loginCredentials.png')

"Step 3: Click on div loginCredentials"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_loginCredentials'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on div loginCredentials.png')

"Step 4: Click on div loginCredentials"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_loginCredentials'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on div loginCredentials.png')

"Step 5: Click on div loginCredentials"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_loginCredentials'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on div loginCredentials.png')

"Step 6: Login into Application"

TrueTestScripts.login()

"Step 7: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on button addToCart.png')

"Step 8: Click on link shoppingCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_shoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on link shoppingCart.png')

"Step 9: Fill out the checkout form with personal details and proceed"

completeCheckoutForm.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Click on button finish -> Navigate to page '/checkout-complete.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-two.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_two_html/button_finish'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on button finish - Navigate to page checkout-completehtml.png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Checkout Process After Logging In and Adding Item to Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}