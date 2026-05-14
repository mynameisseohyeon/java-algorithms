class Solution {
    public long solution(int price, int money, int count) {
        long totalCost = 0;
        
        for(int i = 1; i <= count; i++) {
            totalCost += (price * i);    
        }
        
        if(totalCost > money) { // 금액이 모자란 경우
            return totalCost - money;
        } else { // 금액이 충분한 경우
            return 0;
        }
    }
}