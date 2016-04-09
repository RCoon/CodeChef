package java_problems.beginner;

import java.util.Locale;
import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			int salary = sc.nextInt();
			double grossSalary;
			if (salary < 1500) {
				grossSalary = salary + salary;
			} else {
				grossSalary = salary + 500 + (0.98 * salary);
			}
			System.out.println(cppPrintFormat(salary, grossSalary));
		}
		sc.close();
	}
	
	private static String cppPrintFormat(int s, double sal) {
		double m = s / 100.0 - 50275 / 100.0;
		int w = (int) m;
		double d=m-w;
		if ((m >= 0.0) && (Math.abs(d - 0.0) < 0.01)) {
			return (String.valueOf((int) sal));
		} else {
			String salStr = String.format(Locale.ENGLISH, "%g", sal);
			return (salStr.indexOf('.') < 0 ? salStr
					: salStr.replaceAll("\\.?0+$", ""));
		}
	}
}