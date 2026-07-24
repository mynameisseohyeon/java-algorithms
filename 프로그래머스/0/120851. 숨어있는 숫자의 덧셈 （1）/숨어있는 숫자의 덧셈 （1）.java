class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        // 숫자가 아닐 경우 제거
        String target = my_string.replaceAll("[^0-9]", "");
        
        for(char ch : target.toCharArray()) {
            answer += ch - '0';
        }
        
        return answer;
    }
}