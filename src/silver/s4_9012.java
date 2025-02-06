package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s4_9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int stack = 0;
		
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			char[] lst = br.readLine().toCharArray();
			stack = 0;
			
			for (char c : lst) {
				if (c == '(')
					stack += 1;
				else
					stack -= 1;
				
				if (stack < 0)
					break;
			}
			
			sb.append(stack == 0 ? "YES" : "NO").append("\n");
		}
		System.out.println(sb);
	}
}