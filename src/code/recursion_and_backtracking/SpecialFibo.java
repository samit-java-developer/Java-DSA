package code.recursion_and_backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialFibo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String test = br.readLine().trim();
		int t = Integer.parseInt(test);
		System.out.println();
		while (t-- > 0) {
			String[] arr = br.readLine().trim().split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			int n = Integer.parseInt(arr[2]);
			System.out.println();
			int result = findFibo(n, a, b);
			System.out.println(result);
		}

	}

	public static int findFibo(int n, int a, int b) {
		if (n == 0) {
			return a;
		}
		if (n == 1) {
			return b;
		}
		return findFibo(n - 1, a, b) ^ findFibo(n - 2, a, b);
	}

}
