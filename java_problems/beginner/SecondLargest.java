package java_problems.beginner;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Three numbers A, B and C are the inputs. Write a program to find second
 * largest among three numbers.
 * 
 * Input: 
 * The first line contains an integer T, total number of testcases. Then follow
 * T lines, each line contains three integers A, B and C.
 * 
 * Output: 
 * Display the second largest among A, B and C.
 * 
 * Constraints: 
 * 1 <= T <= 1000
 * 1 <= A,B,C <= 1000000
 * 
 * Example 
 * Input:
 * 3
 * 120 11 400
 * 10213 312 10
 * 10 3 450
 * 
 * Output: 
 * 120
 * 312
 * 10
 */
public class SecondLargest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			int[] arr = new int[3];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(arr[1]);
		}
		sc.close();
	}
}