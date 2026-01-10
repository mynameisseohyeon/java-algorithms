import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException{ // 에디터 (1406)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(br.readLine()); // 입력할 명령어의 개수
		// int[] cursor = new int[num + 1]; // 커서는 문장 맨 뒤에 위치
		// int index = num + 1;
		
		// 커서 왼쪽에 위치할 글자들
		Stack<Character> leftStack = new Stack<>();
		
		// 커서 왼쪽에 위치할 글자들
		Stack<Character> rightStack = new Stack<>();
		
		for(char c : str.toCharArray()) { // 문자열을 문자 하나하나로 쪼개서 배열에 담아주기
			leftStack.push(c);
		}
		
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String M1 = st.nextToken();

			switch (M1) {
				case "L" : // 커서를 왼쪽으로 한 칸 옮김
					if(!leftStack.isEmpty()) { // 왼쪽 스택이 비어 있지 않을 경우
						rightStack.push(leftStack.pop()); // 왼쪽 글자를 꺼내서(pop) 오른쪽으로 넣음(push)
					}
					break;
				case "D" : // 커서를 오른쪽으로 한 칸 옮김
					if(!rightStack.isEmpty()) { // 오른쪽 스택이 비어 있지 않을 경우
						leftStack.push(rightStack.pop()); // 오른쪽 글자를 꺼내서(pop) 왼쪽으로 넣음(push)
					}
					break;
				case "B" : // 커서 왼쪽에 있는 문자를 삭제함
					if(!leftStack.isEmpty()) { // 오른쪽 스택이 비어 있지 않을 경우
						leftStack.pop();
					}
					break;
				case "P" : // $라는 문자를 커서 왼쪽에 추가
					String M2 = st.nextToken();
					leftStack.push(M2.charAt(0));
					break;
				}
		}
		
		while(!leftStack.isEmpty()) { // 왼쪽 스택이 비어질 때까지
			rightStack.push(leftStack.pop()); // 왼쪽에서 꺼내서 오른쪽으로
		}
		
		StringBuilder sb = new StringBuilder();
		while(!rightStack.isEmpty()) { // 오른쪽 스택에서 꺼내서 StringBuilder에 붙이기
			sb.append(rightStack.pop());
		}
		
		System.out.println(sb.toString());
	}
}