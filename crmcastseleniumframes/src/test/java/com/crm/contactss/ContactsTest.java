package com.crm.contactss;

import org.testng.annotations.Test;

public class ContactsTest {
	String bw=System.getProperty("browser");
	String urll=System.getProperty("url");
	String env=System.getProperty("env");
	
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
		System.out.println(bw);
		System.out.println(urll);
		System.out.println(env);
		
		}
      
}
