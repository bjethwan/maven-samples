package com.bjethwan.maven;

import java.util.ResourceBundle;

/**
 * Hello world!
 * 
 * Resource bundle instances created by the getBundle factory methods are cached by default.
 *
 * and the factory methods return the same resource bundle instance multiple times if it has been cached. 
 * getBundle clients may clear the cache, manage the lifetime of cached resource bundle instances using time-to-live values, 
 * or specify not to cache resource bundle instances. 
 * 
 */
public class Hello {

	public static void main(String... args) 
	{
		ResourceBundle bundle = ResourceBundle.getBundle("application");
		
		System.out.println(bundle.getString("hello"));
	}
}
