package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b3_2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int m = 0, index = 0;
		for (int i = 1; i <= 9; i++) {
			int tmp = Integer.parseInt(br.readLine());
			if (tmp > m) {
				m = tmp;
				index = i;
			}
		}
		sb.append(m).append("\n").append(index);
		System.out.println(sb);
	}
}
