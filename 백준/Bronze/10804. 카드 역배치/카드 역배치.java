import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int[] cards = new int[21];
        
        for(int i = 1; i <= 20; i++) {
            cards[i] = i;
        }
        
        //시작위치 a, 끝위치 b
        for(int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int start = Integer.parseInt(st.nextToken()); //a
            int end = Integer.parseInt(st.nextToken()); //b
            
            // a위치부터 b위치까지 역순 배치
            while (start < end) { // start와 end의 위치 교환은 일어나도 주소는 그대로
                // temp를 이용해 cards[start]와 cards[end]를 교환 (위치 변경)
                int temp = cards[start];
                cards[start] = cards[end];
                cards[end] = temp;
                
                start++; // 시작점은 오른쪽으로 한 칸
                end--; // 끝점은 왼쪽으로 한 칸
            }
        }
        
        for(int i = 1; i <= 20; i++) {
            System.out.print(cards[i] + " ");
        }
    }
}