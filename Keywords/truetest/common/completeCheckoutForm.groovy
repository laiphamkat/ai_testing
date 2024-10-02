package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class completeCheckoutForm {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button checkout -> Navigate to page '/checkout-step-one.html'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_checkout'))
        
        "Step 2: Click on input firstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_firstName'))
        
        "Step 3: Enter input value in input firstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_firstName'), data['input_firstName'])
        
        "Step 4: Click on input lastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_lastName'))
        
        "Step 5: Enter input value in input lastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_lastName'), data['input_lastName'])
        
        "Step 6: Click on input postalCode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_postalCode'))
        
        "Step 7: Enter input value in input postalCode"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_postalCode'), data['input_postalCode'])
        
        "Step 8: Click on input continue"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_continue'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_firstName'] = testData.getValue('input_firstName', rowIndex)
        data['input_lastName'] = testData.getValue('input_lastName', rowIndex)
        data['input_postalCode'] = testData.getValue('input_postalCode', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_firstName'] = 'default_data'
        data['input_lastName'] = 'default_data'
        data['input_postalCode'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

