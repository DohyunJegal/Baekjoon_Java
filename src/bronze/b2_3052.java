package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class b2_3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> hashmap = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			int tmp = Integer.parseInt(br.readLine())%42;
			hashmap.put(Integer.toString(tmp), tmp);
		}
		System.out.println(hashmap.size());
	}
}