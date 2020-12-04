package lc12032020;

public class SwapNodesInPairs {
	public ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		ListNode result = new ListNode(0);
		result.next = head;
		
		ListNode current = result;
		
		while(current.next != null && current.next.next != null) {
			ListNode first = current.next;
			ListNode second = current.next.next;
		
			// link current's next to the second node
			current.next = second;
			
			// link the first's next to second's next 
			first.next = second.next;
			
			// link the second's next to the first node.
			second.next = first;
			
			// because current and next have completed their swap, so jump to next.next.
			current = current.next.next;
		}
		
		return result.next;
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
