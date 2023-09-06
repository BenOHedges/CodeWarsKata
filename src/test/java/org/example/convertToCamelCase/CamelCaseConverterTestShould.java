package org.example.convertToCamelCase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamelCaseConverterTestShould {

	@Test
	@DisplayName("take a string and convert it to use came case with no hyphens")
	void takeAStringAndConvertItToUseCameCaseWithNoHyphens() {
		String testString = "the-stealth-warrior";
		CamelCaseConverter converter = new CamelCaseConverter();

		assertEquals("theStealthWarrior", converter.convert(testString));
	}

	@Test
	@DisplayName("take a string and convert it to camel case with no under scores")
	void takeAStringAndConvertItToCamelCaseWithNoUnderScores() {
		String testString = "The_Stealth_Warrior";
		CamelCaseConverter converter = new CamelCaseConverter();

		assertEquals("TheStealthWarrior", converter.convert(testString));
	}

	@Test
	@DisplayName("take a string and convert it to camel case with no hypens or under scores")
	void takeAStringAndConvertItToCamelCaseWithNoHypensOrUnderScores() {

		String testString = "The_Stealth-Warrior";
		CamelCaseConverter converter = new CamelCaseConverter();

		assertEquals("TheStealthWarrior", converter.convert(testString));
	}

}