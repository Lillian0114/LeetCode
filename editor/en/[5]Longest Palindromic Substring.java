//Given a string s, return the longest palindromic substring in s. 
//
// 
// Example 1: 
//
// 
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.
// 
//
// Example 2: 
//
// 
//Input: s = "cbbd"
//Output: "bb"
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 1000 
// s consist of only digits and English letters. 
// 
//
// Related Topics String Dynamic Programming 👍 26894 👎 1582


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n<=1)
            return s;
        for(int len = n; len >= 2; len--) {
            for(int left = 0; left + len <= n; left++) {
                int right = left + len - 1;
                if(isPal(s,left,right))
                    return s.substring(left, right+1);
            }
        }
        return s.substring(0,1);
    }

    public boolean isPal(String s, int l,int r){
        while(l<r) {
            if(s.charAt(l++)!=s.charAt(r--))
                return false;
        }
        return true;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
