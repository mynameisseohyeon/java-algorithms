import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException { // 덱
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<String> deque = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "push_front" : // 맨 앞에 수 추가
                    deque.offerFirst(st.nextToken());
                    break;
                case "push_back" : // 맨 뒤에 수 추가
                    deque.offerLast(st.nextToken());
                    break;
                case "pop_front" :
                    if(deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else { // 맨 앞에 있는 수 제거
                        sb.append(Integer.parseInt(deque.pollFirst())).append("\n");
                    }
                    break;
                case "pop_back" :
                    if(deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else { // 맨 뒤에 있는 수 제거
                        sb.append(Integer.parseInt(deque.pollLast())).append("\n");
                    }
                    break;
                case "size" :
                    sb.append(Integer.parseInt(String.valueOf(deque.size()))).append("\n");
                    break;
                case "empty" :
                    if(deque.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front" :
                    if(deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(Integer.parseInt(deque.peekFirst())).append("\n");
                    }
                    break;
                case "back" :
                    if(deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(Integer.parseInt(deque.peekLast())).append("\n");
                    }
                    break;
            }

        }

        System.out.println(sb.toString());
    }
}