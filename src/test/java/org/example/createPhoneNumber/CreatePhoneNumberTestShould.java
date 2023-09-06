package org.example.createPhoneNumber;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreatePhoneNumberTestShould {
	@Test
	@DisplayName("return an argument exception if numbers passed in are not 10 digits in length")
	void returnAnArgumentExceptionIfNumbersPassedInAreNot10DigitsInLength() {
		int[] phoneNumberLessThan10 = {0,1,2};
		int[] phoneNumberGreaterThan10 = {0,1,2,3,4,5,6,7,8,9,0,1,2};

		CreatePhoneNumber number = new CreatePhoneNumber();

		Throwable exceptionForLessThan10 = assertThrows(ArrayIndexOutOfBoundsException.class, ()-> number.createPhoneNumber(phoneNumberLessThan10));
		Throwable exceptionForGreaterThan10 = assertThrows(ArrayIndexOutOfBoundsException.class, ()-> number.createPhoneNumber(phoneNumberGreaterThan10));

		assertTrue(exceptionForLessThan10.getMessage().contains("parameter does not contain 10 elements in an array"));
		assertTrue(exceptionForGreaterThan10.getMessage().contains("parameter does not contain 10 elements in an array"));
	}

	@Test
	@DisplayName("convert the phone number array to formatted string")
	void convertThePhoneNumberArrayToFormattedString() {

		int[] phoneNumber = {0,1,2,3,4,5,6,7,8,9};
		CreatePhoneNumber number = new CreatePhoneNumber();

		assertEquals("(012) 345-6789", number.createPhoneNumber(phoneNumber));
	}

}