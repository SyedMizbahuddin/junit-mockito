package service;

import java.util.Arrays;

public class CalculatorService {

	public static int addTwoNumbers(int a, int b) {
		return a + b;
	}

	public static int mulTwoNumbers(int a, int b) {
		return a * b;
	}

	public static int divTwoNumbers(int a, int b) {
		return a / b;
	}

	public static int sumAnyNumbers(int... nums) {
		return Arrays.stream(nums).sum();
	}

}
