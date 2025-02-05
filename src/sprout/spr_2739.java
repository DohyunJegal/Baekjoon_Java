package sprout;

import java.util.Scanner;

public class spr_2739 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int a = 1; a <= 9; a++) {
			System.out.println(n + " * " + a + " = " + (a*n));
		}
	}
}
