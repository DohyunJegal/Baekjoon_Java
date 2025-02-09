package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class s1_2564 {
	static int w, h;
	
	public static int path(int first, int second) {
		// 0, 0을 기준으로 거리를 계산
		int result = 0;
		
		if (first == 1) result = h + second;
		else if (first == 2) result = 2*h + w + (w-second);
		else if (first == 3) result = h - second;
		else result = h + w + second;

		return result;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int shopNo, dong, pathA, pathB, res = 0;

		// 가로 세로
		st = new StringTokenizer(br.readLine(), " ");
		w = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		
		// 상점 거리 계산
		ArrayList<Integer> shops = new ArrayList<>();
		shopNo = Integer.parseInt(br.readLine());
		for (int i = 0; i < shopNo; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			shops.add(path(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		// 동근이 좌표
		st = new StringTokenizer(br.readLine(), " ");
		dong = path(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		
		// 거리 계산
		for (int l : shops) {
			// 미리 계산해둔 거리와 동근이 위치 차이 계산
			pathA = Math.abs(dong-l);
			// 둘레를 이용해 반대방향 계산
			pathB = (2 * h + 2 * w) - pathA;
			res += Math.min(pathA, pathB);
		}
		
		System.out.println(res);
	}
}