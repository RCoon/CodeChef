package java_problems.easy;

import java.util.Scanner;

public class CielAndABProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = a - b;
		if (ans == 1 || ans % 2 == 0) {
			ans += 1;
		} else {
			ans -= 1;
		}
		System.out.println(ans);
		sc.close();
	}
}