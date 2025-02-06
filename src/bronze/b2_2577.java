package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2_2577 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		sb.append(A*B*C);
		for (int i = 0; i < sb.length(); i++) {
			arr[Character.getNumericValue(sb.charAt(i))] += 1;
		}
		for (int j : arr) {
			System.out.println(j);
		}
	}
}