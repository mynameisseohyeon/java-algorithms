class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char curr = s.charAt(i);

            if (curr == 'I') {
                if (i + 1 < len && s.charAt(i + 1) == 'V') {
                    result += 4;
                    i++; 
                } else if (i + 1 < len && s.charAt(i + 1) == 'X') {
                    result += 9;
                    i++;
                } else {
                    result += 1;
                }
            } else if (curr == 'V') {
                result += 5;
            } else if (curr == 'X') {
                if (i + 1 < len && s.charAt(i + 1) == 'L') {
                    result += 40;
                    i++;
                } else if (i + 1 < len && s.charAt(i + 1) == 'C') {
                    result += 90;
                    i++;
                } else {
                    result += 10;
                }
            } else if (curr == 'L') {
                result += 50;
            } else if (curr == 'C') {
                if (i + 1 < len && s.charAt(i + 1) == 'D') {
                    result += 400;
                    i++;
                } else if (i + 1 < len && s.charAt(i + 1) == 'M') {
                    result += 900;
                    i++;
                } else {
                    result += 100;
                }
            } else if (curr == 'D') {
                result += 500;
            } else if (curr == 'M') {
                result += 1000;
            }
        }

        return result;
    }
}