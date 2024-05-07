package com.example.demo.leetcode;

import java.util.List;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4, new ListNode(3));

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6, new ListNode(4));

        //9,9,9,9,9,9,9
  /*      ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))));

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9, new ListNode(9, new ListNode(9)));
*/

        int l1Size = getListNodeSize(l1);
        int l2Size = getListNodeSize(l2);
        System.out.println("L1 size: " + getListNodeSize(l1));
        System.out.println("L2 size: " + getListNodeSize(l2));

        ListNode result = null;
        ListNode fisrtNode = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry + ((null != l1) ? l1.val: 0) + ((null != l2) ? l2.val: 0);
            if(sum > 9) {
                carry = sum / 10;
                sum = sum % 10;
            } else {
                carry = 0;
            }
            if(result == null) {
                result = new ListNode(sum);
                fisrtNode = result;
            } else {
                result.next = new ListNode(sum);
                result = result.next;
            }
            //New assignation
            if(null != l1) {
                l1 = l1.next;
            }
            if(null != l2) {
                l2 = l2.next;
            }
        }
        if(carry != 0) {
            result.next = new ListNode(carry);
        }
        while (fisrtNode != null) {
            System.out.print(fisrtNode.val + " ");
            fisrtNode = fisrtNode.next;
        }
    }

    private static int getListNodeSize(ListNode node) {
        int size = 1;
        while (node.next != null) {
            node = node.next;
            size ++;
        }
        return size;
    }

}
