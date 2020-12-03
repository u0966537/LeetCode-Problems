package lc12022020;

public class RemoveNthNodeFromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null) {
			return null;
		}
		
		ListNode current = head, prev = head;
        
		// sliding window:
		// let current ahead n nodes, and prev points to the beginning. 
		for(int i = 0 ; i < n; i++) {
			current = current.next;
		}
        
		
		// if current reaches to the end, that means n = the length,
		// it wants to remove the head, so we return head.next.
        if(current == null) return head.next;
        
        // the distance between current and prev is n nodes.
        // so we move all the points down to the end.
		while(current.next != null) {
			current = current.next;
			prev = prev.next;
		}
		
		// unlink the node.
		prev.next = prev.next.next;
		return head;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

}
