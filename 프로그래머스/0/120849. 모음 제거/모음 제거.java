class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        
        for(int i = 0; i < my_string.length(); i++) {
            boolean isVowel = false;
            
            for(int j = 0; j < vowels.length; j++) {
                if(my_string.charAt(i) == vowels[j]) {
                    isVowel = true;
                    break;
                }
            }
            
            if(!isVowel) { // 모음이 아닐 경우
                answer += my_string.charAt(i);
            }
            
        }
        
        
        return answer;
    }
}