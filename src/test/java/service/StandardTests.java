package service;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class StandardTests {

	@BeforeAll
	static void initAll() {
		System.out.println("initAll");
	}

	@BeforeEach
	void init() {
		System.out.println("init");
	}

	@Test
	void succeedingTest() {
		System.out.println("succeedingTest");
	}

	@Test
	void failingTest() {
		System.out.println("failingTest");
		fail("a failing test");
	}

	@Test
	@Disabled("for demonstration purposes")
	void skippedTest() {
		System.out.println("skippedTest");
		// not executed
	}

	@Test
	void abortedTest() {
		System.out.println("abortedTest");
		assumeTrue("abc".contains("Z"));
//		fail("test should have been aborted");
	}

	@AfterEach
	void tearDown() {
		System.out.println("tearDown");
	}

	@AfterAll
	static void tearDownAll() {
		System.out.println("tearDownAll");
	}

}
