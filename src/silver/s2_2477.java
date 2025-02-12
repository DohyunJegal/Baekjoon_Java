package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s2_2477 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		// 참외밭 정보 입력
		int chamoe = Integer.parseInt(br.readLine());
		int[][] chamoebat = new int[6][];
		for (int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			chamoebat[i] = new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
		}

		for (int i = 0; i < 6; i++) {
			// 만약 방위의 입력이 [3 1 3 1] 처럼 반복되는 경우, [3 1 3 1] 중간의 [1 3]이 빼줘야 할 넓이
			if (chamoebat[i % 6][0] == chamoebat[(i + 2) % 6][0]
					&& chamoebat[(i + 1) % 6][0] == chamoebat[(i + 3) % 6][0]) {
				// 제곱미터당 참외 * (전체 넓이 - 빼줘야 할 넓이)
				System.out.println(chamoe * ((chamoebat[(i + 4) % 6][1] * chamoebat[(i + 5) % 6][1])
						- (chamoebat[(i + 1) % 6][1] * chamoebat[(i + 2) % 6][1])));
				return;
			}
		}
	}
}