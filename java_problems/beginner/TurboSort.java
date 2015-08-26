package java_problems.beginner;

import java.util.*;

class TurboSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer("");
		int t = sc.nextInt();
		int[] array = new int[t];
		for (int i = 0; i < t; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		for (int j : array) {
			sb.append(j + "\n");
		}
		System.out.println(sb);
		sc.close();
	}
}