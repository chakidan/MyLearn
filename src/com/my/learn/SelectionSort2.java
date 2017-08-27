package com.my.learn;

public class SelectionSort2 {

	public static void main(String[] args) {

		int[] A = new int[10];
		populate(A);
		printArray(A);
		System.out.println("Before Sorting    **** ");
		
		//leetcode.com
		
			
		int key = 0;
		int i = 0;
		for (int j=1; j<A.length ; j++) {
			key = A[j];
			i = j-1;
			
			while( (i >= 0)&& (A[i] > key) ){
				A[i+1] = A[i];
				i = i - 1;
			}
			A[i+1] = key;
		}
		printArray(A);
		System.out.println("After Sorting    **** ");
		 

	}

	public static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
			
		}

	}

	public static int[] populate(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*1000);
			//System.out.print(array[i]);
		}
		return array;

	}
	
	

}
