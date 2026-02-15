import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new LinkedList<>();

        for(int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            switch (a) {
                case "push" : // 스택에 넣기
                    int b = Integer.parseInt(st.nextToken());
                    stack.push(b);
                    break;
                case "pop" : // 스택에서 가장 위에 있는 정수를 빼고 그 수 출력
                    if(stack.isEmpty()) { // 스택에 들어가 있는 정수가 없을 경우
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;
                case "size" : // 스택에 들어있는 정수의 개수 출력
                    System.out.println(stack.size());
                    break;
                case "empty" : // 스택이 비어있으면 1, 아니면 0
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
                case "top" :
                    if(stack.isEmpty()) { // 스택에 들어가 있는 정수가 없을 경우
                        System.out.println(-1);
                    } else { // 스택 가장 위에 있는 정수 출력
                        System.out.println(stack.peek());
                    }
                    break;
            }
        }
    }
}