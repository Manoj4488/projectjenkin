package com.crm.organization;

import org.testng.annotations.Test;

public class OrganizationTest {
	@Test(groups="SmokeTest")
	public void createorgTest() {
		System.out.println("organization created");
	}
	@Test(groups="SmokeTest")
	public void createorgwithargTest() {
		System.out.println("orgwitharg is created");
	}
	@Test(groups="RegressionTest")
	public void deleteorgTest() {
		System.out.println("org deleted");
	}

}
