//You are given two non-empty linked lists representing two non-negative 
//integers. The digits are stored in reverse order, and each of their nodes contains a 
//single digit. Add the two numbers and return the sum as a linked list. 
//
// You may assume the two numbers do not contain any leading zero, except the 
//number 0 itself. 
//
// 
// Example 1: 
// 
// 
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
// 
//
// Example 2: 
//
// 
//Input: l1 = [0], l2 = [0]
//Output: [0]
// 
//
// Example 3: 
//
// 
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in each linked list is in the range [1, 100]. 
// 0 <= Node.val <= 9 
// It is guaranteed that the list represents a number that does not have 
//leading zeros. 
// 
//
// Related Topics Linked List Math Recursion 👍 27888 👎 5364


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode tmp = ans;
        ListNode p = l1;
        ListNode q = l2;
        while (p != null || q != null){
            int a = (p != null) ? p.val : 0;
            int b = (q != null) ? q.val : 0;
            int sum = a + b + tmp.val, carry = 0;
            if(sum >= 10){
                sum %= 10;
                carry = 1;
            }
            tmp.val = sum;
            p = (p != null) ? p.next : null;
            q = (q != null) ? q.next : null;
            if(p != null || q != null || carry!=0){
                tmp.next = new ListNode(carry);
                tmp = tmp.next;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
