package java_problems.beginner;

import java.util.Scanner;

public class PieceOfCake {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			int count = 0;
			int max = 0;
			char temp;
			char[] arr = sc.nextLine().toCharArray();
			
			if (arr.length % 2 == 1) {
				System.out.println("NO");
				continue;
			}
			
			for (int j = 0; j < arr.length; j++) {
				count = 0;
				temp = arr[j];
				for (int k = 0; k < arr.length; k++) {
					if (temp == arr[k]) {
						count++;
					}
				}
				if (count > max) {
					max = count;
				}
			}
			if (max == arr.length / 2) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}