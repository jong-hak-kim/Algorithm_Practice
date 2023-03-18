package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Highnum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[9];
		int max = 0;
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(br.readLine());
			if (num[i] > max || (i == 0)) {
				max = num[i];
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] == max) {
				count = i + 1;
			}
		}
		System.out.println(max + "\n" + count);
	}
}
