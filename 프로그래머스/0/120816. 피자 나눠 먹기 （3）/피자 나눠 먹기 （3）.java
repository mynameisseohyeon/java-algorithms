class Solution {
    public int solution(int slice, int n) {
        int count = n / slice;
        int answer = 0;
        
        if(n % slice > 0) {
            answer = count + 1;
        } else {
            answer = count;
        }
        
        return answer;
    }
}