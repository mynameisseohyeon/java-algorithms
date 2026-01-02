import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException{ // 두 수의 합 (3273)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()); // 수열의 크기
		
		StringTokenizer st = new StringTokenizer(br.readLine());
				// 문자열 쪼개기
		int[] arr = new int[N]; // n의 개수만큼 배열 생성
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int x = Integer.parseInt(br.readLine()); 
		int result = 0;
				
		// 투 포인터 알고리즘 - 왼쪽 끝과 오른쪽 끝 두 개를 사용해서 합 확인
		Arrays.sort(arr);
		
		int left = 0;
		int right = N - 1;

		while(left < right) {
			int sum = arr[right] + arr[left];
					
			if (sum == x) {
				result += 1;
				left++;
				right--;
			} else if(sum < x) {
				left++;
			} else if(sum > x) {
				right--;
			}

		}
		
		System.out.println(result);
		
	}
}