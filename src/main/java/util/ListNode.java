package util;

import java.util.LinkedList;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode of(List<Integer> values) {
        if (values.isEmpty()) {
            return null;
        }

        if (values.size() == 1) {
            return new ListNode(values.getFirst());
        }

        var resultListNode = new ListNode(values.getFirst());
        values.removeFirst();
        resultListNode.next = of(values);
        return resultListNode;
    }

    public static List<Integer> getValues(ListNode listNode) {
        var resultList = new LinkedList<Integer>();

        while (listNode != null) {
            resultList.add(listNode.val);
            listNode = listNode.next;
        }

        return resultList;
    }
}