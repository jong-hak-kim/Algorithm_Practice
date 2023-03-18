package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Star2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int num = Integer.parseInt(str);
		int k = 0;
		for (int i = 0; i < num; i++) {
			int num2 = i + 1;
			for (int j = 0; j < num - num2; j++) {
				sb.append(" ");
			}
			for (k = 0; k < num2; k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

}
