package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Average {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] subject = new int[num];
		int max = 0;
		double sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < subject.length; i++) {
			subject[i] = Integer.parseInt(st.nextToken());
			if ((subject[i] > max) || i == 0) {
				max = subject[i];
			}
		}
		for (int i = 0; i < subject.length; i++) {
			double adjustnum = (double) subject[i] / max * 100;
			sum += adjustnum;
		}
		System.out.println(sum / subject.length);
	}
}
