package lc12272020;

public class PartitionList {
  public ListNode partition(ListNode head, int x) {
    if (head == null)
      return head;

    ListNode small = new ListNode(0), smallCurr = small;
    ListNode high = new ListNode(0), highCurr = high;

    while (head != null) {
      if (head.val < x) {
        smallCurr.next = new ListNode(head.val);
        smallCurr = smallCurr.next;
      } else {
        highCurr.next = new ListNode(head.val);
        highCurr = highCurr.next;
      }
      head = head.next;
    }

    smallCurr.next = high.next;
    return small.next;
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
