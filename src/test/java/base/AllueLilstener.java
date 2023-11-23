package base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import io.qameta.allure.Attachment;


public class AllueLilstener implements ITestListener {
	
	private static String getTestMethodName(ITestResult iTestResu1t) {
		return iTestResu1t.getMethod().getConstructorOrMethod().getName( ) ;
	}
	
	@Attachment
	public byte [] saveFailureScreenShot(WebDriver driver)
	{   
		System.out.println("attachement added ");
		return ( (TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	@Attachment(value="{0}",type = ("text/ plain"))
	public static String saveTextLog(String message)
	{
		return message;
	}

	
    @Override		
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onStart(ITestContext iTestContext) {					
    	System.out.println("I am in onStart method " + iTestContext.getName());
		iTestContext.setAttribute("WebDriver", SettingBrowser.getDriver());        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult iTestResult) {					
    	System.out.println("I am in onTestFailure method " + getTestMethodName(iTestResult) + " failed");
		//Object testClass = iTestResult.getInstance();
		WebDriver driver = SettingBrowser.getDriver();
		// Allure ScreenShot and SaveTestLog
		if (driver instanceof WebDriver) {
			System.out.println("Screenshot captured for test case:" + getTestMethodName(iTestResult));
			saveFailureScreenShot(driver);
		}
		saveTextLog(getTestMethodName(iTestResult) + " failed and screenshot taken!");				
        		
    }		

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }
}
