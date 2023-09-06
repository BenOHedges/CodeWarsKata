package org.example.validBraces;

import java.util.Stack;

public class BraceChecker {
	public boolean isValid(String braces) {
		Stack<Character> stack = new Stack<>();

		for (char c : braces.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}

				char top = stack.pop();

				if (c == ')' && top != '(') {
					return false;
				}
				if (c == ']' && top != '[') {
					return false;
				}
				if (c == '}' && top != '{') {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}

}
