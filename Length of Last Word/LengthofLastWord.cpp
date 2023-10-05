#include <string>;
using namespace std; 

class Solution {
public:
    int lengthOfLastWord(string s) {
        int length = 0;
        int lastLength = 0;
        for(int i=0; i<s.length(); i++) {
            if(s[i] != ' ') {
                length++;
                lastLength = length;
            }
            if(s[i] == ' ' && length == 0) {
                continue;
            }
            if(s[i] == ' ') {
                length = 0;
            }
        }
        return lastLength;
    }
};