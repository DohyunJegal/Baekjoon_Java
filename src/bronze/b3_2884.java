package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b3_2884 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		int time = Integer.parseInt(st.nextToken())*60 + Integer.parseInt(st.nextToken()) - 45;
		if (time<0) time += 1440;
		sb.append(time/60).append(" ").append(time%60);
		System.out.println(sb);
	}
}