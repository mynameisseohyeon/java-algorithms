class Solution {
    public boolean isPrime(int num) {
        if(num < 2) return false;
        
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) return false;
        }
        
        return true;
    }
    
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int num1 = nums[i];
                    int num2 = nums[j];
                    int num3 = nums[k];
                    
                    int sum = num1 + num2 + num3;
                    if(isPrime(sum)) {
                        answer += 1;
                    }
                }
            }
        }

        return answer;
    }
}