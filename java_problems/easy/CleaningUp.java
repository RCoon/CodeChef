package java_problems.easy;

import java.util.Scanner;

public class CleaningUp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			int totalJobsToComplete = sc.nextInt();
			int numJobsAlreadyComplete = sc.nextInt();
			boolean[] array = new boolean[totalJobsToComplete + 1];
			for (int j = 0; j < numJobsAlreadyComplete; j++) {
				int index = sc.nextInt();
				array[index] = true;
			}
			
			int jobCount = 0;
			for (int k = 1; k < array.length; k++) {
				if (array[k] == false) {
					jobCount++;
					if (jobCount % 2 != 0) {
						System.out.print(k + " ");
					}
				}
			}
			System.out.println();
			jobCount = 0;
			for (int index = 1; index < array.length; index++) {
				if (array[index] == false) {
					jobCount++;
					if (jobCount % 2 == 0) {
						System.out.print(index + " ");
					}
				}
			}
			System.out.println();
		}
		sc.close();
	}
}