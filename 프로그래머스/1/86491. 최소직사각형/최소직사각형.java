class Solution {
    public int solution(int[][] sizes) { // 모든 명함을 수납할 수 있는 가장 작은 지갑
        int maxW = 0;
        int maxH = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            // 두 변 중 긴 쪽과 짧은 쪽 구하기
            int currMax = Math.max(sizes[i][0], sizes[i][1]);
            int currMin = Math.min(sizes[i][0], sizes[i][1]);
            
            maxW = Math.max(maxW, currMax);
            maxH = Math.max(maxH, currMin);
        }
        
        return maxW * maxH;
    }
}