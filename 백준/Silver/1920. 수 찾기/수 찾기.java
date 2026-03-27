import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException { // 수 찾기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr);

        for(int i = 0; i < M; i++){
            if(Arrays.binarySearch(arr, arr2[i]) >= 0) { // arr에 arr2[i]가 존재하는지 확인
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}