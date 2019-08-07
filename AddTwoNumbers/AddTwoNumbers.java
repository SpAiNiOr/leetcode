/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.util.*;
import java.lang.*;
import ListNode.*;

public class AddTwoNumbers {
    public ListNode sumResult(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int sum = 0, carry = 0;
        while (p!=null || q!=null) {
            int x =(p!=null)?p.val:0;
            int y =(q!=null)?q.val:0;
            sum = x+y+carry;
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            System.out.println(sum);
            temp = temp.next;
            if (p.next != null){
                p = p.next;
            }
            if (q.next != null) q = q.next;
        }
        if(carry>0){
            temp.next = new ListNode(carry);
        }
        return result.next;
        
    }

    public AddTwoNumbers(){

    }

    public static void main(String[] args) {

        // insert 2 linked list
       ListNode l1node1 = new ListNode(1);
       ListNode l1node2 = new ListNode(9);
       ListNode l1node3 = new ListNode(9);

       l1node1.next = l1node2;
       l1node2.next = l1node3;
       l1node3.next = null;



       ListNode l2node1 = new ListNode(9);

       l2node1.next = null;

       AddTwoNumbers output = new AddTwoNumbers();
       output.sumResult(l1node1, l2node1);
    
    }
} 