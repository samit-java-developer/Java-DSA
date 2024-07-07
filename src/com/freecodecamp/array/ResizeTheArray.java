package com.freecodecamp.array;

import java.util.Arrays;

public class ResizeTheArray {

	public int[] resize(int[] arr, int capacity) {
		int[] temp = new int[capacity];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		//arr = temp;
		return temp;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 9, 3, 10 };
		ResizeTheArray obj = new ResizeTheArray();
		System.out.println(Arrays.toString(arr));
		arr=obj.resize(arr, arr.length * 2);
		System.out.println(Arrays.toString(arr));
	}

}
