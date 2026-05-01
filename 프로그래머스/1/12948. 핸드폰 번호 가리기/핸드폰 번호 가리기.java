class Solution {
    public String solution(String phone_number) {
        int num_length = phone_number.length();
        int repeat_star = num_length - 4; // 반복할 '*' 횟수
                String answer = "";
        
        answer = "*".repeat(repeat_star) + phone_number.substring(repeat_star); // 뒤에서 4번째부터 끝까지
        
        return answer;
    }
}