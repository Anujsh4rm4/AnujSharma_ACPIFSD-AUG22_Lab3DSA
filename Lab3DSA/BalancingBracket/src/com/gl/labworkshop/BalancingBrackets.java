package com.gl.labworkshop;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBrackets {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Please enter the input");
		String input = scan.nextLine();
		checkBalanced(input);
		scan.close();
	}

	public static void checkBalanced(String input) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < input.length(); i++) {
			char value = input.charAt(i);
			if(value =='(' || value=='{' || value=='[') {
				stack.push(value);
			}else {
				if(stack.isEmpty()) {
					System.out.println("The entered Strings do not contain Balanced Brackets");
					return;
				}
				char top = stack.peek();
				if ((top == '(' && value ==')') || (top == '{' && value =='}') || (top == '[' && value ==']')){
					stack.pop();
				}
			}
		}
		if(stack.isEmpty()) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
}
