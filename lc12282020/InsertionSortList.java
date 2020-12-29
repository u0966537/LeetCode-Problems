package lc12282020;

public class InsertionSortList {
  public ListNode insertionSortList(ListNode head) {
    if (head == null || head.next == null)
      return head;
    ListNode dummy = new ListNode(-1);
    dummy.next = head;

    ListNode cur = head;
    ListNode prev = null;
    ListNode temp = null;
    while (cur != null && cur.next != null) {
      if (cur.val <= cur.next.val) {
        cur = cur.next;
      } else {
        // if current value is bigger

        // link cur's next to cur's next next
        temp = cur.next;
        cur.next = cur.next.next;
        prev = dummy;

        // find the position from smallest to biggest
        while (prev.next.val <= temp.val) {
          prev = prev.next;
        }

        // link the rest (right) part of prev to temp.next
        temp.next = prev.next;

        // link the left part of prev to temp.
        prev.next = temp;
      }
    }

    return dummy.next;
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
