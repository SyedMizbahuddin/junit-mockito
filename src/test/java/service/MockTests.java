package service;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class MockTests {

	@Mock
	MockExample00 mockExample00;

	@Test
	void mockTest(@Mock MockExample00 mockExample00) {

	}

}
