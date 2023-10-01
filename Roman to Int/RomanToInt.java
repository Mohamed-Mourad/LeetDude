class Solution {
    public int romanToInt(String s) {
        int sum = 0;

        int IV = countSubstrings(s, "IV");
        sum += (IV * 4);
        int IX = countSubstrings(s, "IX");
        sum += (IX * 9);

        int XL = countSubstrings(s, "XL");
        sum += (XL * 40);
        int XC = countSubstrings(s, "XC");
        sum += (XC * 90);

        int CD = countSubstrings(s, "CD");
        sum += (CD * 400);
        int CM = countSubstrings(s, "CM");
        sum += (CM * 900);

        int i = 0;
        while (true) {
            if (i == s.length() - 1 || i == s.length()) {
                break;
            }
            if (s.length() == 1) {
                break;
            }
            if (s.length() == 0) {
                return sum;
            }

            int j = i + 1;

            if (s.charAt(i) == 'I' && s.charAt(j) == 'V') {
                s = s.substring(0, i) + s.substring(j + 1);
            } else if (s.charAt(i) == 'I' && s.charAt(j) == 'X') {
                s = s.substring(0, i) + s.substring(j + 1);
            } else if (s.charAt(i) == 'X' && s.charAt(j) == 'L') {
                s = s.substring(0, i) + s.substring(j + 1);
            } else if (s.charAt(i) == 'X' && s.charAt(j) == 'C') {
                s = s.substring(0, i) + s.substring(j + 1);
            } else if (s.charAt(i) == 'C' && s.charAt(j) == 'D') {
                s = s.substring(0, i) + s.substring(j + 1);
            } else if (s.charAt(i) == 'C' && s.charAt(j) == 'M') {
                s = s.substring(0, i) + s.substring(j + 1);
            } else {
                i++;
            }
        }

        int I = countChar(s, 'I');
        int V = countChar(s, 'V');
        int X = countChar(s, 'X');
        int L = countChar(s, 'L');
        int C = countChar(s, 'C');
        int D = countChar(s, 'D');
        int M = countChar(s, 'M');

        sum += (I) + (V * 5) + (X * 10) + (L * 50) + (C * 100) + (D * 500) + (M * 1000);

        return sum;
    }

    private int countSubstrings(String s, String substring) {
        int count = 0;
        int index = s.indexOf(substring);
        while (index != -1) {
            count++;
            index = s.indexOf(substring, index + 1);
        }
        return count;
    }

    private int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
