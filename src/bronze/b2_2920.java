package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2_2920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int buff = Integer.parseInt(arr[0]), asc = 0, desc = 0, tmp;
		
		for (String s : arr) {
			tmp = Integer.parseInt(s);
			if (tmp > buff) asc++;
			else if (tmp < buff) desc++;
			buff = tmp;
		}
		
		if (asc == 7 && desc == 0) System.out.println("ascending");
		else if (desc == 7 && asc == 0) System.out.println("descending");
		else System.out.println("mixed");
	}
}
