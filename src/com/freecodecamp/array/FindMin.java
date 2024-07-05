package com.freecodecamp.array;

public class FindMin {
	
	public int findMinium(int[] arr) {
		if (arr==null || arr.length==0) {
			throw new IllegalArgumentException("Invalid Input");
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int[] arr= {5,9,3,15,1,2};
		FindMin obj=new FindMin();
		System.out.println(obj.findMinium(arr));
	}

}
