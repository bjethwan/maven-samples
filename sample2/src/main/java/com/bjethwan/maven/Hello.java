package com.bjethwan.maven;


import org.apache.log4j.BasicConfigurator;

import org.apache.log4j.Level;

import org.apache.log4j.Logger;



/**
 * Hello world!
 */

public class Hello 
{

    
	public static void main(String... args) 
	{
        
		BasicConfigurator.configure();
        
		Logger logger = Logger.getLogger("com.bjethwan");
        
		logger.setLevel(Level.INFO);
        
		logger.info("Hello, World!");
    
	}

}
