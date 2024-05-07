package com.example.demo.leetcode;

public class RemoveDuplicates83 {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(2);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n1;
        System.out.println("************** STARTING ***********");
        ListNode node = deleteDuplicates(n1);
        ListNode nodeAux = node;
        while (true) {
            System.out.println(nodeAux.val);
            nodeAux = nodeAux.next;
            if(node.equals(nodeAux)) {
                break;
            }
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode index = head;
        int a = 0;
        System.out.println("head: " + head);
        System.out.println("index: " + index);
        while (true) {
            System.out.println("Evaluating: head[" + index.val+"] next: [" + index.next.val+"]");
            if(index.val == index.next.val) {
                index = index.next.next;
                //index = index.next;
            } else {
                index = index.next;
            }
            System.out.println("head: " + head);
            System.out.println("index: " + index);
            if(head.equals(index) || a++ == 10) {
                break;
            }
        }
        return head;
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
