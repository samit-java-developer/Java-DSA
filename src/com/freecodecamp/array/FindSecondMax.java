package com.freecodecamp.array;

public class FindSecondMax {

	public static void main(String[] args) {
		FindSecondMax obj = new FindSecondMax();
		int[] arr = new int[] { 12, 12, 2, 34, 33, 1 };
		System.out.println(obj.findThirdMaxElement(arr));
	}

	int findSecondMaxElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		if (arr.length == 1) {
			throw new IllegalArgumentException("Invalid input....");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}
		}
		return secondMax;
	}

	int findThirdMaxElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		if (arr.length == 1) {
			throw new IllegalArgumentException("Invalid input....");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				thirdMax = secondMax;
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] != max) {
				thirdMax = secondMax;
				secondMax = arr[i];
			} else if (arr[i] > thirdMax && arr[i] != max && arr[i] != secondMax) {
				thirdMax = arr[i];
			}
		}
		return thirdMax;
	}
}
