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

}
