package Question;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Multiple {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer to = new StringTokenizer(str, " ");
		int num = Integer.parseInt(to.nextToken());
		for (int i = 0; i < 9; i++) {
			int num2 = i + 1;
			System.out.println(num + " * " + num2 + " = " + num * num2);
		}

	}

}
