package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsUtility {
    public static ExtentReports report;
	public static ExtentSparkReporter spartReporter;
	public static ExtentTest testLogger;
	
	public void startExtentReport() {
		spartReporter= new ExtentSparkReporter("./reports/new.html");
		report= new ExtentReports();
		report.attachReporter(spartReporter);
		
	report.setSystemInfo("Host Name", "Salesforce");
	report.setSystemInfo("Environment", "Automation Testing");
	report.setSystemInfo("User Name", "Suhana");

	spartReporter.config().setDocumentTitle("Test Execution Report");
	spartReporter.config().setReportName("firebase regression tests");
	spartReporter.config().setTheme(Theme.DARK);
	
	}
	 public void startSingleTestReport(String testscript_Name) {
		 testLogger=report.createTest("testscript_Name");
	 }
	 public void logTestInfo(String text) {
		  testLogger.info(text);
	  }
	 public void logTestpasses(String testcaseName) {
		 testLogger.pass(MarkupHelper.createLabel("testcaseName" + "is passTest", ExtentColor.GREEN));
	 }
	 public void logTestFailed(String testcaseName) {
		 testLogger.fail(MarkupHelper.createLabel("testcaseName" + "is failed", ExtentColor.RED));
	  }
	 public void logTestFailedWithException(Exception e) {
		 testLogger.log(Status.FAIL,e);
	 }
        
}
