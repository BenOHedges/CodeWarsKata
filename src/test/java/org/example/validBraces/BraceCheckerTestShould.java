package org.example.validBraces;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BraceCheckerTestShould {

	@ParameterizedTest
	@ValueSource(strings = {"{}", "()", "[]", "(){}[]"} )
	void passWhenInputParameterReturnsTrueWhenMatchingOpenAndCloseBracesAreFound(String input) {

		BraceChecker checker = new BraceChecker();

		assertTrue(checker.isValid(input));
	}

}