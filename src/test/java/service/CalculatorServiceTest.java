package service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorServiceTest {

	@BeforeClass()
	public static void init() {
		System.out.println("Running before");
	}

	@Before
	public void beforeEach() {
		System.out.println("Running before each");
	}

	@After()
	public void afterEach() {
		System.out.println("Running after each");
	}

	@AfterClass
	public static void cleanUp() {
		System.out.println("Running After");
	}

	@AfterClass
	public static void cleanUp2() {
		System.out.println("Running After2 ");
	}

	@AfterClass
	public static void cleanUp3() {
		System.out.println("Running After3 ");
	}

	@AfterClass()
	public static void cleanUp4() {
		System.out.println("Running After4 ");
	}

	@Test()
	public void addTwoNumbersTest() {
		int result = CalculatorService.addTwoNumbers(12, 20);
		int expected = 32;
		Assert.assertEquals(expected, result);
	}

	@Test
	public void sumAnyNumbersTest() throws InterruptedException {
//		Thread.sleep(5);
		int result = CalculatorService.sumAnyNumbers(12, 20, 1, 1, 1);
		int expected = 35;
		Assert.assertEquals(expected, result);
	}

}
