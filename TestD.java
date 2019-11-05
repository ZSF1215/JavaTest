public class TestD {
    //输入两个链表，找出它们的第一个公共结点。
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pL = headA;
        ListNode pS = headB;
        int lenA = 0;
        while (pL != null) {
            lenA++;
            pL = pL.next;
        }
        int lenB = 0;
        while (pS != null) {
            lenB++;
            pS = pS.next;
        }
        pL = headA;
        pS = headB;
        int len = lenA - lenB;
        if (len < 0) {
            len = -len;
            pL = headB;
            pS = headA;
        }

        while (len > 0) {
            pL = pL.next;
            len--;
        }
        while (pL != pS && pL != null) {
            pL = pL.next;
            pS = pS.next;
        }
        if (pL == pS && pL != null) {
            return pL;
        }
        return null;
    }

    // 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成
    public static ListNode mergeTwoLists(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        ListNode node = new ListNode(-1);
        ListNode tmp = node;
        while (curA != null && curB != null) {
            if (curA.data < curB.data) {
                tmp.next = curA;
                tmp = tmp.next;
                ;
                curA = curA.next;
            } else {
                tmp.next = curB;
                tmp = tmp.next;
                curB = curB.next;
            }
        }
        if (curA != null) {
            tmp.next = curA;
        }
        if (curB != null) {
            tmp.next = curB;
        }
        return node.next;
    }
}

