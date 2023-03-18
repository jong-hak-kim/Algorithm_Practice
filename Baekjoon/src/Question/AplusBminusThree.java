package Question;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class AplusBminusThree {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String num1 = br.readLine();
		int num = Integer.parseInt(num1);
		for (int i = 0; i < num; i++) {
			String num2 = br.readLine();
			StringTokenizer to = new StringTokenizer(num2, " ");
			int A = Integer.parseInt(to.nextToken());
			int B = Integer.parseInt(to.nextToken());
			if (i == num) {
				sb.append(A + B);
			} else {
				sb.append(A + B + "\n");
			}
		}
		System.out.println(sb.toString());
	}
}
