package lc11082020;

public class RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode current = head;
		
		while(current.next != null) {
			if(current.val == current.next.val) {
				current.next = current.next.next;
			}
			else {
				current = current.next;
			}
		}
		
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
