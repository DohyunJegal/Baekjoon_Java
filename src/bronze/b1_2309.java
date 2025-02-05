package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class b1_2309 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> res = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		int[] dwarf = new int[9];
		int tmp = 0;
		
		for (int i = 0; i < 9; i++) {
			dwarf[i] = Integer.parseInt(br.readLine());
		}
		
		// 9명의 난쟁이 중 제외될 2명의 난쟁이 선택
		for (int j = 0; j < 8; j++) {
			for (int k = j+1; k < 9; k++) {
				// 임시 값 초기화
				tmp = 0;
				res.clear();
				
				// 7명의 난쟁이 합을 구하면서 배열에 저장
				for (int l = 0; l < 9; l++) {
					if (l != j && l != k) {
						tmp += dwarf[l];
						res.add(dwarf[l]);
					}
				}
				
				// 만약 7명의 난쟁이 합이 100이라면 배열을 정렬 후 값 출력
				if (tmp == 100) {
					Collections.sort(res);
					for (int m : res) {
						sb.append(m).append("\n");
					}
					System.out.println(sb);
					return;
				}
			}
		}
	}
}