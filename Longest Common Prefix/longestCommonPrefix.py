class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs) == 1 and strs[0] == "":
            lcp = ""
            return lcp

        lcp = min(strs, key=len)

        for st in strs:
            if lcp == st:
                continue

            for letter in range(min(len(lcp), len(st))):
                if lcp[letter] == st[letter]:
                    continue
                if lcp[letter] != st[letter]:
                    if letter == 0:
                        lcp = ""
                        return lcp
                    else:
                        lcp = lcp[:letter]
                        break
        return lcp