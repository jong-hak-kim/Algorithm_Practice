package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Star1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int num = Integer.parseInt(str);
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < (i + 1); j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

}
