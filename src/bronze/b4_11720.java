package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b4_11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res = 0;
		int N = Integer.parseInt(br.readLine());
		String S[] = br.readLine().split("");
		for (String i : S) res += Integer.parseInt(i);
		System.out.println(res);
	}
}