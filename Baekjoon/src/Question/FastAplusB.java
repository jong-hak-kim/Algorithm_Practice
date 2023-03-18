package Question;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
public class FastAplusB {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		for(int i = 0; i < num; i++) {
			String str2 = br.readLine();
			StringTokenizer to = new StringTokenizer(str2," ");
			int A = Integer.parseInt(to.nextToken());
			int B = Integer.parseInt(to.nextToken());
			if(num == (i - 1)) {
				bw.write(A + B);
			} else {
				bw.write(A + B + "\n");
			}
		}
		bw.flush();
		bw.close();
		
	}

}
