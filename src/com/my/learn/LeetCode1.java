package com.my.learn;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {

	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No two sum Solution");

	}

	public static int[] twoSumMap(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println(i);
			int complement = target - nums[i];
			if (map.containsValue(complement) && map.get(complement) != null) {
				System.out.println(map.toString());
				return new int[] { i, map.get(complement) };
			}
		}
		throw new IllegalArgumentException("No two sum Solution");

	}

	public static int[] twoSumMapImproved(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { i, map.get(complement) };
			}
			map.put(nums[i], i);
		}

		throw new IllegalArgumentException("No two sum Solution");

	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 7, 6, 11, 15, 3 };
		printArray(nums);
		System.lineSeparator();
		printArray(twoSum(nums, 9));
		System.lineSeparator();
		printArray(twoSumMap(nums, 9));
		System.lineSeparator();
		printArray(twoSumMapImproved(nums, 9));
		//
	}

}
