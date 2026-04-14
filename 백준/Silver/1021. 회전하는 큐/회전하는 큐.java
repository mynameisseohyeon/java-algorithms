import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException { // 회전하는 큐
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 큐의 크기
        int M = Integer.parseInt(st.nextToken()); // 뽑아내려고 하는 수의 개수
        LinkedList<Integer> deque = new LinkedList<>();
        int count = 0; // 회전 횟수

        for(int i = 1; i <= N; i++) {
           deque.offer(i);
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());

            int targetIndex = deque.indexOf(num); // 찾으려는 수의 인덱스
            int halfSize = deque.size() / 2; // 큐의 절반 크기

            if (targetIndex == 0) { // 큐의 맨 앞이 찾으려는 수인 경우
                deque.pollFirst(); // 큐에서 제거
            } else {
                if (targetIndex <= halfSize) { // 찾으려는 수가 큐의 앞쪽에 있는 경우
                    while (deque.peekFirst() != num) { // 큐의 맨 앞이 찾으려는 수가 될 때까지
                        deque.offerLast(deque.pollFirst()); // 왼쪽 회전
                        count++; // 회전 횟수 증가
                    }
                } else { // 찾으려는 수가 큐의 뒤쪽에 있는 경우
                    while (deque.peekFirst() != num) {
                        deque.offerFirst(deque.pollLast()); // 오른쪽 회전
                        count++;
                    }
                }
                deque.pollFirst();
            }
        }
        System.out.println(count);

    }
}