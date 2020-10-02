package demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {

	//Let's create the method

	//Let's give them the Test annotation

	@Test
	public void one() {
		System.out.println("I am inside test1");

	}

	@Test(priority = 1)
	public void two() {
		
		System.out.println("I am inside test2");

	}

	@Test(priority = 0)
	public void three() {
		
		System.out.println("I am inside test3");

	}

}
