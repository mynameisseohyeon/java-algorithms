import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 수학여행에 참가하는 학생 수 N
		int K = Integer.parseInt(st.nextToken()); // 한 방에 배정할 수 있는 최대 인원 수 K
		int roomNum = 0;
		
		int MAX_GRADE = 6; // 1 ~ 6학년
		// 성별 0 여성, 1 남성 
		// 학년 (학년이 같을 경우 최대 인원수까지 같은 방 사용 가능, 초과 시 새로운 방 사용)
		int[][] students = new int[2][MAX_GRADE + 1]; // 계산하기 쉬우려고 7 작성
		
		for(int i = 0; i < N; i++) { // 각 줄에는 성별과 학년이 공백 분리
			st = new StringTokenizer(br.readLine());
			
			int gender = Integer.parseInt(st.nextToken());
			int grade = Integer.parseInt(st.nextToken());
			
			students[gender][grade]++; // 주소값을 1씩 증가
		}
		
		for(int i = 0; i < 2; i ++) { // 성별 0, 1
			for(int j = 1; j <= MAX_GRADE; j++) { // 학년 1 ~ 6
				int count = students[i][j];
				
				if(count == 0) continue; // 학생이 없을 경우 패스
				
				// 만큼 방 더하기
				roomNum += count / K;
				
				if (count % K != 0) {
					roomNum++;
				}
			}
		}
		
		System.out.println(roomNum);
	}
}