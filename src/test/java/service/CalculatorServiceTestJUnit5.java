package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTestJUnit5 {

	@BeforeAll
	public static void init() {
		System.out.println("Before all");
	}

	@BeforeAll
	public static void init2() {
		System.out.println("Before all2");
	}

	@BeforeEach
	public void init3() {
		System.out.println("Before each");
	}

	@Test
	@DisplayName(value = "okoko")
	public void addTwoNumbersTest() {
		int result = CalculatorService.addTwoNumbers(12, 20);
		int expected = 32;
		Assertions.assertEquals(expected, result);
	}

	@Test
	public void sumAnyNumbersTest() throws InterruptedException {
//		Thread.sleep(5);
		int result = CalculatorService.sumAnyNumbers(12, 20, 1, 1, 1);
		int expected = 35;
		Assertions.assertEquals(expected, result);
	}

	@Test
	@Disabled
	public void sumAnyNumbersTest2() throws InterruptedException {
//		Thread.sleep(5);
		int result = CalculatorService.sumAnyNumbers(12, 20, 1, 1, 1);
		int expected = 35;
		Assertions.assertEquals(expected, result);
	}

}
