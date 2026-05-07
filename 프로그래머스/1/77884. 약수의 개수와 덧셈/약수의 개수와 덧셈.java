class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int sum = 0;
        
        for(int i = left; i <= right; i++) {
            int count = 0; 
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) { // 약수일 경우
                    count++;
                }
            }
            
            if(count % 2 == 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        

        return sum;
    }
}