import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Deque<int[]> stack = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= N; i++) {
            int height = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty() && stack.peek()[0] < height) {
                // 작거나 같은 값의 경우 제거
                stack.pop();
            }

            if(stack.isEmpty()) {
                sb.append(0).append(" ");
            }else { // 스택의 맨 위(맨 왼쪽 큰 값)의 인덱스
                sb.append(stack.peek()[1]).append(" ");
            }
            stack.push(new int[]{height, i});
        }

        // 양 옆 공백 제거 후 출력
        System.out.println(sb.toString().trim());
    }
}