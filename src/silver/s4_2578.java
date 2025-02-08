package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class s4_2578 {
	// 빙고 체커
	public static int bingoCounter(int[][] pan) {
		int bingoRes = 0;
		boolean isBingo;
		
		// 행 체크
		for (int i = 0; i < 5; i++) {
			isBingo = true;
			for (int j = 0; j < 5; j++) {
				if (pan[i][j] != 0) {
					isBingo = false;
					break;
				}
			}
			if (isBingo) bingoRes++;
		}
		
		// 열 체크
		for (int i = 0; i < 5; i++) {
			isBingo = true;
			for (int j = 0; j < 5; j++) {
				if (pan[j][i] != 0) {
					isBingo = false;
					break;
				}
			}
			if (isBingo) bingoRes++;
		}
		
		// 대각선 체크
		// 좌상우하
		isBingo = true;
		for (int i = 0; i < 5; i++) {
			if (pan[i][i] != 0) {
				isBingo = false;
				break;
			}
		}
		if (isBingo) bingoRes++;
		// 좌하우상
		isBingo = true;
		for (int i = 0; i < 5; i++) {
			if (pan[i][4-i] != 0) {
				isBingo = false;
				break;
			}
		}
		if (isBingo) bingoRes++;
		
		return bingoRes;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int res = 1;
		
		// 빙고판 채우기
		int[][] bingoPan = new int[5][5];
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 5; j++) {
				bingoPan[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 사회자가 불러주는 빙고 기록
		ArrayList<Integer> calledNo = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 5; j++) {
				calledNo.add(Integer.parseInt(st.nextToken()));
			}
		}
		
		// 체크 시작
		for (int c : calledNo) {
			// 부른 숫자를 기록
			out : for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (bingoPan[i][j] == c) {
						bingoPan[i][j] = 0;
						break out;
					}
				}
			}
		
			// 3빙고가 넘었는지 확인
			if (bingoCounter(bingoPan) >= 3) {
				System.out.println(res);
				return;
			}
			res++;
		}
	}
}