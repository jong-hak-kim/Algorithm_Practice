package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class HighnumLownum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[N];
		int max = 0;
		int min = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			if (num[i] > max || i == 0) {
				max = num[i];
			}
			if (num[i] < min || i == 0) {
				min = num[i];
			}
		}
		System.out.println(min + " " + max);
	}
}
