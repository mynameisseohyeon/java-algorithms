import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(bf.readLine());
        
        for(int i = 1; i <= num; i++) {
            String[] arr = bf.readLine().split(" ");
            
            // for문이 실행될 때 마다 arr배열의 0번째와 1번째 값 초기화 진행
            int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
            System.out.println(sum);
        }
    }
}