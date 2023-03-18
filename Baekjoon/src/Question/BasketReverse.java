package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BasketReverse {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int j = 0;
		int k = 0;
		int[] Basket = new int[N];
		for (int i = 0; i < Basket.length; i++) {
			Basket[i] = i + 1;
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			j = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			j -= 1;
			k -= 1;
			for (int l = j; l < k; l++) {
				int temp = Basket[l];
				Basket[l] = Basket[k];
				Basket[k] = temp;
				k--;
			}
		}
		for (int i = 0; i < Basket.length; i++) {
			if (i == Basket.length) {
				System.out.print(Basket[i]);
			}
			System.out.print(Basket[i] + " ");
		}

	}
}
