package lc12032020;

import java.util.PriorityQueue;

public class MergeKSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
		if(lists == null || lists.length == 0) {
			return null;
		}
		
		PriorityQueue<ListNode> q = new PriorityQueue<>(lists.length, (a,b) -> a.val-b.val );
		for(ListNode n : lists) {
			if(n != null) {
				q.add(n);
			}
		}
		ListNode head = new ListNode(0);
		ListNode result = head;
		while(!q.isEmpty()) {
			result.next = q.poll();
			result = result.next;
			
			if(result.next != null) {
				q.add(result.next);
			}
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
