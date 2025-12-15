import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        int sum = 0;
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            sum += num * num;
        }
        System.out.println(sum % 10);
    }
}