package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Count {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int countint = 0;
		int findnum = 0;
		int[] num = new int[count];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < count; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}

		findnum = Integer.parseInt(br.readLine());

		for (int i = 0; i < num.length; i++) {
			if (num[i] == findnum) {
				countint++;
			}
		}

		System.out.println(countint);

	}
}
