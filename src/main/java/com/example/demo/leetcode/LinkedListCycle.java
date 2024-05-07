package com.example.demo.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode node = new ListNode(3);
        //node.next = new ListNode(2, new ListNode(0, new ListNode(-4, node)));
        System.out.println(hasCycle(node));
    }

    public static boolean hasCycle(ListNode head) {
        if(null == head || head.next == null) {
            return false;
        }
        Set<String> set = new HashSet<>();
        set.add(head.toString());
        while(head.next != null) {
            head = head.next;
            if(null != head && ! set.contains(head.toString())) {
                set.add(head.toString());
            } else {
                return true;
            }
        }
        return false;
    }

}
