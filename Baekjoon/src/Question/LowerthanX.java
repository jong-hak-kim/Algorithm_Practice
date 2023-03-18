package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class LowerthanX {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt(st.nextToken());
			if (A[i] < X) {
				if (i == (A.length - 1)) {
					System.out.print(A[i]);
				} else {
					System.out.print(A[i] + " ");
				}
			}
		}
	}
}
