class Solution {
    public String reverseWords(String s) {
        String[] splited = s.split("\\s+");
        String temp = "";
        int lastIteration = 0;
        for(String word : splited) {
            for(int i=word.length()-1; i>=0; i--) {
                temp = temp + word.charAt(i);
            }
            lastIteration++;
            if(lastIteration == splited.length){
                break;
            }
            temp = temp + " ";
        }
        return temp;
    }
}