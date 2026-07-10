class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int ice_americano = 5500;
        
        if(money % ice_americano == 0) {
            answer[0] = money / ice_americano;
            answer[1] = 0;
        } else {
            answer[0] = money / ice_americano;
            answer[1] = money % ice_americano;
        }
        
        return answer;
    }
}