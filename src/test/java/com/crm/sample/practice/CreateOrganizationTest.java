package com.crm.sample.practice;

import org.testng.annotations.Test;

public class CreateOrganizationTest {

	@Test(groups = "smoke")
	public void createOrganization() {
	}
	
	@Test(groups = "regression")
	public void organizationWithMemberOf() {
		System.out.println("Member of added");
	}
}
