import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException { // 수 정렬하기 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++) { // 오름차순 정렬
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb.toString());
    }
}