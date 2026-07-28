class Solution {
    public int solution(String message) {
        int count = 0;
        
        for(char ch : message.toCharArray()) {
            count++;
        }
        
        int answer = count * 2;
        return answer;
    }
}