package java_problems.beginner;

import java.util.Scanner;

/*
 * While purchasing certain items, a discount of 10% is offered if the quantity
 * purchased is more than 1000.
 * If the quantity and price per item are input, write a program to calculate
 * the total expenses.
 * 
 * Input: 
 * The first line contains an integer T, total number of test cases. Then follow
 * T lines, each line contains integers quantity and price.
 * 
 * Output: 
 * Output the total expenses while purchasing items.
 * 
 * Constraints: 
 * 1 <= T <= 1000
 * 1 <= quantity,price <= 100000
 * 
 * Example 
 * Input: 
 * 3
 * 100 120
 * 10 20
 * 1200 20
 * 
 * Output: 
 * 12000.000000
 * 200.000000
 * 21600.000000
 */
public class TotalExpenses {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			int quantity = sc.nextInt();
			int price = sc.nextInt();
			double totalExpense = quantity * price;
			if (quantity > 1000) {
				System.out.printf("%.6f%n", (.9 * totalExpense));
			} else {
				System.out.printf("%.6f%n", totalExpense);
			}
		}
		sc.close();
	}
}