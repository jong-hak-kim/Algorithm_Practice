package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Final {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

		System.out.println(A > B ? A : B);
//		String[] num = new String[st.countTokens()];
//		String[] changenum = new String[st.countTokens()];
//		for (int i = 0; i < num.length; i++) {
//			num[i] = st.nextToken();
//			changenum[i] = "";
//			for (int j = num[i].length() - 1; j > -1; j--) {
//				changenum[i] += num[i].charAt(j);
//			}
//		}
//		int A = Integer.parseInt(changenum[0]);
//		int B = Integer.parseInt(changenum[1]);
//		if (A > B) {
//			System.out.println(A);
//		} else {
//			System.out.println(B);
//		}

	}
}
