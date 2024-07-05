package com.freecodecamp.array;

import java.util.Arrays;

public class MoveAllZeros {

	public void moveZeros(int[] arr, int n) {
		int j = 1;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				continue;
			}
			j = i + 1;
			while (j < n && arr[j] == 0) {
				j++;
			}
			if (i<n && j<n) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 8, 1, 0, 2, 1, 0, 3 };
		int n = arr.length;
		MoveAllZeros obj = new MoveAllZeros();
		obj.moveZeros(arr, n);
		System.out.println(Arrays.toString(arr));
	}

}
