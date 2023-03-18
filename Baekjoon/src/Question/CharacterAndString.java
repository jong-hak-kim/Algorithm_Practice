package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CharacterAndString {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		String string = bufferedreader.readLine();
		int num = Integer.parseInt(bufferedreader.readLine()) - 1;
		System.out.println(string.subSequence(num, num + 1));
	}
}
