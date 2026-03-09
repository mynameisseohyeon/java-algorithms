import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException { // 옥상 정원 꾸미기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<int[]> stack = new ArrayDeque<>(); // 빌딩의 높이
        long result = 0;

        for(int i = 0; i < n; i++) {
            // 빌딩의 높이 채우기
            int height = Integer.parseInt(br.readLine());

            // 스택이 비어있지 않고, 맨 위 빌딩이 현재 빌딩 높이보다 작거나 같을 경우
            while (!stack.isEmpty() && stack.peek()[1] <= height) {
                stack.pop();
            }

            result += stack.size();
            stack.push(new int[]{i, height});
        }
        System.out.println(result);
    }
}