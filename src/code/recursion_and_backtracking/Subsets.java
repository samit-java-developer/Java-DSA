package code.recursion_and_backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		List<Integer> list = List.of(3, 4, 5, 8);
		// List<List<Integer>> result = getAllSubSets(new ArrayList<Integer>(), list,
		// 0);
		List<List<Integer>> result = getAllSubSetsSum(new ArrayList<Integer>(), 9, 0, list, 0);
		Collections.sort(result, (o1, o2) -> {
			for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
				int c = o1.get(i).compareTo(o2.get(i));
				if (c != 0) {
					return c;
				}
			}
			return Integer.compare(o1.size(), o2.size());
		});
		System.out.println(result);
		System.out.println("=================================");
		System.out.println(getAllSubSetsSum(new ArrayList<Integer>(), 8, 0, list, 0));
	}

	@SuppressWarnings("unused")
	private static List<List<Integer>> getAllSubSets(List<Integer> subSet, List<Integer> list, int index) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (index == list.size()) {
			// Here we copying the whole subset as new object
			result.add(new ArrayList<>(subSet));
			return result;
		}
		int element = list.get(index);
		subSet.add(element);
		result.addAll(getAllSubSets(subSet, list, index + 1));
		subSet.remove(subSet.size() - 1);
		result.addAll(getAllSubSets(subSet, list, index + 1));
		return result;
	}

	private static List<List<Integer>> getAllSubSetsSum(List<Integer> subSet, int sum, int temp, List<Integer> list,
			int index) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int element = list.get(index);
		if (index == list.size() - 1 || temp >= sum) {
			if (temp == sum) {
				result.add(new ArrayList<>(subSet));
			}
			return result;
		}
		subSet.add(element);
		temp = temp + element;
		result.addAll(getAllSubSetsSum(subSet, sum, temp, list, index + 1));
		subSet.remove(subSet.size() - 1);
		temp = temp - element;
		result.addAll(getAllSubSetsSum(subSet, sum, temp, list, index + 1));
		return result;
	}
}
