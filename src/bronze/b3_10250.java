package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b3_10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int H, W, N, res;
		
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			H = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			
			// ��==N%H, ���� N%H==0 �̶�� H
			// ȣ��==N/H+1, ���� N%H==0 �̶�� N/H
			res = N%H==0?(H*100)+(N/H):(N%H*100)+(N/H+1);
			System.out.println(res);
		}
	}
}