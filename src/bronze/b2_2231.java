package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2_2231 {
	public static int sum(int n) {
		int res = 0;
		
		while (n > 0) {
			res += n%10;
			n /= 10;
		}
		
		return res;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res = 0;
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 1; i < N; i++) {
			if (i+sum(i) == N) {
				res = i;
				break;
			}
		}
		
		System.out.println(res);
	}
}