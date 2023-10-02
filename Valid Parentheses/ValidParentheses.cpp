#include <stack>
#include <string>

using namespace std;

class Solution {
public:
    bool isValid(string s) {
        stack<char> parentheses;
        
        if (s[0] == ')' || s[0] == ']' || s[0] == '}') {
            return false;
        }

        for (char c : s) {
            if (c == '(' || c == '[' || c == '{') {
                parentheses.push(c);
            } else if (c == ')') {
                if (parentheses.empty() || parentheses.top() != '(') {
                    return false;
                }
                parentheses.pop();
            } else if (c == ']') {
                if (parentheses.empty() || parentheses.top() != '[') {
                    return false;
                }
                parentheses.pop();
            } else if (c == '}') {
                if (parentheses.empty() || parentheses.top() != '{') {
                    return false;
                }
                parentheses.pop();
            }
        }

        return parentheses.empty();
    }
};
