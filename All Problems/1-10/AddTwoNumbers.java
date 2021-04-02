class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode res = new ListNode(-1);
        ListNode current = res;
        int carry = 0;
        while(l1 != null || l2 != null){
            int l1Val = 0, l2Val = 0;
            if(l1 != null){
                l1Val = l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null){
                l2Val = l2.val;
                l2 = l2.next;
            }
            
            int sum = l1Val + l2Val + carry;
            carry = sum / 10;
            sum %= 10;
            current.next = new ListNode(sum);
            current = current.next;
        }
        
        if( carry >= 1){
            current.next = new ListNode(carry);
        }
            
        return res.next;
    }
}
