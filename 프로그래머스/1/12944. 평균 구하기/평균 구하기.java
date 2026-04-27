class Solution {
    public double solution(int[] arr) {
        double sum  = 0;
        double avg = 0;
        
        for(int num : arr) {
            sum += num;
        }
        
        avg = sum / arr.length;
        
        return avg;
    }
}