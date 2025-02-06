package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2_2292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int res = 1, cnt = 1;
		while(res < N) {
			res += cnt * 6;
			cnt++;
		}
		System.out.println(cnt);
	}
}