import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        String input;
        
        // 입력이 없을 때까지 반복
        while((input = bf.readLine()) != null && !input.isEmpty()) {
            String[] arr = input.split(" ");
            
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            
            System.out.println(A + B);
        }
    }
}