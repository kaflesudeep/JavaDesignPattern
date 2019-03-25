package aamainMethod;

import SingletonDesignpattern.SDP_Eager;

public class SingletonMainMethod {

	// 1. private constructor
	// 2. private static variable; 
	// 3. public class that return the variable. 
	
	static SDP_Eager  ob1 = SDP_Eager.createObject(); 
   
	public static void  main(String[] args){
		System.out.println(ob1.toprint());
	}
    
	
}