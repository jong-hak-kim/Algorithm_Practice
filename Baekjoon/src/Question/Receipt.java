package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Receipt {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		int num2 = 0;
		int sum = 0;
		String str = br.readLine();
		String str2 = br.readLine();
		int total = Integer.parseInt(str);
		int thing = Integer.parseInt(str2);
		for (int i = 0; i < thing; i++) {
			String str3 = br.readLine();
			StringTokenizer to = new StringTokenizer(str3, " ");
			num = Integer.parseInt(to.nextToken());
			num2 = Integer.parseInt(to.nextToken());
			sum += num * num2;
		}
		if (total == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
