package org.stepdefinition;

import org.baseclass.BaseClasss;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClasss {
	@Before
	public void beforeScenario() {
		Launchbrowser("chrome");
		toMaximize();
		impwait();
	}

//	@Before("@smoke")
//	public void beforesmoke() {
//		System.out.println("2");
//
//	}
//
//	@After("@smoke")
//	public void aftersmoke() {
//  System.out.println("2");
//	}
//
//	@Before("@sanity")
//	public void beforesanity() {
//		System.out.println("3");
//
//	}
//
//	@After("@sanity")
//	public void aftersanity() {
//		System.out.println("3");
//
//	}
//
//	@Before("@regreesion")
//	public void beforeregression() {
//		System.out.println("4");
//
//	}
//
//	@After("@regreesion")
//	public void afterregreesion() {
//		System.out.println("4");
//
//	}

	@After
	public void afterScenario() {
		toQuit();
	}
}
