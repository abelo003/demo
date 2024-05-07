package com.example.demo.practice;

public class NodeSolution {

    public static void main(String[] args) {
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
        ListNode aux = n1.next;
        for(;;){
            if(null == aux.next) {
                aux.next = n1;
                break;
            }
            aux = aux.next;
        }
        ListNode node = rotateRight(n1, 2);
        for (int i = 0; i < 5; i++) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();


    }

    public static ListNode rotateRight(ListNode head, int k) {
        ListNode current = head;
        for (int i = 0; i <= k; i++) {
            current = current.next;
        }
        System.out.println(current.val);
        return current;
    }

}
