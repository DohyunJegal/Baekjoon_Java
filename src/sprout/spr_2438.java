package sprout;

import java.util.Scanner;

public class spr_2438 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		for (int n = 1; n <= a; n++) {
			for (int m = 1; m <= n; m++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
