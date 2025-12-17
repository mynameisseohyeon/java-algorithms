import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            String[] arr = bf.readLine().split(" ");
            int num1 = Integer.parseInt(arr[0]);
            int num2 = Integer.parseInt(arr[1]);
           
            if(num1 == 0 && num2 == 0) {
                break;
            }
            System.out.println(num1 + num2);
        }
    }
}