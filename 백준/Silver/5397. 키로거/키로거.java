import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
		
		for(int i = 0; i < T; i++) { // 테스트 케이스 개수만큼 반복
			Stack<Character> leftStack = new Stack<>();
			Stack<Character> rightStack = new Stack<>();
			String testCase = br.readLine();
			
			for(char pw : testCase.toCharArray()) {
				switch (pw) {
          case '<':
              if (!leftStack.isEmpty()) {
                // 왼쪽 스택에서 빼서 오른쪽 스택으로 이동
                rightStack.push(leftStack.pop());
              }
              break;
          case '>':
              if (!rightStack.isEmpty()) {
                // 오른쪽 스택에서 빼서 왼쪽 스택으로 이동
                leftStack.push(rightStack.pop());
              }
              break;
          case '-':
              if (!leftStack.isEmpty()) {
              // 왼쪽 스택에서 제거(pop)
                  leftStack.pop();
              }
              break;
          default:
              // 일반 문자는 무조건 왼쪽 스택에 추가(push)
              leftStack.push(pw);
              break;
          }
        }
				StringBuilder sb = new StringBuilder();
				// 왼쪽 스택은 순서대로
				for (char p : leftStack) {
					sb.append(p);
				}
				// 오른쪽 스택은 거꾸로 들어있으므로 pop하면서 추가
				while (!rightStack.isEmpty()) {
					sb.append(rightStack.pop());
				}
				System.out.println(sb.toString());
			}
	}
}