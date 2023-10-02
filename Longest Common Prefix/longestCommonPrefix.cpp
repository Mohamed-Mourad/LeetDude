#include <vector>
#include <string>
#include <algorithm>

using namespace std;

class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if (strs.size() == 1 && strs[0] == "") {
            string lcp = "";
            return lcp;
        }

        string lcp = *min_element(strs.begin(), strs.end(), [](const string& a, const string& b) {
            return a.length() < b.length();
        });

        for (const string& st : strs) {
            if (lcp == st) {
                continue;
            }

            for (size_t letter = 0; letter < min(lcp.length(), st.length()); ++letter) {
                if (lcp[letter] == st[letter]) {
                    continue;
                }

                if (lcp[letter] != st[letter]) {
                    if (letter == 0) {
                        lcp = "";
                        return lcp;
                    } else {
                        lcp = lcp.substr(0, letter);
                        break;
                    }
                }
            }
        }

        return lcp;
    }
};
