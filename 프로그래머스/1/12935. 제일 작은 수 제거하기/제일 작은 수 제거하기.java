import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        int arrLength = arr.length;
        
        
        for(int i = 0; i < arrLength; i++) { // 가장 작은 수 찾기
            if(min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        
        int[] result = new int[arrLength - 1];
        int targetIndex = 0; // 빈 배열이 생기는 것을 방지
        
        if(arrLength <= 1) {
            return new int[]{-1};
        } else {
            for (int i = 0; i < arr.length; i++) {
                if(i != minIndex) { // 가장 작은 수가 아닐 경우 배열에 추가
                    result[targetIndex] = arr[i];
                    targetIndex++;
                }
            }
            return result;
        }
    }
}