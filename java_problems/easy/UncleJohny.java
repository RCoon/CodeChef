package java_problems.easy;

import java.util.Arrays;
import java.util.Scanner;

public class UncleJohny {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			int numSongs = sc.nextInt();
			int[] arr = new int[numSongs];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			
			int johnyPos = sc.nextInt() - 1;
			int johnySongLength = arr[johnyPos];
			Arrays.sort(arr);
			int index = 0;
			while (arr[index] < johnySongLength) {
				index++;
			}
			System.out.println(index + 1);
		}
		sc.close();
	}
}