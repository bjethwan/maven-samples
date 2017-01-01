package com.bjethwan;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a numeric string\n");
		
		String s = scanner.nextLine();
		
		if(StringUtils.isNumeric(s))
			System.out.println("Good: You really entered a numeric string");
		else
			System.out.println("Bad: You got to entere a numeric string!!!");

	}

}
