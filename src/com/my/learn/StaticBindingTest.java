package com.my.learn;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author Charaka Danansooriya
 *
 */

public class StaticBindingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection c = new HashSet();
		StaticBindingTest staticBindingTest = new StaticBindingTest();
		staticBindingTest.sort(c);

	}

	public Collection sort(Collection c) {
		// TODO Auto-generated method stub
		System.out.println("Inside Collection Sort method");
		return c;
		
	}
	
	private Collection sort(HashSet hs) {
		System.out.println("Inside ");
		return hs;		
	}

}
