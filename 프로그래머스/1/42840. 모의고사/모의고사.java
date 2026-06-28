import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] answers) { // 가장 많은 문제를 맞춘 사람 return
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 맞춘 개수 배열
        int[] score = new int[3];

        for(int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % p1.length]) score[0]++;
            if (answers[i] == p2[i % p2.length]) score[1]++;
            if (answers[i] == p3[i % p3.length]) score[2]++;
        }
        
        int max = 0;
        for(int i = 0; i < 3; i ++) { // 가장 많이 맞춘 문제 개수
            if(score[i] > max) {
                max = score[i];
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 3; i ++) {
            if(score[i] == max) list.add(i + 1);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}