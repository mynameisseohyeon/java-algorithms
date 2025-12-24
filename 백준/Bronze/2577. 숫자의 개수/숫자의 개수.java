import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(bf.readLine());
        int B = Integer.parseInt(bf.readLine());
        int C = Integer.parseInt(bf.readLine());
        
        int multiResult = A * B * C;
        
        String strResult = String.valueOf(multiResult);
        
        for(int i = 0; i <= 9; i++) {
            int count = 0;
            
            for (int j = 0; j < strResult.length(); j++) {
                if((strResult.charAt(j) - '0') == i) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
    }
}