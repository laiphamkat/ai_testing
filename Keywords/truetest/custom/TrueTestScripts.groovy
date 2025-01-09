package truetest.custom

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import groovy.json.JsonSlurper
import internal.GlobalVariable

public class TrueTestScripts {
    
    public static void login() {
        try {
            // Trigger a Login test case
            // import com.kms.katalon.core.model.FailureHandling
            // import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
            // import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
            // WebUI.callTestCase(findTestCase('<path to testcase>/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)
            // Trigger a custom Login method
            // import your.package
            // import authentication.Login
            // call your custom login method
            Login.login()
            // Trigger a custom Login keyword
            // CustomKeywords.login()
        } catch(Exception e) {
            if (e.getCause() instanceof WebElementNotFoundException) {
                KeywordUtil.logInfo(e.getMessage())
                KeywordUtil.markWarning(e.getMessage())
            } else {
                throw e
            }
        }
    }
    
    static Integer DELAY_TIME = 3 // in seconds
    
    public static void navigate(String path) {
        String applicationDomain = GlobalVariable.application_domain;
        String queryParameters = "";
        try {
            queryParameters = GlobalVariable.query_params;
        }
        catch (Exception e) {
            KeywordUtil.logInfo(e.getMessage())
        }
        if (path == null) {
            path = "";
        }
        if (!path.startsWith("/")) {
            path = "/$path";
        }
        String url = "$applicationDomain$path";
        if (queryParameters != null && queryParameters.length() > 0) {
            url = "$url?$queryParameters";
        }
        WebUI.navigateToUrl(url);
        WebUI.delay(DELAY_TIME);
    }
    
    public static void selectOptionByValue(TestObject to, String rawValue) {
        def parsedValue = rawValue
        if (!parsedValue.startsWith("[")) {
            parsedValue = "[\"" + parsedValue + "\"]"
        }
        def jsonSlurper = new JsonSlurper()
        def options = jsonSlurper.parseText(parsedValue)
        for (option in options) {
            WebUI.selectOptionByValue(to, option, true)
        }
    }
    
    public static void setSliderValue(TestObject to, double value) {
        WebUI.delay(1)
        def sliderElement = WebUiCommonHelper.findWebElement(to, 30)
        double sliderWidth = Double.parseDouble(WebUI.executeJavaScript("return arguments[0].getBoundingClientRect().width", Arrays.asList(sliderElement)).toString())
        def sliderHandleElement = WebUI.executeJavaScript("return arguments[0].querySelector('[role=slider]')", Arrays.asList(sliderElement))
        double min =  Double.parseDouble(WebUI.executeJavaScript("return arguments[0].getAttribute('aria-valuemin')", Arrays.asList(sliderHandleElement)).toString())
        double max =  Double.parseDouble(WebUI.executeJavaScript("return arguments[0].getAttribute('aria-valuemax')", Arrays.asList(sliderHandleElement)).toString())
        double currentValue = Double.parseDouble(WebUI.executeJavaScript("return arguments[0].getAttribute('aria-valuenow')", Arrays.asList(sliderHandleElement)).toString())
        int offsetX = Math.floor(((value - currentValue) / (max - min)) * sliderWidth)
        WebUI.dragAndDropByOffset(to, offsetX, 0)
    }
}

