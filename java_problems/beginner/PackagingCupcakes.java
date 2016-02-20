package java_problems.beginner;

import java.util.Scanner;

/*
 * All submissions for this problem are available.
 * 
 * Now that Chef has finished baking and frosting his cupcakes, it's time to
 * package them. Chef has N cupcakes, and needs to decide how many cupcakes to
 * place in each package. Each package must contain the same number of cupcakes.
 * Chef will choose an integer A between 1 and N, inclusive, and place exactly A
 * cupcakes into each package. Chef makes as many packages as possible. Chef
 * then gets to eat the remaining cupcakes. Chef enjoys eating cupcakes very
 * much. Help Chef choose the package size A that will let him eat as many
 * cupcakes as possible.
 * 
 * Input: 
 * Input begins with an integer T, the number of test cases. Each test case
 * consists of a single integer N, the number of cupcakes.
 * Output
 * 
 * For each test case, output the package size that will maximize the number of
 * leftover cupcakes. If multiple package sizes will result in the same number
 * of leftover cupcakes, print the largest such size.
 * 
 * Constraints: 
 * 1 <= T <= 1000
 * 2 <= N <= 100000000 (10^8)
 * 
 * Sample Input: 
 * 2
 * 2
 * 5
 * 
 * Sample Output:
 * 2
 * 3
 */
public class PackagingCupcakes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			int numCupcakes = Integer.parseInt(sc.nextLine());
			System.out.println((numCupcakes / 2) + 1);
		}
		sc.close();
	}
}