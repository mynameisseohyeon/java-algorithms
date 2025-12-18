import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        String A = bf.readLine();
        int num = Integer.parseInt(bf.readLine());
        
        System.out.println(A.charAt(num - 1));
    }
}