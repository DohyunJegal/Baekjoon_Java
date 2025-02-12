package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class s2_28066 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int selected, res = 0;
		
		ArrayDeque<Integer> q = new ArrayDeque<>();
		for (int i = 1; i <= N; i++) q.addLast(i);
		
		while(q.size() > 1) {
			selected = q.removeFirst();
			if (q.size() <= K-1) {
				res = selected;
				break;
			}
			
			for (int i = 0; i < K-1; i++) q.removeFirst();
			
			q.addLast(selected);
		}
		
		System.out.println(res);
	}
}