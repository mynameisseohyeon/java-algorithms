import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(bf.readLine());
        
        for(int i = num - 1; i >= 0; i--) {
            System.out.println(" ".repeat(i) + "*".repeat(num - i));
        }
        
    }
    
}