package java_problems.easy;

import java.util.Scanner;

public class Lapindromes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			String input = sc.nextLine();
			int length = input.length();
			String a = input.substring(0, length / 2);
			String b;
			if (length % 2 == 1) {
				b = input.substring((length / 2) + 1);
			} else {
				b = input.substring(length / 2);
			}
			System.out.println(checkLapindrome(a, b));
		}
		sc.close();
	}
	
	private static String checkLapindrome(String a, String b) {
		int[] arrA = new int[26];
		int[] arrB = new int[26];
		
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			arrA[(int) ch - 'a']++;
		}
		
		for (int i = 0; i < b.length(); i++) {
			char ch = b.charAt(i);
			arrB[(int) ch - 'a']++;
		}
		
		boolean isLapindrome = true;
		int index = 0;
		while (index < 26) {
			if (arrA[index] != arrB[index]) {
				isLapindrome = false;
				break;
			}
			index++;
		}
		
		if (isLapindrome) {
			return "YES";
		} else {
			return "NO";
		}
		
	}
}