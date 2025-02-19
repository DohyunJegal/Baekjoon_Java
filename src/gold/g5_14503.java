package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class g5_14503 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		// 방 크기 N x M 입력
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] room = new int[N][M];

		// 청소기의 시작 좌표 (r, c)와 시작 방향 d 입력
		st = new StringTokenizer(br.readLine(), " ");
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		// 방 상태 입력
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < M; j++) {
				room[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// d를 활용한 방향 설정 배열
		// 북 0, 동 1, 남 2, 서 3
		int[][] dir = new int[][] { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };

		// 청소기의 현재 위치와 방향을 (cx, cy), cd 형태로 저장
		int cx = r, cy = c, cd = d;
		// 결과
		int res = 0;
		// 동작 시작
		while (true) {
			// 1. 청소 안되어 있으면 청소
			// 청소된 상태를 2로 저장
			if (room[cx][cy] == 0) {
				room[cx][cy] = 2;
				res++;
			}

			// 주변 네 칸이 깨끗하거나 벽인 경우
			if ((room[cx - 1][cy] != 0) && (room[cx][cy + 1] != 0) && (room[cx + 1][cy] != 0)
					&& (room[cx][cy - 1] != 0)) {
				// 바라보는 방향 유지 후 후진했을 때 벽이라면 작동 중단
				if (room[cx - dir[cd][0]][cy - dir[cd][1]] == 1) {
					break;
				} else {
					// 벽이 아니라면 후진
					cx -= dir[cd][0];
					cy -= dir[cd][1];
				}
			} else {
				// 주변 네 칸 중 청소되지 않은 칸이 있는 경우
				// 반시계 방향 90도 회전
				cd -= 1;
				if (cd < 0)
					cd = 3;
				
				// 바라보는 방향 앞 칸이 청소 안된 칸이라면 전진
				if (room[cx + dir[cd][0]][cy + dir[cd][1]] == 0) {
					cx += dir[cd][0];
					cy += dir[cd][1];
				}
			}

		}

		System.out.println(res);
	}
}