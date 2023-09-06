package org.example.findTheOddInt;

import java.util.Arrays;
import java.util.HashMap;

public class FindOdd {
	public int findIt(int[] values) {

		HashMap<Integer, Integer> tally = new HashMap<>();

		for (int num : values) {
			if(tally.containsKey(num)){
				tally.put(num, tally.get(num)+1);
			}

			if(!tally.containsKey(num)){
				tally.put(num, 1);
			}
		}


		for (Object key : tally.keySet()) {
			int modular = tally.get(key) %2;

			if(modular != 0){
//				System.out.println("should be odd: " + "Key: " + key + " " + "Value: " + tally.get(key));
				return (int)key;
			}
		}

		return -1;
	}
}
