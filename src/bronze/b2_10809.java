package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b2_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] res = new int[26];
		Arrays.fill(res, -1);
		char[] arr = br.readLine().toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (res[(int)arr[i]-97] == -1)
				res[(int)arr[i]-97] = i;
		}
		for (int j : res) {
			sb.append(j).append(" ");
		}
		System.out.println(sb);
	}
}
