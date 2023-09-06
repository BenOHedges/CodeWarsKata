package org.example.createPhoneNumber;

public class CreatePhoneNumber {


	public String createPhoneNumber(int[] numbers){
		if(numbers.length != 10) throw new ArrayIndexOutOfBoundsException("parameter does not contain 10 elements in an array");

		return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
				numbers[0], numbers[1], numbers[2],
				numbers[3], numbers[4], numbers[5],
				numbers[6], numbers[7],numbers[8],numbers[9]);
	}
}
