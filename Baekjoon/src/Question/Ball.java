package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ball {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] num = new int[N];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			for (int num2 = (j - 1); num2 < k; num2++) {
				num[num2] = l;
			}
		}

		for (int i = 0; i < num.length; i++) {
			if ((i - 1) == num.length) {
				System.out.print(num[i]);
			}
			System.out.print(num[i] + " ");

		}

	}
}
