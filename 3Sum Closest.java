// https://leetcode.com/problems/3sum-closest/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        
        Arrays.sort(nums);
                
        for(int i  = 0; i < nums.length - 2; i++){
            
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){ 
                
                int lo = i + 1, hi = nums.length - 1;
                
                while(lo < hi){
                    
                    int sum = nums[i] + nums[lo] + nums[hi];
                    
                    if(sum < target){
                        
                    //move closer to target sum.
                    while(lo < hi && nums[lo] == nums[lo + 1]){
                        lo++;
                    }
                        
                    lo++;
                        
                }else if(sum > target){
                        
                    //move closer to target sum.
                    while(lo < hi && nums[hi] == nums[hi-1]){
                        hi--;
                    }
                        
                    hi--;
                        
                }
                    else{
                        return sum;
                    }
                    
                    if(Math.abs(target - sum) < Math.abs(target - result)){
                    result = sum;
                }
                    
                }
            }
    }
    return result;
 }      

}   
   
