import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException { // 나이순 정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2]; // 나이, 이름

        for(int i = 0; i < N; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken(); // 나이
            arr[i][1] = st.nextToken(); // 이름
        }

        Arrays.sort(arr, (p1, p2) -> {
            return Integer.parseInt(p1[0]) - Integer.parseInt(p2[0]);
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb.toString());

    }
}