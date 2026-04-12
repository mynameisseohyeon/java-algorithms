import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException { // 큐 2
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<String> queue = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push" :
                    queue.offer(st.nextToken());
                    break;
                case "pop" :
                    if(!queue.isEmpty()){
                        sb.append(queue.poll()).append("\n");
                    } else {
                        sb.append("-1\n");
                    }
                    break;
                case "size" :
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty" :
                    if(queue.isEmpty()){
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case "front" :
                    if(!queue.isEmpty()){
                        sb.append(queue.peekFirst()).append("\n");
                    } else {
                        sb.append("-1\n");
                    }
                    break;
                case "back" :
                    if(!queue.isEmpty()){
                        sb.append(queue.peekLast()).append("\n");
                    } else {
                        sb.append("-1\n");
                    }
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}