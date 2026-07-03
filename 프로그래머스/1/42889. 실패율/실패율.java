import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) { 
        int[] answer = new int[N];
        
        // 실패율 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
        Map<Integer, Double> failed = new HashMap<>(); // 스테이지 번호, 실패율
        
        for(int i = 0; i < N; i++) { // 전체 스테이지 개수 N
            int currentStage = i + 1; // 현재 연산 중인 스테이지 번호
            double reached = 0; // 스테이지에 도달한 플레이어 수
            double notCleared = 0; // 도달했으나 클리어 x
            
            for(int j = 0; j < stages.length; j++) { // 멈춰 있는 스테이지 번호 stages
                if(stages[j] >= currentStage) {
                    reached++;
                }
                
                if(stages[j] == currentStage) {
                    notCleared++;
                }
            }
            
            // 도달한 유저가 없을 경우 실패율 0
            double rate = (reached == 0) ? 0.0 : notCleared / reached;
            failed.put(currentStage, rate);
        }
        
        List<Integer> stageList = new ArrayList<>(failed.keySet());
        
        stageList.sort((a, b) -> {
            // 실패율(Value)을 가져와 비교
            int compare = Double.compare(failed.get(b), failed.get(a));
            
            // 실패율이 같다면 스테이지 번호 기준 오름차순 정렬
            if (compare == 0) {
                return Integer.compare(a, b);
            }
            return compare;
        });
        
        for (int i = 0; i < N; i++) {
            answer[i] = stageList.get(i);
        }
    
        return answer;
    }
}