package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BallChange {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] basket = new int[N];
		for (int i = 0; i < basket.length; i++) {
			basket[i] = i + 1;
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int temp = basket[j - 1];
			basket[j - 1] = basket[k - 1];
			basket[k - 1] = temp;
		}

		for (int i = 0; i < basket.length; i++) {
			if (i == (basket.length - 1)) {
				System.out.print(basket[i]);
			} else {
				System.out.print(basket[i] + " ");
			}
		}
	}
}
