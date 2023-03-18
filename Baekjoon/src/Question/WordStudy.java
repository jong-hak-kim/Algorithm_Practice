package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class WordStudy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String words = br.readLine();
		char[] alphabet = new char[26]; // 알파벳 나온 개수가 담길 배열
		for (int i = 0; i < words.length(); i++) {
			if ('A' <= words.charAt(i) && words.charAt(i) <= 'Z') { // 대문자일 경우
				alphabet[words.charAt(i) - 'A']++;
			}

			else { // 소문자일 경우
				alphabet[words.charAt(i) - 'a']++;
			}
		}
		int max = 0;
		char maxalphabet = 0;
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] > max || i == 0) {
				max = alphabet[i];
				maxalphabet = (char) (i + 'A');
			} else if (alphabet[i] == max) {
				maxalphabet = '?';
			}
		}
		System.out.println(maxalphabet);

	}
}
