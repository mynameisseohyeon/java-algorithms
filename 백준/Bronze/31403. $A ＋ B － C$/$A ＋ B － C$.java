import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(bf.readLine());
        int B = Integer.parseInt(bf.readLine());
        int C = Integer.parseInt(bf.readLine());
        
        System.out.println(A + B - C);
        
        String AB = A + "" + B;
        int numAB = Integer.parseInt(AB);
        System.out.println(numAB - C);
    }
    
}