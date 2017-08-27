package com.my.learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LearningGenerics {
	

public void testMethod() {
	
	
	//Array 
	
	int [] array = new int [4] ;
	
	// Array needs to be always initialize with the size. 
	

	Collection values = new ArrayList();
	values.add(5);
	values.add(6);

	// Java 5
	Collection <Integer> values1 = new ArrayList <Integer> ();

	// After Java 7
	Collection <Integer> values2 = new ArrayList <> (); 
 
	//To use Index numbers 
	List <Integer> values3 = new ArrayList <> (); 

	// No duplicates
	Set <Integer> values4 = new HashSet <> ();

	// Sorted Set 
	Set <Integer> values5 = new TreeSet <> ();

	// Key, Value Relationship
	Map <Integer, String> m = new HashMap <> ();
	
	//collection came to java 1.2, Generics came to Java 1.5
	//Java Collections is a class, provide various funtionality
	// Java collection is an Interface

}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
