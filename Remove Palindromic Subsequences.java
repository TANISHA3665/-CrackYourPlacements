// https://leetcode.com/problems/remove-palindromic-subsequences/

class Solution {
    
    public int removePalindromeSub(String s) {
        
        if(isPalindrome(s, 0, s.length())) return 1;
        
        return 2;
    }
    
    public  boolean isPalindrome(String s, int i, int n){
        if(i >= n/2){
            return true;
        }
        
        if(s.charAt(i) != s.charAt(n-i-1))
        {
            return false;
        }
        
        return isPalindrome(s, i+1, n);
    }
}
