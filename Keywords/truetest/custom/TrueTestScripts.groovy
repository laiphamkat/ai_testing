package truetest.custom

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class TrueTestScripts {
    
    public static void login() {
        try {
            
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
}

