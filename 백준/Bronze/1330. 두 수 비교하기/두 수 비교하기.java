import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        String result = "";
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        if(A < B) {
            result = "<";
        } else if(A > B) {
            result = ">";
        } else if(A == B) {
            result = "==";
        }
        
        System.out.println(result);
        
    }
}