package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class AplusBminus7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int A = 0;
		int B = 0;
		int num2 = 0;
		String str = br.readLine();
		int num = Integer.parseInt(str);
		for (int i = 0; i < num; i++) {
			num2 = i + 1;
			String str2 = br.readLine();
			StringTokenizer to = new StringTokenizer(str2, " ");
			A = Integer.parseInt(to.nextToken());
			B = Integer.parseInt(to.nextToken());
			if (num2 == num) {
				sb.append("Case #" + num2 + ": " + (A + B));
			} else {
				sb.append("Case #" + num2 + ": " + (A + B) + "\n");
			}
		}
		System.out.println(sb.toString());
	}

}
