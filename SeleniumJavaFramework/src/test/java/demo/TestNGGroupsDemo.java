package demo;

import org.testng.annotations.Test;

@Test(groups = {"ALLClassTests"})
public class TestNGGroupsDemo {

	
	//Let's create the method

		//Let's give them the Test annotation

		@Test(groups= {"sanity"})
		public void test1() {
			System.out.println("I am inside test1");

		}

		@Test(groups= {"windows.test", "smoke"})
		public void test2() {
			
			System.out.println("I am inside test2");

		}

		@Test(groups= {"windows.sanity","regression"})
		public void test3() {
			
			System.out.println("I am inside test3");

		}
		
		@Test
		public void test4() {
			
			System.out.println("I am inside test4");

		}
}
