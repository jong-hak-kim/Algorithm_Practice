package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Sum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer to = new StringTokenizer(str);
		int sum = 0;
		int num = Integer.parseInt(to.nextToken());
		for (int i = 0; i < num; i++) {
			int num2 = i + 1;
			sum += num2;
		}
		System.out.println(sum);
	}

}
