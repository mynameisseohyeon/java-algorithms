import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        int count = set.size(); // 중복 제거
        int halfCount = nums.length / 2;
        
        return Math.min(count, halfCount);
    }
}