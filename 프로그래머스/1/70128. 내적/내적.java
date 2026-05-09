class Solution {
    public int solution(int[] a, int[] b) {
        int sum = 0;
        
        for(int i = 0; i < a.length; i++) {
            int aNum = a[i];
            int bNum = b[i];
            sum += (aNum * bNum);
        }
        return sum;
    }
}