import java.util.*;
import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrayList = new ArrayList<>(); // 결과를 담을 ArrayList
        
        int previousValue = -1;  // 배열 안에 숫자가 0 혹은 양수이기 때문에 -1로 초기값 설정

        // 배열을 하나씩 순서대로 확인
        for (int num : arr) {
            // 첫 번째 값이거나 이전 값과 다를 때만 추가
            if (num != previousValue) {
                arrayList.add(num);  // 중복이 아니면 추가
                previousValue = num;  // 현재 값을 이전 값으로 업데이트
            }
        }
        
        int[] answer = new int[arrayList.size()]; // 결과를 배열로 반환
        for(int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i); // 배열에 결과 삽입
        }
        return answer;
    }
}