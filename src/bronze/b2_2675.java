package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2_2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;
		int R = 0;
		int T = Integer.parseInt(br.readLine());
		String str = "";
		for (int i = 1; i <= T; i++) {
			sb = new StringBuilder();
			st = new StringTokenizer(br.readLine(), " ");
			R = Integer.parseInt(st.nextToken());
			str = st.nextToken();
			for(char c : str.toCharArray()) {
				for (int j = 0; j < R; j++) {
					sb.append(c);
				}
			}
			System.out.println(sb);
		}
	}
}
