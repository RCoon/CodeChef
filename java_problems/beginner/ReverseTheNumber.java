package java_problems.beginner;

import java.util.Scanner;

/*
 * If an Integer N, write a program to reverse the given number.
 * 
 * Input: 
 * The first line contains an integer T, total number of testcases. Then follow
 * T lines, each line contains an integer N.
 * 
 * Output: 
 * Display the reverse of the given number N.
 * 
 * Constraints: 
 * 1 <= T <= 1000
 * 1 <= N <= 100000
 * 
 * Example 
 * Input:
 * 3
 * 12345
 * 31203
 * 2123
 * 
 * Output:
 * 54321
 * 30213
 * 3212
 */
public class ReverseTheNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			String number = sc.nextLine();
			StringBuilder sb = new StringBuilder();
			for (int j = number.length() - 1; j >= 0; j--) {
				sb.append(number.charAt(j));
			}
			System.out.println(Integer.parseInt(sb.toString()));
		}
		sc.close();
	}
}