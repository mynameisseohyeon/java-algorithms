class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pNum = 0;
        int yNum = 0;
        
        for(int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'p' :
                    pNum += 1;
                    break;
                case 'P' :
                    pNum += 1;
                    break;
                case 'y' :
                    yNum += 1;
                    break;
                case 'Y' :
                    yNum += 1;
                    break;
            }
        }
        
        if(pNum != yNum) {
            answer = false;
        }

        

        return answer;
    }
}