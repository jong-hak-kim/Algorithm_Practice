package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PlusCycle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		int num2 = num;
		int sum = 0;
		int count = 0;
		// 68 80 + 4
		num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
		do {
			if (num < 10) {
				sb.append("0").append(num);
			} else {
				sb.append(num);
			}
			sum = (Integer.parseInt(sb.substring(0, 1))) + (Integer.parseInt(sb.substring(1, 2)));
			if (sum < 10) {
				sb2.append("0").append(sum);
			} else {
				sb2.append(sum);
			}
			num = Integer.parseInt(sb.substring(1, 2) + sb2.substring(1, 2));
			sb.setLength(0);
			sb2.setLength(0);
			count += 1;
		} while (num2 != num);

		//다른 풀이
//		do {
//			num = ((num % 10) * 10) + (((num/10) + (num % 10)) % 10);
//			count += 1;
//		}while(num2 != num);
		System.out.println(count);
	}
}
