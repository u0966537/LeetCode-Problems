package lc12272020;

public class ReverseLinkedListll{
	public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null) return head;
        
        ListNode prev = null;
        ListNode curr = head;
        
        int i = 1;
        while(i < m ){
        	prev = curr;
        	curr = curr.next; 
        	i++;
        }
        ListNode con = prev, tail = curr;
        while(i <= n){
        	ListNode next = curr.next;
        	curr.next = prev;
        	prev = curr;
        	curr = next;
        	i++;
        }
        
        // if the starting position is not at the first node.
        if(m > 1) con.next = prev;
        // otherwise set the whole linked list into the head.
        else head = prev;
        
        // tail is the last element and connect with the rest of list nodes.
        tail.next = curr;
        
        return head;
    }
    
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
}