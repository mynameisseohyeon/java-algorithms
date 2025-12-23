import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
    
        int H = Integer.parseInt(st.nextToken()); // 시
        int M = Integer.parseInt(st.nextToken()); // 분
    
        int totalMin = ((H * 60) + M) - 45;
        
        if(totalMin < 0) { // 결과가 음수일 경우 하루(24시간 = 1440분)더하기
            totalMin = totalMin + 1440;
        }
        
        int hour = totalMin / 60;
        int minutes = totalMin % 60;
        
        System.out.println(hour + " " + minutes);
        
    
    
    }  
}