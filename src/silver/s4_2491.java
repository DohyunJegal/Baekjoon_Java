package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class s4_2491 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int biggest = 0, smallest = 0;
		
		// 주어진 수열
		int[] lst = new int[N];
		// 연속해서 커지는 수열 크기
		int[] bigger = new int[N];
		// 연속해서 작아지는 수열 크기
		int[] smaller = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			// 주어진 수열 입력
			lst[i] = Integer.parseInt(st.nextToken());
			// 두 수열 1로 초기화
			bigger[i] = 1;
			smaller[i] = 1;
		}
		
		for (int i = 1; i < N; i++) {
			if (lst[i] >= lst[i-1]) {
				// 만약 이전 수보다 크거나 같은 경우, 이전 수열 크기 + 1 하거나 유지
				bigger[i] = Math.max(bigger[i-1] + 1, bigger[i]);
			}
			if (lst[i] <= lst[i-1]) {
				// 만약 이전 수보다 작거나 같은 경우, 이전 수열 크기 + 1 or 유지
				smaller[i] = Math.max(smaller[i-1] + 1, smaller[i]);
			}
		}
		
		for (int i = 0; i < N; i++) {
			biggest = Math.max(biggest, bigger[i]);
			smallest = Math.max(smallest, smaller[i]);
		}
		System.out.println(Math.max(biggest, smallest));
	}
}