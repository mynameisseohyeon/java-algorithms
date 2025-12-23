import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());
        
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
                int H = Integer.parseInt(st.nextToken()); // 층 수H 
                int W = Integer.parseInt(st.nextToken()); // W호까지 존재
                int N = Integer.parseInt(st.nextToken()); // N번째 손님
                
                int floor; // 층수 (y)
                int room; // 호수 (xx)
                
                if(N % H == 0) { // 꼭대기 층일 경우 (N이 H의 배수일 때)
                    floor = H;
                    room = N / H;
                } else { // 꼭대기 층이 아닐 경우 (일반적)
                    floor = N % H;
                    room = (N / H) + 1;
                }

                System.out.println(floor * 100 + room);
            }

    }    
}