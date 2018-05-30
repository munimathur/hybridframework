package com.vil.web.tests.demoTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.vil.web.library.BaseLib;
import com.vil.web.library.FunctionLib;
import com.vil.web.reports.MyExtentListners;

public class DemoTest extends BaseLib {
	
	@Parameters({ "Browser Name" })
	@Test(priority=1,description = " Discription of the page ")
	
public void DemoTest(String browserName) throws Exception {
		
		MyExtentListners.test.assignCategory("Demo-" + browserName);
		FunctionLib funLib = new FunctionLib(driver);
		
		
	}
}
