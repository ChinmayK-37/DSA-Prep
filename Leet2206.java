
// You can solve it by uising frequcncy of each element

class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-1){
            if(nums[i]==nums[i+1]){
                i+=2;
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}