import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] ans = new int[N]; // 정답 출력
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 오큰수를 찾이 못해 대기중인 인덱스 보관
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < N; i++) {
            // 스택이 비어있지 않고, 현재 숫자가 스택 맨 위의 숫자보다 큰 경우
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                // 오큰수 저장
                ans[stack.pop()] = arr[i];
            }
            // 현재 실행되고 있는 수보다 작은 수를 stack에 push
            stack.push(i);
        }

        while(!stack.isEmpty()) { // 오른쪽에서 큰 숫자를 못 만났을 경우
            ans[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(ans[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}