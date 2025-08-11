// You are given an integer n. We reorder the digits in any order (including the original order) such that the leading digit is not zero.

// Return true if and only if we can do this so that the resulting number is a power of two.

class Solution {
    public boolean reorderedPowerOf2(int n) {
        Set<String> patterns = new HashSet<>();
        
        int power = 1;
        while (power <= 1_000_000_000) {
            patterns.add(sortDigits(power));
            power *=2 ; // multiply by 2
        }
        
        return patterns.contains(sortDigits(n));
    }
    
    private String sortDigits(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
