import java.io.*;
import java.util.*;

public class Main{ // 숫자 (10093번)
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        // 1 ≤ A, B ≤ 10^15 (Long타입 사용)
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        
        if(A > B) { // 무조건 B가 크도록 Swap
            long temp = A;
            A = B;
            B = temp;
        }
        
        if(A == B) {
            System.out.println(0);
            return; // 프로그램 종료
        }
        
        long count = B - A - 1; // 사이의 개수이므로 -1
        System.out.println(count);
        
        for(long i = A + 1; i < B; i++) {
            System.out.print(i + " ");
        }

    }
}