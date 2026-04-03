import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException { // 프린터 큐
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken()); // 문서의 개수
            int M = Integer.parseInt(st.nextToken()); // 몇 번째로 인쇄되었는지 궁금한 문서의 위치
            int count = 0; // 인쇄된 문서의 개수

            LinkedList<Integer> priorities = new LinkedList<>(); // 중요도 저장
            LinkedList<Integer> indexes = new LinkedList<>(); // 위치 저장

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < num; j++) {
                priorities.offer(Integer.parseInt(st.nextToken()));
                indexes.offer(j);
            }

            while(!priorities.isEmpty()) {
                // 현재 대기열에서 가장 높은 중요도 찾기
                int max = Collections.max(priorities);

                // 대기열 맨 앞사람 대기열로
                int curPriority = priorities.poll();
                int curIndex = indexes.poll();

                if(curPriority == max){ // 현재 중요도가 가장 높은 경우
                    count++;
                    if(curIndex == M){ // 궁금한 문서가 인쇄된 경우
                        sb.append(count).append("\n");
                        break;
                    }
                } else { // 현재 중요도가 가장 높은 것이 아닌 경우
                    priorities.offer(curPriority); // 대기열 맨 뒤로
                    indexes.offer(curIndex);
                }
            }
        }

        System.out.println(sb.toString());
    }
}