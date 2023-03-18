package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Dial {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = br.readLine();
		String[] Alphabet = { "", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
		int time = 0;
		for (int i = 0; i < inputString.length(); i++) {
			inputString.charAt(i);
			for (int j = 0; j < Alphabet.length; j++) {
				for (int k = 0; k < Alphabet[j].length(); k++) {
					if (inputString.charAt(i) == Alphabet[j].charAt(k)) {
						time += (j + 1);
					}
				}
			}
		}
		System.out.println(time);

	}
}
