package com.freecodecamp.string;

public class Palindrome {

	public boolean isPalindrome(String word) {
		char[] charArray = word.toCharArray();
		int start = 0;
		int end = charArray.length - 1;
		while (start < end) {
			if (charArray[start] != charArray[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		Palindrome obj = new Palindrome();
		System.out.println(obj.isPalindrome("abc"));
	}

}
