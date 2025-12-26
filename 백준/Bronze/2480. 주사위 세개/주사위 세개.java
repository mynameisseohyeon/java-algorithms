import java.io.*;
import java.util.*;

public class Main{ // 주사위 세 개	
	public static void main(String[] args)throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int coin = 0;
		int sameValue = 0;
        int max = Math.max(Math.max(A, B), C);
        
        if(A == B && B == C) {
			coin = 10000 + (A * 1000);
			System.out.println(coin);
		} else if(A == B || A == C || B == C) {
			if (A == B || A == C) {
		    sameValue = A; 
			} else if (B == C) {
		    sameValue = B;
	    }
  		coin = 1000 + (sameValue * 100);
			System.out.println(coin);

		} else {
			coin = max * 100;
			System.out.println(coin);
		}
	}
}   