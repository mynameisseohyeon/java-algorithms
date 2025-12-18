import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        
        char A = input.charAt(0);
        
        int asc = (int) A;
        System.out.println(asc);
    }
}