import java.io.*;
import java.util.*;

public class Main{ // 웰컴키트
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 참가자 수

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] sizes = new int[6]; // 사이즈별 티셔츠 주문 수
        for(int i = 0; i < 6; i++) { // 사이즈(S, M, L, XL< XXL, XXXL)
            // 티셔츠는 같은 사이즈 T장 묶음으로만 주문 가능
            sizes[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken()); // 티셔츠 묶음 수
        int P = Integer.parseInt(st.nextToken()); // 펜 묶음 수

        int tBundle = 0; // 티셔츠 총 주문 수

        for(int i = 0; i < 6; i++) {
            if (sizes[i] != 0) {
                tBundle += sizes[i] / T;
            }
            if (sizes[i] % T >= 1) {
                tBundle += 1;
            }
        }
        System.out.println(tBundle); // T장씩 최소 몇 묶음을 주문해야 하는지

        int pBundle = N / P;
        int pRemain = N % P;
        System.out.println(pBundle + " " + pRemain); // P자루씩 최대 펜 몇 묶음 주문할 수 있는지 / 펜을 한 자루씩 몇 개 주문하는지
    }
}