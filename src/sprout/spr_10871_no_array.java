package sprout;

import java.util.Scanner;

public class spr_10871_no_array {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int X = input.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			int a = input.nextInt();
			if (a < X) sb.append(a+" ");
		}
		
		System.out.println(sb);
	}
}
