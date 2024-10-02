import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button addToCart.png')

"Step 5: Click on link itemTitle -> Navigate to page '/inventory-item.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_itemTitle'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on link itemTitle - Navigate to page inventory-itemhtml.png')

"Step 6: Click on link shoppingCart -> Navigate to page '/cart.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/link_shoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link shoppingCart - Navigate to page carthtml.png')

"Step 7: Click on button checkout -> Navigate to page '/checkout-step-one.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_checkout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on button checkout - Navigate to page checkout-step-onehtml.png')

"Step 8: Click on input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_firstName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on input firstName.png')

"Step 9: Enter input value in input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_firstName'), input_firstName)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Enter input value in input firstName.png')

"Step 10: Click on input lastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_lastName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on input lastName.png')

"Step 11: Enter input value in input lastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_lastName'), input_lastName)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Enter input value in input lastName.png')

"Step 12: Click on input postalCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_postalCode'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on input postalCode.png')

"Step 13: Click on input continue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_continue'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on input continue.png')

"Step 14: Enter input value in input postalCode -> Navigate to page '/checkout-step-two.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_postalCode'), input_postalCode)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Enter input value in input postalCode - Navigate to page checkout-step-twohtml.png')

"Step 15: Click on button finish -> Navigate to page '/checkout-complete.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-two.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_two_html/button_finish'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on button finish - Navigate to page checkout-completehtml.png')

"Step 16: Click on div checkoutComplete -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-complete.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_complete_html/div_checkoutComplete'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on div checkoutComplete - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Checkout Process from Login to Order Confirmation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}