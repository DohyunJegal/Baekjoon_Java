package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b2_2605 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int s = Integer.parseInt(br.readLine());
		int[] studentNumbers = new int[s];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < s; i++) {
			studentNumbers[i] = Integer.parseInt(st.nextToken());
		}
		
		ArrayList<Integer> lst = new ArrayList<>();
		for (int j = 1; j <= s; j++) {
			int lstSize = lst.size();
			int number = studentNumbers[j-1];
			if (number == 0) {				
				// 학생의 번호가 0이면 단순히 저장
				lst.add(j);
			} else {
				// 번호가 0이 아니라면 해당 수 만큼 뒤에서 끼워넣기
				lst.add(lstSize-number, j);
			}
		}

		for (int k : lst) {
			sb.append(k).append(" ");
		}
		System.out.println(sb);
	}
}
