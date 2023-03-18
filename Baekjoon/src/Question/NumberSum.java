package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NumberSum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Countnum = Integer.parseInt(br.readLine());
		int sum = 0;
		String NumberCollection = br.readLine();
		for (int i = 0; i < Countnum; i++) {
			int number = NumberCollection.charAt(i) - '0';
			sum = sum + number;

		}
		System.out.println(sum);
	}
}
