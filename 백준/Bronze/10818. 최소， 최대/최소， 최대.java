import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(bf.readLine());
        String[] arr = bf.readLine().split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        
        for(int i = 0; i < num; i++) {
            int currentNum = Integer.parseInt(arr[i]);
            
            if(min > currentNum) {
                min = currentNum;
            } else if(max < currentNum) {
                max = currentNum;
            }
        }
            System.out.println(min + " " + max);
    }
}