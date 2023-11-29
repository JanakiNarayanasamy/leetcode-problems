public class AddTwoNumbersInLinkedList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int carr = 0;

        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;

            int sum = x + y + carr;

            carr = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carr != 0) {
            curr.next = new ListNode(carr);
        }

        return dummy.next;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2,new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5,new ListNode(6, new ListNode(4)));
        AddTwoNumbersInLinkedList addTwoNumbersInLinkedList = new AddTwoNumbersInLinkedList();
        addTwoNumbersInLinkedList.addTwoNumbers(l1,l2);
    }
}
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }