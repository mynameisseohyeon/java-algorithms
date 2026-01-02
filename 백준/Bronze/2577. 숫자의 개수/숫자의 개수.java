import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException{ // 숫자의 개수(2577)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int multi = A * B * C;
		String str = String.valueOf(multi);
		
		int[] arrNum = new int[10];
		
		for(int i = 0; i < str.length(); i++) {
			int digit = str.charAt(i) - '0'; // 문자 -> 숫자
			arrNum[digit]++;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(arrNum[i]);
		}
	}
}