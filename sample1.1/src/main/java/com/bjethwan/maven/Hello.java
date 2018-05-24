package com.bjethwan.maven;

import java.util.ResourceBundle;

public class Hello {

	public static void main(String... args) 
	{
		ResourceBundle bundle = ResourceBundle.getBundle("application");
		
		System.out.println(bundle.getString("hello"));
	}
}
