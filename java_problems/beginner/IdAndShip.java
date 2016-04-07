package java_problems.beginner;

import java.util.Scanner;

public class IdAndShip {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			char c = sc.nextLine().charAt(0);
			System.out.println(getShipType(c));
		}
		sc.close();
	}
	
	private static String getShipType(char id) {
		switch (id) {
		case 'B':
		case 'b':
			return "BattleShip";
		case 'C':
		case 'c':
			return "Cruiser";
		case 'D':
		case 'd':
			return "Destroyer";
		case 'F':
		case 'f':
			return "Frigate";
		default:
			return "Unknown ship ID";
		}
	}
}