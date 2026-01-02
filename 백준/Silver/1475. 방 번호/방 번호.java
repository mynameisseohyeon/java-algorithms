import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException{ // 방번호(1475)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
        String str = String.valueOf(N);

        
        int[] arrNum = new int[10];
        
        for(int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0'; // 숫자 -> 문자
            arrNum[digit]++;
        }
        
        // 숫자 6과 9는 뒤집어서 사용 가능
        int sum = arrNum[6] + arrNum[9];
        arrNum[6] = (sum + 1) / 2;
        arrNum[9] = 0;
        
        // 구매해야 할 숫자 세트의 최댓값 찾기
        int max = 0;
        for(int i = 0; i < 10; i++) {
            if(arrNum[i] > max) {
                max = arrNum[i];
            }
        }
        
        System.out.println(max);
    }
}