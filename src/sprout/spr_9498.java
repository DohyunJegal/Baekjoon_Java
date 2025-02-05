package sprout;

import java.util.Scanner;

public class spr_9498 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		char res;
		switch(score/10) {
			case 10:
			case 9:
				res = 'A';
				break;
			case 8:
				res = 'B';
				break;
			case 7:
				res = 'C';
				break;
			case 6:
				res = 'D';
				break;
			default:
				res = 'F';
				break;
		}
		System.out.println(res);
	}
}
