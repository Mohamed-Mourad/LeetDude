#include <iostream>
using namespace std;

class Solution {
public:
    int romanToInt(string s) {
        int Sum = 0;

        size_t IV = s.find("IV");
        Sum += (IV != string::npos ? 4 : 0);
        size_t IX = s.find("IX");
        Sum += (IX != string::npos ? 9 : 0);

        size_t XL = s.find("XL");
        Sum += (XL != string::npos ? 40 : 0);
        size_t XC = s.find("XC");
        Sum += (XC != string::npos ? 90 : 0);

        size_t CD = s.find("CD");
        Sum += (CD != string::npos ? 400 : 0);
        size_t CM = s.find("CM");
        Sum += (CM != string::npos ? 900 : 0);

        size_t i = 0;
        while (true) {
            if (i == s.length() - 1 || i == s.length()) {
                break;
            }
            if (s.length() == 1) {
                break;
            }
            if (s.length() == 0) {
                return Sum;
            }

            size_t j = i + 1;

            if (s[i] == 'I' && s[j] == 'V') {
                s.erase(i, 2);
            } else if (s[i] == 'I' && s[j] == 'X') {
                s.erase(i, 2);
            } else if (s[i] == 'X' && s[j] == 'L') {
                s.erase(i, 2);
            } else if (s[i] == 'X' && s[j] == 'C') {
                s.erase(i, 2);
            } else if (s[i] == 'C' && s[j] == 'D') {
                s.erase(i, 2);
            } else if (s[i] == 'C' && s[j] == 'M') {
                s.erase(i, 2);
            } else {
                i++;
            }
        }

        size_t I = count(s.begin(), s.end(), 'I');
        size_t V = count(s.begin(), s.end(), 'V');
        size_t X = count(s.begin(), s.end(), 'X');
        size_t L = count(s.begin(), s.end(), 'L');
        size_t C = count(s.begin(), s.end(), 'C');
        size_t D = count(s.begin(), s.end(), 'D');
        size_t M = count(s.begin(), s.end(), 'M');

        Sum += (I) + (V * 5) + (X * 10) + (L * 50) + (C * 100) + (D * 500) + (M * 1000);

        return Sum;
    }
};