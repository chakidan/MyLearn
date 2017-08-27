package com.my.learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// collections provide us dynamic type of data structures. 

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[4];
		Object[] array2 = new Object[4];
		array2[0] = 2;
		array2[1] = "collection";

		// There are Java Generics Conventions
		// http://docs.oracle.com/javase/tutorial/java/generics/types.html

		Collection<Integer> collectionvalues = new ArrayList<>();
		// collectionvalues.add("My Name");
		collectionvalues.add(2);
		// collectionvalues.add(23.23);
		collectionvalues.add(42);

		Iterator i = collectionvalues.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}

		for (Object i1 : collectionvalues) {
			System.out.println(i1);
		}

		for (int i1 : collectionvalues) {
			System.out.println(i1);
		}
		
		
		List <Integer> testList = new ArrayList<>(); 
		testList.add(1);
		testList.add(43);
		testList.add(39);
		testList.add(22);
		testList.add(2, 21);
		
		for (int j : testList) {
			System.out.println("list " + j);
		}

	}

}
