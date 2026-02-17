import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{ // 제로
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new LinkedList<>();

        for(int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) { // 0일 경우 가장 최근에 작성된 수 삭제
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        
        long sum = 0;
        for(int val : stack) {
            sum += val;
        }
        
        System.out.println(sum);
    }
}