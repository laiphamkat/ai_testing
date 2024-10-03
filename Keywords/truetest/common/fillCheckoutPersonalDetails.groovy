package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class fillCheckoutPersonalDetails {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button Checkout -> Navigate to page '/checkout-step-one.html'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_Checkout'))
        
        "Step 2: Click on input FirstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_FirstName'))
        
        "Step 3: Enter input value in input FirstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_FirstName'), data['input_FirstName'])
        
        "Step 4: Click on input LastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_LastName'))
        
        "Step 5: Enter input value in input LastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_LastName'), data['input_LastName'])
        
        "Step 6: Click on input PostalCode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_PostalCode'))
        
        "Step 7: Enter input value in input PostalCode"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_PostalCode'), data['input_PostalCode'])
        
        "Step 8: Click on input Continue"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_Continue'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_FirstName'] = testData.getValue('input_FirstName', rowIndex)
        data['input_LastName'] = testData.getValue('input_LastName', rowIndex)
        data['input_PostalCode'] = testData.getValue('input_PostalCode', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_FirstName'] = 'default_data'
        data['input_LastName'] = 'default_data'
        data['input_PostalCode'] = 'default_data'
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

