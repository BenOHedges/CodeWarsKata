package org.example.findTheOddInt;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindOddTest {

	@Test
	@DisplayName("return 2 because it only has a single occurrence making it odd")
	void return2BecauseItOnlyHasASSingleOccurrenceMakingItOdd() {

//		int[] values = {1,1,2};
		int[] values = {1,1,1,1,1,1,10,1,1,1,1,2,2,2,2};

		FindOdd findOdd = new FindOdd();

		assertEquals(10, findOdd.findIt(values));
	}

	@Test
	@DisplayName("Test name")
	void testName() {

		int[] values = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};

		FindOdd findOdd = new FindOdd();

		assertEquals(5, findOdd.findIt(values));
	}

}