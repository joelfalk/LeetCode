import java.util.List;

public class AddTwoNumberLinkedList {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;

        for (int i = 1; i <= 100; i = i * 10) {
            sum = sum + i*(l1.val + l2.val);
            if (l1.next != null && l2.next != null) {
                l1 = l1.next;
                l2 = l2.next;
            }
        }


        ListNode listNode1 = new ListNode(sum % 100);
        sum = sum / 10;
        ListNode listNode2 = new ListNode(sum % 10, listNode1);
        sum = sum / 10;
        return new ListNode(sum % 1, listNode2);
    }
}

class ListNode {
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

