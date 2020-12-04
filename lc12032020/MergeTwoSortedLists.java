package lc12032020;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode current = head;
		
		while(l1 != null || l2 != null) {
			if(l1 != null && l2 != null) {
				if(l1.val <= l2.val) {
					current.next = new ListNode(l1.val);
					l1 = l1.next;
				}
				else {
					current.next = new ListNode(l2.val);
					l2 = l2.next;
				}
				
			}
			else if(l1 != null) {
				current.next = new ListNode(l1.val);
				l1 = l1.next;
			}
			else {
				current.next = new ListNode(l2.val);
				l2 = l2.next;
			}
			
			current = current.next;
		}
		
		return head.next;
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
