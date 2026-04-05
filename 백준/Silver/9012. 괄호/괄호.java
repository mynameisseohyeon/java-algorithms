import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException { // 괄호
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            String M = br.readLine();
            Deque<Character> stack = new ArrayDeque<>();
            boolean isValid = true;

            for(int j = 0; j < M.length(); j++){
                char input = M.charAt(j);
                switch (input){
                    case '(' :
                        stack.push('(');
                        break;
                    case ')' :
                        if(!stack.isEmpty()){
                            stack.pop();
                            break;
                        } else{
                            isValid = false;
                            break;
                        }
                }
            }
            if(isValid == false || !stack.isEmpty()){
                sb.append("NO\n");
            } else{
                sb.append("YES\n");
            }
        }
        System.out.println(sb.toString());
    }
}