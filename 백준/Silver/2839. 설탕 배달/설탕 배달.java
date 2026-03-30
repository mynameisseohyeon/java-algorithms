import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException { // 설탕 배달
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 배달해야 할 설탕 무게(kg)
        int count = 0; // 봉지 개수

        while(true) {
            if(N % 5 == 0) {
                count += N / 5;
                System.out.println(count);
                break;
            } else if(N < 0) {
                System.out.println("-1");
                break;
            }
            N -= 3;
            count++;
        }
    }
}