import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{ // AC
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            boolean isReversed  = false; // 정방향 설정
            boolean isError = false; // 에러 발생 여부
            Deque<String> deque = new ArrayDeque<>();

            String command  =br.readLine();
            int M = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");

            for (int j = 0; j < M; j++) {
                deque.offer(st.nextToken());
            }

            for(int j = 0; j < command.length(); j++) {
                char cmd = command.charAt(j);

                if (cmd == 'R') { // 방향 전환
                    isReversed = !isReversed;
                } else if (cmd == 'D') {

                    if (deque.isEmpty()) {
                        isError = true;
                        break;
                    }

                    if (isReversed) { // 역방향일 경우
                        deque.pollLast(); // 가장 뒤에 있는 수 제거
                    } else { // 정방향일 경우
                        deque.pollFirst();
                    }
                }
            }

            if (isError) {
                sb.append("error\n");
            } else {
                if (isReversed == false) { // 정방향일 경우
                    sb.append("[");
                    while (!deque.isEmpty()) {
                        sb.append(deque.pollFirst());
                        if (!deque.isEmpty()) { // 마지막 수가 아닐 경우
                            sb.append(",");
                        }
                    }
                    sb.append("]\n");
                } else if (isReversed == true) { // 역방향일 경우
                    sb.append("[");
                    while (!deque.isEmpty()) {
                        sb.append(deque.pollLast());
                        if (!deque.isEmpty()) { // 마지막 수가 아닐 경우
                            sb.append(",");
                        }
                    }
                    sb.append("]\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}