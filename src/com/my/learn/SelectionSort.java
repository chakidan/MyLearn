package com.my.learn;

import java.util.Arrays;

public class SelectionSort {
	
	
	// 0, 1, 2, 3, 4, 5 ---> index
	// 7, 8, 5, 4, 9, 2 ---> array
	// 7                ---> newly sorted array
	//    i             ---> outer loop i
	// j                ---> Inner loop j
	// 
	
	
	/**
	 * Get the min value, comparing the first element against others, and picking the min
	 * then swap
	 * Iteration Step 1 -7 min value
	 * 2,8,5,4,9,7
	 * Iteration step 2 -8 min value
	 * 2,4,5,8,9,7
	 * Iteration step 3 - 5 min value
	 * 2,4,5,8,9,7
	 * Iteration step 4 - 8 min value
	 * 2,4,5,7,9,8
	 * Iteration step 5 - 9 min value 
	 * 2,4,5,7,8,9
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = new int[6];
		numbers[0] = 7;
		numbers[1] = 8;
		numbers[2] = 5;
		numbers[3] = 4;
		numbers[4] = 9;
		numbers[5] = 2;
		insertionSort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
	
	public static int[] insertionSort(int [] numbers) {

	int i,j, key = 0;
	
	for (i=1; i<numbers.length; i++) {
		key = numbers[i];
		j = i-1;		
		while (j >=0 && numbers[j] > key) {
			numbers[j+1]= numbers[j];
			j--;
		}
		numbers[j+1] = key;
		
	}
	
		
		return numbers;
	}
	
	

}
