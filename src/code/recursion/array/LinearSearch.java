package code.recursion.array;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

	static int search(int[] arr, int target, int index) {
		if (index == arr.length) {
			return -1;
		}
		if (arr[index] == target) {
			return index;
		}
		return search(arr, target, index + 1);
	}

	// static ArrayList<Integer> list = new ArrayList<Integer>();
	static ArrayList<Integer> searchWithArguentsAsList(int[] arr, int target, int index, ArrayList<Integer> list) {
		if (index == arr.length) {
			return list;
		}
		if (arr[index] == target) {
			list.add(index);
		}
		return searchWithArguentsAsList(arr, target, index + 1, list);
	}

	static ArrayList<Integer> searchWithoutArguentsAsList(int[] arr, int target, int index) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (index == arr.length) {
			return list;
		}
		if (arr[index] == target) {
			list.add(index);
		}
		ArrayList<Integer> previousList = searchWithoutArguentsAsList(arr, target, index + 1);
		if (!previousList.isEmpty()) {
			list.addAll(previousList);
		}
		return list;
	}

	static ArrayList<Integer> searchWithoutArguentsAsList1(int[] arr, int target, int index) {
		if (index == arr.length) {
			return new ArrayList<Integer>();
		}
		ArrayList<Integer> previousList = searchWithoutArguentsAsList1(arr, target, index + 1);
		if (arr[index] == target) {
			previousList.add(arr[index]);
		}
		return previousList;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 33, 4, 5, 78, 90, 12, 12 };
		int target = 12;
      	List<Integer> list = List.of(1, 2, 3);

	}

}
