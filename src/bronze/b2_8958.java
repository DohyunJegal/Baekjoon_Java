package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2_8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res, stack;
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			res = 0; stack = 0;
			for (char c : br.readLine().toCharArray()) {
				if (c == 'O') {
					stack += 1;
					res += stack;
				} else {
					stack = 0;
				}
			}
			System.out.println(res);
		}
	}
}
