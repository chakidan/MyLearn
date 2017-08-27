package com.my.learn;

public class BubbleSort {
	
	/**5, 8, 1, 6, 9, 2
	 * first round 
	 * 1,8,5,6,9,2
	 * second iteration take 8
	 * 1,2,5,6,8,9
	 * third iteration take 5
	 * 1,2,
	 */
	//topcoders. 
	// hackerrank 

	static int [] sorted;
	
	
	public int [] bubbleSort1(int [] array) {
		int i,j,temp = 0;
		for (i=1; i < array.length ; i++) {
			for (j=0; j < array.length - 1; j++) {
				if (array[j] > array [j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array [j+1] = temp;
				}
			}
		}
		return array;
	}
	
	public int[] bubbleSort(int [] list) {
		
		//outerloop = i
		//innerloop = j
		//temporial variable = temp
		int temp = 0;
	
		for (int i=0; i < list.length -1 ; i++) {
			// list.length - 1 - i will reduce the number of times the second for loop run
			// better performance
			for (int j=0; j < list.length -1 - i ; j++) {
				//temp = list[j];
				if (list[j]> list [j+1] ) {
				 temp = list[j];
				 list[j] = list[j+1];
				 list[j+1] = temp;
				}
			}
		}
		
		return list ;
		
	}
	

	public static void main(String [] args) {
		
		int [] numbers = new int[6];
		numbers[0] = 5;
		numbers[1] = 8;
		numbers[2] = 1;
		numbers[3] = 6;
		numbers[4] = 9;
		numbers[5] = 2;
		
		System.out.println(numbers);
		
		for ( Object i : numbers) {
			System.out.println(i);
		}
		
		// Original list of numbers 
		// 5, 8, 1, 6, 9, 2
		// swap round 1 - takes the largest item to the end
		// 5,1,6,8,2,9
		// swap round 2 - takes the second largest item to the next end
		// 1,5,6,2,8,9
		// swap round 3 - takes the third largest item in place
		// 1,5,2,6,8,9
		// swap round 4
		// 1,2,5,6,8,9
		
		BubbleSort sort = new BubbleSort();
		sorted = sort.bubbleSort1(numbers);
		
		for (Object i : sorted) {
			System.out.println("Well sorted " + i);
			}
		}
}
