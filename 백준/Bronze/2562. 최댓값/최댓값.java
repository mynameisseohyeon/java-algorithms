import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int index = 0;
        
        for(int i = 1; i <= 9; i++) {
            int num = Integer.parseInt(bf.readLine());
            
            if(num > max) {
                // 최댓값 교체
                max = num;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}