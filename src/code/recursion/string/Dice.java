package code.recursion.string;

public class Dice {
	public static void main(String[] args) {
		int[] arr = { 1, 2 };
		dice("", 4, arr);
	}

	static void dice(String p, int target, int[] arr) {
		if (target == 0) {
			System.out.println(p);
			return;
		}
		for (int i = 0; i < arr.length && arr[i] <= target; i++) {
			dice(p + arr[i], target - arr[i], arr);
		}
	}
}
