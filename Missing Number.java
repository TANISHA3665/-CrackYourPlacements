class Solution {
    int MissingNumber(int array[], int n) {
       int ans = 0;
       
       for(int i = 0; i < n-1; i++){
           ans = ans ^ array[i];
       }
       
       for(int i = 1; i <= n; i++){
           ans = ans ^ i;
       }
       
       return ans;
    }
}
