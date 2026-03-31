import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException { // 큐
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<String> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("push")) {
                queue.offer(st.nextToken());
            } else if(command.equals("pop")) {
                if(queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
            } else if(command.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if(command.equals("empty")) {
                if(queue.isEmpty()) { // 비어 있을 경우
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            } else if(command.equals("front")) {
                if(queue.isEmpty()) {
                    sb.append("-1\n");
                } else { // 가장 앞에 있는 정수 출력
                    sb.append(queue.peek()).append("\n");
                }
            } else if(command.equals("back")) {
                if(queue.isEmpty()) {
                    sb.append("-1\n");
                } else { // 가장 뒤에 있는 정수 출력
                    sb.append(queue.peekLast()).append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}