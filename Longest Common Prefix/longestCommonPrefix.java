class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1 && strs[0].equals("")) {
            String lcp = "";
            return lcp;
        }

        String lcp = minString(strs);

        for (String st : strs) {
            if (lcp.equals(st)) {
                continue;
            }

            for (int letter = 0; letter < Math.min(lcp.length(), st.length()); letter++) {
                if (lcp.charAt(letter) == st.charAt(letter)) {
                    continue;
                }
                if (lcp.charAt(letter) != st.charAt(letter)) {
                    if (letter == 0) {
                        lcp = "";
                        return lcp;
                    } else {
                        lcp = lcp.substring(0, letter);
                        break;
                    }
                }
            }
        }
        return lcp;
    }

    private String minString(String[] strs) {
        String minStr = strs[0];
        for (String str : strs) {
            if (str.length() < minStr.length()) {
                minStr = str;
            }
        }
        return minStr;
    }
}
