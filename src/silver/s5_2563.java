package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s5_2563 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 도화지를 표현한 배열, 색칠 시 true
		// 겹치는 부분을 쉽게 해결
		boolean[][] dowhaji = new boolean[100][100];
		// 색칠 영역 카운트용 변수
		int res = 0;
		
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					// 색칠이 안되어있다면 색칠 후 카운트 증가
					if (!dowhaji[x+i][y+j]) {
						dowhaji[x+i][y+j] = true;
						res += 1;
					}
				}
			}
		}
		
		System.out.println(res);
	}
}
