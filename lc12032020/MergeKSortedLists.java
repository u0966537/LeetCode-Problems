package lc12032020;

import java.util.PriorityQueue;

public class MergeKSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0) {
			return null;
		}

		PriorityQueue<ListNode> q = new PriorityQueue<>((a, b) -> a.val - b.val);
		for (ListNode n : lists) {
			if (n != null) {
				q.add(n);
			}
		}
		ListNode head = new ListNode(0);
		ListNode result = head;
		while (!q.isEmpty()) {
			result.next = q.poll();
			result = result.next;

			if (result.next != null) {
				q.add(result.next);
			}
		}
		return head.next;
	}

	public ListNode mergeKLists2(ListNode[] lists) {
		if (lists == null || lists.length == 0) {
			return null;
		}

		if (lists.length == 1) {
			return lists[0];
		}
		
		// pick one next to each other
		// start with one list two combine
		int start = 1;
		while (start < lists.length) {
			
			// 2 * start -> the difference between the current list with the next list is 2 * start
			for (int i = 0; i < lists.length - start; i += (2 * start)) {
				lists[i] = mergeTwoLists(lists[i], lists[i + start]);
			}
			
			// multiple by 2 -> each time the list is scale down to half.
			start *= 2;
		}
		
		
		/**
		 *  pick one from left and right and merge them:
		    int length = lists.length;
        	while(length > 1) {
            for(int i = 0; i < length/2; i++) { 
                lists[i] = mergeTwoLists(lists[i], lists[length - 1 - i]);
            }
            length = (length + 1)/2;
        }
        return lists[0];
		 */
		return lists[0];
	}
	
	// merge two list node.
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        
        while(l1 != null && l2 != null) {
        	// link the smaller node.
            if(l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            }else {
            	current.next = l2;
            	l2 = l2.next;
            }
            current = current.next;
        }
        
        // if one of them is null, then we are done. we make next link to the rest of the node. 
        current.next = l1 == null? l2 : l1;
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
