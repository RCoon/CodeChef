package java_problems.beginner;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * All submissions for this problem are available.
 * 
 * You are asked to calculate factorials of some small positive integers.
 * Input
 * 
 * An integer t, 1 <= t <= 100, denoting the number of testcases, followed by t
 * lines, each containing a single integer n, 1 < =n <= 100.
 * Output
 * 
 * For each integer n given at input, display a line with the value of n!
 * Example
 * 
 * Sample input:
 * 4
 * 1
 * 2
 * 5
 * 3
 * 
 * Sample output:
 * 1
 * 2
 * 120
 * 6
 */
public class SmallFactorials {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			System.out.println(factorial(Integer.parseInt(sc.nextLine())));
		}
		sc.close();
	}
	
	private static String factorial(int num) {
		BigInteger fact = new BigInteger("1");
		
		for (int i = 1; i <= num; i++) {
			fact = fact.multiply(new BigInteger(i + ""));
		}
		return fact.toString();
	}
}