import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException { // 균형잡힌 세상
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String input = br.readLine();
            if(input.equals(".")) {
                break;
            }

            Deque<Character> stack = new ArrayDeque<>();
            boolean isValid = true;
            for(int i = 0; i < input.length(); i++) {
                switch(input.charAt(i)) {
                    case '(' :
                        stack.push('(');
                        break;
                    case '[' :
                        stack.push('[');
                        break;
                    case ')' :
                        if(stack.isEmpty() || !stack.peek().equals('(')) {
                            isValid = false;
                        } else { // 괄호가 짝이 맞는 경우
                            stack.pop();
                        }
                        break;
                    case ']' :
                        if(stack.isEmpty() || !stack.peek().equals('[')) {
                            isValid = false;
                        } else { // 괄호가 짝이 맞는 경우
                            stack.pop();
                        }
                        break;
                }
            }
            if(isValid == true && stack.isEmpty()) { // 문자열이 균형을 잡히고 있을 경우
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }
        System.out.println(sb.toString());
    }
}