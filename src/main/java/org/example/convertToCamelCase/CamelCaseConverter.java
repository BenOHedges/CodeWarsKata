package org.example.convertToCamelCase;

public class CamelCaseConverter {
	public String convert(String originalString) {

		String[] filteredString = originalString.split("[-_]");
		String combinedWord = filteredString[0];

		for (int i = 1; i < filteredString.length; i++) {
			String firstLetter = filteredString[i].substring(0,1);
			String remainingLetters = filteredString[i].substring(1);

			firstLetter = firstLetter.toUpperCase();

			combinedWord += firstLetter + remainingLetters;
		}

		return combinedWord;
	}
}
