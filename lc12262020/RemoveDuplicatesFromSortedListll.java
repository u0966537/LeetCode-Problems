package lc12262020;

public class RemoveDuplicatesFromSortedListll{
	
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        
       	ListNode dummy = new ListNode(-1);
       	dummy.next = head;
       	
       	ListNode current = dummy;
       	while(current.next != null && current.next.next != null){
       		if(current.next.val == current.next.next.val){
       			int val = curent.next.val;
       			while(current.next != null && current.next.val == val){
       				current.next = current.next.next;
       			}
       		}
       		else{
       			current = current.next;
       		}
       	}
       	return dummy.next;
    }
    
     public class ListNode {
	 	int val;
	 	ListNode next;
 		ListNode() {}
 	 	ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
}