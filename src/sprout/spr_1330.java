package sprout;

import java.util.Scanner;

public class spr_1330 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println((a>b)?">":(a<b)?"<":"==");
	}
}
