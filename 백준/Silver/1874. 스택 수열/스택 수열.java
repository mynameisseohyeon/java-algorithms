import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new LinkedList<>();
        int start = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num > start) {
                // 넣어야 할 숫자가 스택에 들어간 적이 없을 경우
                for(int j = start + 1; j <= num; j++) {
                    stack.push(j);
                    sb.append('+').append('\n');
                }
                start = num;
            }

            if(stack.peek() != num) {
                // 스택 맨 위에 있는 숫자가 꺼내려는 숫자가 아닐 경우
                System.out.println("NO");
                return;
            }

            // 일치할 경우
            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);
    }
}