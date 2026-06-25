class Solution {
    public int solution(String s) {
        String answer = "";
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        while(s.length() > 0) { // s가 비어있지 않을 때까지
            char firstChar = s.charAt(0);
            if(Character.isDigit(firstChar)) {
                // 맨 앞 글자가 숫자일 경우
                answer += firstChar;
                s = s.substring(1);
            } else {
                for(int i = 0; i < words.length; i++) {
                    if(s.startsWith(words[i])) {
                        answer += i;
                        s = s.substring(words[i].length()); // 단어 길이만큼 잘라내기
                         break;             
                    }
                }
            }
        }
        
        return Integer.parseInt(answer);
    }
}