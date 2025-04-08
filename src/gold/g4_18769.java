package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class g4_18769 {
	static class Edge implements Comparable<Edge> {
		int from, to, weight;

		public Edge(int from, int to, int weight) {
			super();
			this.from = from;
			this.to = to;
			this.weight = weight;
		}

		@Override
		public int compareTo(Edge o) {
			return Integer.compare(this.weight, o.weight);
		}
	}

	static int N;
	static int parents[];
	static Edge[] edgeList;

	static void make() {
		parents = new int[N];
		for (int i = 0; i < N; i++) {
			parents[i] = i;
		}
	}

	static int find(int a) {
		if (a == parents[a])
			return a;

		return parents[a] = find(parents[a]);
	}

	static boolean union(int a, int b) {
		int aRoot = find(a);
		int bRoot = find(b);

		if (aRoot == bRoot)
			return false;

		parents[bRoot] = aRoot;
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int testcase = Integer.parseInt(br.readLine());
		for (int i = 0; i < testcase; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			int row = Integer.parseInt(st.nextToken());
			int col = Integer.parseInt(st.nextToken());

			// 총 서버 수: row * col개
			N = row * col;

			// 서버 간 통신망 수: 2 * row * col - row - col개
			edgeList = new Edge[2 * row * col - row - col];

			// edge와 server 번호를 지정하는 변수 생성
			int listIndex = 0, serverIndex = 0;

			for (int j = 0; j < row; j++) {
				st = new StringTokenizer(br.readLine(), " ");

				while (st.hasMoreTokens()) {
					// 좌우로 인접한 server간 비용 기록
					edgeList[listIndex++] = new Edge(serverIndex, ++serverIndex, Integer.parseInt(st.nextToken()));
				}

				// 다음 행으로 넘어갔으므로 번호 증가
				serverIndex++;
			}

			// server 번호를 지정할 변수
			int tempIndex = 0;
			for (int j = 0; j < row - 1; j++) {
				st = new StringTokenizer(br.readLine(), " ");

				while (st.hasMoreTokens()) {
					// 위아래로 인접한 server간 비용 기록
					edgeList[listIndex++] = new Edge(tempIndex, tempIndex + col, Integer.parseInt(st.nextToken()));
					// 다음 server를 가리킴
					tempIndex++;
				}
			}

			make();
			Arrays.sort(edgeList);

			int cnt = 0, res = 0;
			for (Edge e : edgeList) {
				if (union(e.from, e.to)) {
					res += e.weight;
					cnt++;
					if (cnt == N - 1)
						break;
				}
			}
			
			System.out.println(res);
		}
	}
}