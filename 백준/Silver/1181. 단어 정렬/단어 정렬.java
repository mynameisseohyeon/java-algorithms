import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException { // 단어 정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for(int i = 0; i < N; i++) {
            set.add(br.readLine()); // 중복 제거
        }

        List<String> list = new ArrayList<>(set);

        list.sort((s1, s2) -> {
            if (s1.length() == s2.length()) { // 길이가 같을 경우 사전순 정렬
                return s1.compareTo(s2);
            }
            return s1.length() - s2.length(); // 단어 길이순 정렬
        });

        for(String s : list) {
            System.out.println(s);
        }
    }
}