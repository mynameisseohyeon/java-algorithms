class Solution {
    public long solution(long n) {
        long num = 1;
        long answer = 0;
        
        while(num * num <= n) {
            if(num * num == n) {
                return (num += 1) * num;
            }
            num += 1;
        }

        return -1;
    }
}