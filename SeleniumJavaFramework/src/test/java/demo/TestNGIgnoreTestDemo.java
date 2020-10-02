package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//Add the ignore annotation at class Level
// @Ignore
public class TestNGIgnoreTestDemo {

	//Create a method
	//Add Test annotation of TestNG
	@Test
	public void test1() {
		System.out.println("I am inside test 1");
	}

	@Test
	public void test2() {
		System.out.println("I am inside test 2");
	}

	@Test
	public void test3() {
		System.out.println("I am inside test 3");
	}

}
