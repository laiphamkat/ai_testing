import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import truetest.common.fillCheckoutPersonalDetails
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Click on link itemTitles (ItemTitle) -> Navigate to page '/inventory-item.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_inventory_html/link_itemTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_inventory_html/link_itemTitles', ['link_itemTitles_dataTest': link_itemTitles_dataTest]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link itemTitles ItemTitle - Navigate to page inventory-itemhtml.png')

"Step 4: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button AddToCart.png')

"Step 5: Click on link ShoppingCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/link_ShoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on link ShoppingCart.png')

"Step 6: Fill out personal details on the checkout page"

fillCheckoutPersonalDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 7: Click on button Finish -> Navigate to page '/checkout-complete.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-two.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_two_html/button_Finish'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on button Finish - Navigate to page checkout-completehtml.png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Checkout Process for Single Item on SauceDemo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}