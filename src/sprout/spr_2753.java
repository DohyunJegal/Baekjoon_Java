package sprout;

import java.util.Scanner;

public class spr_2753 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		System.out.println((year%4==0&&(year%100!=0||year%400==0))?1:0);
	}
}
