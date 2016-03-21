package java_problems.beginner;

import java.util.Arrays;
import java.util.Scanner;

/*
 * You are given a sequence a1, a2, ..., aN. Find the smallest possible value of
 * ai + aj, where 1 <= i < j <= N.
 * 
 * Input: 
 * The first line of the input contains an integer T denoting the number of test
 * cases. The description of T test cases follows.
 * The first line of each description consists of a single integer N.
 * The second line of each description contains N space separated integers - a1,
 * a2, ..., aN respectively.
 * 
 * Output: 
 * For each test case, output a single line containing a single integer - the
 * smallest possible sum for the corresponding test case.
 * 
 * Constraints: 
 * T = 105, N = 2 : 13 points.
 * T = 105, 2 <= N <= 10 : 16 points.
 * T = 1000, 2 <= N <= 100 : 31 points.
 * T = 10, 2 <= N <= 105 : 40 points.
 * 1 <= ai <= 106
 * 
 * Example 
 * Input:
 * 1
 * 4
 * 5 1 3 4
 * 
 * Output:
 * 4
 */
public class SmallestPair {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			int arrLength = sc.nextInt();
			int[] arr = new int[arrLength];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(arr[0] + arr[1]);
		}
		sc.close();
	}
}