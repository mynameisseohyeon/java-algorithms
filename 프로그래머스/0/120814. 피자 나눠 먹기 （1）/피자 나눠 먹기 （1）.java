class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = n / 7;
        
        if(n % 7 > 0) {
            answer = num + 1;
        } else {
            answer = num;
        }

        return answer;
    }
}