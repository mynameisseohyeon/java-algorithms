import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException{ // 애너그램 만들기 (1919)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int[] alpha = new int[26];
		int result = 0;
		
		// 두 단어가 서로 애너그램 관계에 있도록 만들기 위해서 제거해야 하는 최소한의 문자의 개수
		
		for(int i = 0; i < str1.length(); i++) { // 첫 번째 문자열 개수 더하기
				int index = str1.charAt(i) - 'a';
				alpha[index]++;
		}
		
		for(int i = 0; i < str2.length(); i++) { // 두 번째 문자열 개수 뺴기
				int index = str2.charAt(i) - 'a';
				alpha[index]--;
		}
		
		for(int i = 0; i < 26; i++) {
			if(alpha[i] != 0) { // 0이 아닐 경우 절댓값 만큼 더하기
				result += Math.abs(alpha[i]);
			}
		}
		
		System.out.println(result);
		
	}
}