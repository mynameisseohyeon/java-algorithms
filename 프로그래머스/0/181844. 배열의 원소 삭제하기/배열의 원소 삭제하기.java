import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> solution = new ArrayList<>();
        
        // 삭제할 목록을 빠르게 찾기 위한 HashSet
        Set<Integer> set = new HashSet<>();
        for(int num : delete_list) {
            set.add(num);
        }
        
        
        for(int i = 0; i < arr.length; i++) { 
            if(!set.contains(arr[i])) { // delete_list에 없는 요소들만 저장
                solution.add(arr[i]);
            }
        }
        
        return solution.stream()
            .mapToInt(Integer::intValue) // 객체를 int로 변경
            .toArray(); // 배열 변경
    }
}