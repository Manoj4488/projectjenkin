package com.crm.contactss;

import org.testng.annotations.Test;

public class ContactsTest {
	
	@Test(groups="SmokeTest")
	public void createcontactTest() {
		System.out.println("contact created");
	}
	@Test(groups="RegressionTest")
	public void createcontactwithargTest() {
		System.out.println("contactwitharg is created");
	}
	@Test(groups="SmokeTest")
	public void deletecontactTest() {
		System.out.println("contact deleted");
	}
	@Test(groups="SmokeTest")
	public void addcontactTest() {
		System.out.println("contact added pollscm");
		}
	@Test(groups="SmokeTest")
	public void parametersTest() {
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		String ENV=System.getProperty("env");
		
		System.out.println("browser======"+BROWSER);
		System.out.println("url======"+URL);
		System.out.println("env======"+ENV);
		
		}
      
}
