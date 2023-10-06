class Solution {
    public int integerBreak(int n) {
        int product = 1;
        if(n == 3) {
            return 2;
        }
        if(n == 2) {
            return 1;
        }
        while(true) {
            if(n == 0 || n == 1) {
                return product;
            }
            if(n == 4){
                product *= 4;
                return product;
            }
            if(n-3 >= 0) {
                n -= 3;
                product *= 3;
                continue;
            }
            if(n-2 >= 0) {
                n -= 2;
                product *= 2;
                continue;
            }
        }
    }
}