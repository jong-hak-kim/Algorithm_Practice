package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StringFirstLast {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		for (int index = 0; index < test; index++) {
			String words = br.readLine();
			System.out.println("" + words.charAt(0) + words.charAt(words.length() - 1));
		}
	}
}
