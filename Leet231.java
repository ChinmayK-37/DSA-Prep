class Leet231 {

    public boolean isPowerOfTwo(int n) {
        // Time Complexity: O(1)
        // Space Complexity: O(1)

        return n > 0 && (n & (n - 1)) == 0;

        // My approach

        // double N = n;
        // if(N<=0) return false;

        // while(N>1){
        //     N=N/2;
        // }

        // if(N==1) return true;
        // else return false;
    }
}