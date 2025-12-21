import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(bf.readLine());
        String num = bf.readLine();
        int sum = 0;
            
        for(int i = 0; i < A; i++) {
            // '0'(아스키코드 48)을 빼주면 실제 숫자 정수 값이 됨
            sum += num.charAt(i) - '0';
        } 
        System.out.println(sum);
        
    } 
}