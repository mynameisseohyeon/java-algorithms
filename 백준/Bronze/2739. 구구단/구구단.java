import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(bf.readLine());
        
        for(int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i );
        }
        
    }
}