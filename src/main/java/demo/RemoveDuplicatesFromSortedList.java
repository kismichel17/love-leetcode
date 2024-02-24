package demo;

import util.ListNode;

public class RemoveDuplicatesFromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        var currentNode = head;
        var nextNode = currentNode.next;

        while (nextNode != null) {
            if (currentNode.val == nextNode.val) {
                nextNode = nextNode.next;
                continue;
            }
            currentNode.next = nextNode;
            currentNode = nextNode;
            nextNode = nextNode.next;
        }

        currentNode.next = null;
        return head;
    }
}
