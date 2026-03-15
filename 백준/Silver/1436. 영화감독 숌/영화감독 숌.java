import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int num = 666;
        int count = 1;

        while(count != N) {
            num += 1;
            if(String.valueOf(num).contains("666")) { // 666이 연속으로 포함되어 있는지
                count += 1;
            }
        }
        System.out.println(num);

    }
}