package service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.List;

public class MockExample {

	public static void main(String[] args) {
		List mockedList = mock(List.class);

		// using mock object
		mockedList.add("one");
		mockedList.clear();

		System.out.println(mockedList);
//		System.out.println(mockedList.get(0));

		// verification
		verify(mockedList).add("one");
		verify(mockedList).clear();
		verify(mockedList).get(100);
	}

}
