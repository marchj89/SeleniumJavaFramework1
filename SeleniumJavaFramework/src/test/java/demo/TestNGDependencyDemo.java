package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	//Let's create a method
	//add Test annotation from TestNG
	//Create dependency “dependsOnMethods”
	@Test( dependsOnGroups = {"hospital.*"} )
	public void test1() {
		System.out.println("I am inside test 1");
		
	}
	
	@Test(groups= {"hospital"})
	public void test2() {
		System.out.println("I am inside test 2");
		
	}
	
	@Test(groups= {"Church"})
	public void test3() {
		System.out.println("I am inside test 3");
		
	}
	
	@Test(groups= {"hospital"})
	public void test4() {
		System.out.println("I am inside test 4");
		
	}

}
