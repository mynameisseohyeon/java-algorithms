import java.io.*;
import java.util.*;

public class Main{ // 일곱 난쟁이 : 브루트 포스
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int[] stature = new int[9]; // 아홉 난쟁이의 키
        int sum = 0;
        
        for(int i = 0; i < 9; i++) {
            stature[i] = Integer.parseInt(bf.readLine());
            sum += stature[i];
        }
        
        // 가짜 난쟁이 찾기
        boolean found = false;
        
        for(int j = 0; j < 8; j++) {
            for(int k = 1; k < 9; k++) {
                // 가짜 두 명의 합 == 전체 합 - 100
                if(stature[j] + stature[k] == sum - 100) { 
                    stature[j] = 0;
                    stature[k] = 0;
                    found = true; // 가짜 난쟁이를 찾았다고 표시
                    break;
                }
            }
            if(found) break;
        }
        
        Arrays.sort(stature);

        for(int i = 0; i < 9; i++) {
            if(stature[i] != 0) {
                System.out.println(stature[i]);
            }
        }
        
    }
}