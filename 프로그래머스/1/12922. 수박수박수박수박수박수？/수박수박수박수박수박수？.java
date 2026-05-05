class Solution {
    public String solution(int n) {
        String answer = "";
        
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) { // 짝수일 경우
                answer += "수";
            } else { // 홀수일 경우
                answer += "박";
            }
        }
        return answer;
    }
}