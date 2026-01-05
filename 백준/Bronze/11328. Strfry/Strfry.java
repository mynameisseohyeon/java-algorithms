import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException{ // Strfry
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력받을 테스트 케이스 수
		int num = Integer.parseInt(br.readLine());

		
		for(int i = 0; i < num; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				String str1 = st.nextToken();
				String str2 = st.nextToken();
				
				// 알파벳
				int[] arr = new int[26];
				
				for(int j = 0; j < str1.length(); j++) {
					int index = str1.charAt(j) - 'a';
					arr[index]++;
				}
				
				for(int k = 0; k < str2.length(); k++) {
					int index = str2.charAt(k) - 'a';
					arr[index]--;
				}
				
				boolean isPossible = true; // 가능하다고 가정

				for(int j = 0; j < 26; j++) { // 사용된 알파벳이 종류 및 개수가 동일할 경우
					if(arr[j] != 0) { // 0이 아니라는 건 개수가 안 맞다는 뜻
						isPossible = false; // 불가능으로 변경
						break;
					}
				}
				
				if(isPossible) {
					System.out.println("Possible");
				} else {
					System.out.println("Impossible");
				}
		}
	}
}