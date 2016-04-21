package java_problems.easy;

import java.util.Scanner;

public class TheBestBox {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			double p = sc.nextDouble();
			double s = sc.nextDouble();
			double length = 0;
			double height = 0;
			double base = 0;
			base = (p - Math.sqrt((p*p) - 24*s)) / 12;
			height = base;
			length = ((p/4) - (2*base));
			System.out.printf("%.2f%n", (length * base * height));
		}
		sc.close();
	}
}