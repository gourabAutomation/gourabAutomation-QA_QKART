package QKART_TESTNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Case Starting > "+result.getName()+" Taking Screenshot");
        QKART_Tests.takeScreenshot("Start", "TestCaseStart");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Case Failue > "+result.getName()+" Taking Screenshot");
        QKART_Tests.takeScreenshot("Fail", "TestCaseFail");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Case Success > "+result.getName()+" Taking Screenshot");
        QKART_Tests.takeScreenshot("Success", "TestCaseSuccess");
    }

}