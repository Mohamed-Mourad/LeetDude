#include <string>

class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        // Convert the integer to a string and reverse it
        std::string str_x = std::to_string(x);
        std::string reversed_str_x = str_x;
        std::reverse(reversed_str_x.begin(), reversed_str_x.end());
        
        // Compare the original string with the reversed string
        return str_x == reversed_str_x;
    }
};
