class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(nums.length+1);
       int  ans = -1;
        
        for(int i = 0; i < nums.length; i++){
            if(!(set.add(nums[i]))){
                 ans= nums[i];
            }
   
        }
         return ans;
    }
   
}
