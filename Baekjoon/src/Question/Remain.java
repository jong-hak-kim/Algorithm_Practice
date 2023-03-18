package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.io.IOException;

public class Remain {
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int[] num = new int[10];
//		HashSet<Integer> set = new HashSet<>();
//		for (int i = 0; i < num.length; i++) {
//			int A = Integer.parseInt(br.readLine());
//			num[i] = A % 42;
//			set.add(num[i]);
//		}
//		System.out.println(set.size());

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[10];
		int count = 0;
		boolean flag;
		for (int i = 0; i < num.length; i++) {
			int A = Integer.parseInt(br.readLine());
			num[i] = A % 42;
		}
		for (int i = 0; i < num.length; i++) {
			flag = false;
			for (int j = i + 1; j < num.length; j++) {
				if(num[i] == num[j]) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				count++;
			}
		}
		System.out.println(count);

	}
}
