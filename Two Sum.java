class Solution {
    public int[] twoSum(int[] nums, int target) {
//         O(N^2) Time complexity

        int[] ans = new int[2];
        
//         for(int i = 0; i < nums.length-1; i++){
//             for(int j = i + 1; j < nums.length; j++){
//                 if(nums[i] + nums[j] == target){
//                     ans[0] = i;
//                     ans[1] = j;
//                 }
//             }
//         }
//         return ans;
        
        
        // we can use hashmap for O(n)
        
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        
       for(int i = 0; i < nums.length; i++){
           if(hash.containsKey(target - nums[i])){
               ans[1] = i;
               ans[0] = hash.get(target - nums[i]);
           }
           else{
               hash.put(nums[i], i);
           }
        }
        return ans;
    }
}
