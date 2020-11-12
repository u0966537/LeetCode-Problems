package lc11112020;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode root = new ListNode(0);
		ListNode head = root;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int l1Value = l1 != null ? l1.val : 0;
			int l2Value = l2 != null ? l2.val : 0;

			int result = l1Value + l2Value + carry;
			carry = result >= 10 ? 1 : 0;
			head.next = new ListNode(result % 10);
			head = head.next;

			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
		}

		if (carry > 0)
			head.next = new ListNode(carry);
		
		return root.next;
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
