class Solution:
    def romanToInt(self, s: str) -> int:
        Sum = 0

        IV = s.count("IV")
        Sum += (IV*4)
        IX = s.count("IX")
        Sum += (IX*9)

        XL = s.count("XL")
        Sum += (XL*40)
        XC = s.count("XC")
        Sum += (XC*90)

        CD = s.count("CD")
        Sum += (CD*400)
        CM = s.count("CM")
        Sum += (CM*900)

        i = 0
        while True:
            if i == len(s)-1 or i == len(s):
                break
            if len(s) == 1:
                break
            if len(s) == 0:
                return Sum

            j = i+1

            if s[i] == "I" and s[j] == "V":
                s = s[:i] + s[j + 1: ]
            
            elif s[i] == "I" and s[j] == "X":
                s = s[:i] + s[j + 1: ]

            elif s[i] == "X" and s[j] == "L":
                s = s[:i] + s[j + 1: ]
            
            elif s[i] == "X" and s[j] == "C":
                s = s[:i] + s[j + 1: ]

            elif s[i] == "C" and s[j] == "D":
                s = s[:i] + s[j + 1: ]
            
            elif s[i] == "C" and s[j] == "M":
                s = s[:i] + s[j + 1: ]

            else:
                i+=1

        I = s.count("I")
        V = s.count("V")
        X = s.count("X")
        L = s.count("L")
        C = s.count("C")
        D = s.count("D")
        M = s.count("M")

        Sum += (I)+(V*5)+(X*10)+(L*50)+(C*100)+(D*500)+(M*1000)

        return Sum