import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException { // 좌표 정렬하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2]; // x, y 좌표

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // x 좌표
            arr[i][1] = Integer.parseInt(st.nextToken()); // y 좌표
        }

        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr, (p1, p2) -> {
            if(p1[0] == p2[0]) {
                return p1[1] - p2[1]; // x 좌표가 같으면 y 좌표로 정렬
            } else {
                return p1[0] - p2[0]; // x 좌표로 정렬
            }
        });

        for(int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb.toString());
    }
}