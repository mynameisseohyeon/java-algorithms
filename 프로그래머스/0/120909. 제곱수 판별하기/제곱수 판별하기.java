class Solution {
    public int solution(int n) {
        double sqrtValue = Math.sqrt(n);
        
        int answer = sqrtValue == (int) sqrtValue ? 1 : 2;
        
        return answer;
        
    }
}