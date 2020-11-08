package lc11082020;

public class RemoveLinkedListElements {
	
	/**
	 * Recursion:
	 * go down to the deepest level and link ListNode if its value != val
	 * @param head
	 * @param val
	 * @return
	 */
	public ListNode removeElements(ListNode head, int val) {
		// base case:
		if (head == null) {
			return head;
		}
		
		head.next = removeElements(head.next, val);
		return head.val == val ? head.next : head;
	}

	/**
	 * Iteration:
	 * check each listnode's value
	 * @param head
	 * @param val
	 * @return
	 */
	public ListNode removeElements2(ListNode head, int val) {
		ListNode result = new ListNode(0), cur = result;
		result.next = head;
		
		while (cur.next != null) {
			// check current next ListNode's value equal to val or not
			if (cur.next.val == val) {
				cur.next = cur.next.next;
			}
			
			// if not equal, go down to next level.
			else {
				cur = cur.next;
			}
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
