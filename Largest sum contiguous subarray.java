class Solution{
    // Kadane's algo (positive and negative)
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
  
    long maxSubarraySum(int arr[], int n){
        
       int sum  = 0;
        int result = Integer.MIN_VALUE;
        
       for(int i  = 0; i < n; i++){
           sum = sum + arr[i];
           
           if(sum < arr[i]){
               sum = arr[i];
           }
           
           if(result < sum){
               result = sum;
           }
       }
       return result;
        
    }
    
}
