class Solution:
    def isValid(self, s: str) -> bool:
        
        parentheses = []
        
        if s[0] == ")" or s[0] == "]" or s[0] == "}":
            return False

        for i in range(len(s)):
            
            if s[i] == "(" or s[i] == "[" or s[i] == "{":
                parentheses.append(s[i])
            
            elif s[i] == ")":
                if len(parentheses) == 0:
                    return False
                if parentheses[-1] == "(":
                    parentheses.pop()
                    continue
                else:
                    return False

            elif s[i] == "]":
                if len(parentheses) == 0:
                    return False
                if parentheses[-1] == "[":
                    parentheses.pop()
                    continue
                else:
                    return False

            elif s[i] == "}":
                if len(parentheses) == 0:
                    return False
                if parentheses[-1] == "{":
                    parentheses.pop()
                    continue
                else:
                    return False

        if len(parentheses) > 0:
            return False

        return True