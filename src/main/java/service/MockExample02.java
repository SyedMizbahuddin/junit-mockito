
package service;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.LinkedList;

import org.mockito.ArgumentMatcher;
import org.mockito.internal.matchers.NotNull;

public class MockExample02 {

	public static void main(String[] args) {

//		List<String> ok = new ArrayList<>();
//		System.out.println(ok.get(anyInt()));

		LinkedList mockedList = mock(LinkedList.class);

		// stubbing using built-in anyInt() argument matcher
		when(mockedList.get(anyInt())).thenReturn("element");

		// stubbing using custom matcher (let's say isValid() returns your own matcher
		// implementation):
		when(mockedList.contains(argThat(isValid()))).thenReturn(false);

		// following prints "element"
		System.out.println(mockedList.get(999));
		System.out.println(mockedList.contains(999));

		// you can also verify using an argument matcher
		verify(mockedList).get(anyInt());

		// argument matchers can also be written as Java 8 Lambdas
//		verify(mockedList).add(argThat(someString -> someString.length() > 5));

	}

	private static ArgumentMatcher isValid() {
		return new NotNull<>(Integer.class);
	}

}
