package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FindAlphabet {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String words = br.readLine();
		int wordnum = 'z' - 'a' + 1;
		int result = 0;
		char[] word = new char[words.length()];
		for (int i = 0; i < word.length; i++) {
			word[i] = words.charAt(i);
		}
		for (int i = 0; i < wordnum; i++) {
			for (int j = 0; j < word.length; j++) {
				if (('a' + i) == word[j]) {
					result = j;
					break;
				} else {
					result = -1;
				}
			}
			if (i == 0) {
				System.out.print(result);
			} else {
				System.out.print(" " + result);
			}

		}
	}
}
