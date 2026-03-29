import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException { // 카드2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            queue.offer(i + 1);
        }

        while(queue.size() > 1) {// 카드가 하나 남을 때까지 반복
            queue.poll(); // 맨 위의 카드 버리기
            int card = queue.poll(); // 맨 위의 카드 꺼내기
            queue.offer(card); // 맨 위의 카드를 꺼내어 맨 뒤로 이동
        }

        System.out.println(queue.peek()); // 남은 카드 출력
    }
}