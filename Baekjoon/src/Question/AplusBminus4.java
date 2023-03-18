package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class AplusBminus4 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input;
		
		while((input = br.readLine()) != null){
			StringTokenizer st = new StringTokenizer(input, " ");
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			sb.append(num1 + num2 + "\n");
		}
		System.out.print(sb);
		
	}
}
