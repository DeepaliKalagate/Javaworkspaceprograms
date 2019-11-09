package com.bridgelabz.annotation;

import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {

	private Principal principal;

	public College(Principal principal) {
		this.principal = principal;
	}

	public void test() {
		// TODO Auto-generated method stub
		principal.principalInfo();
		System.out.println("Testing this class method");
	}
}
