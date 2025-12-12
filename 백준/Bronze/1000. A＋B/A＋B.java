import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 한 줄 통째로 읽기
        String str = br.readLine();
        
        // 공백을 기준으로 나눔
        StringTokenizer st = new StringTokenizer(str, " ");
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        System.out.println(A + B);
    }
    
    
}