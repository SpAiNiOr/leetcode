/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.util.*;
import java.lang.System;
import ListNode.*;

public class AddTwoNumbers {
    
    public int getSize(ListNode x){
        int size =0;
        ListNode current = x;
        //ListNode previous = null;
        while (current != null){
            size +=1;
            //previous = current;
            current = current.next;
        }
        return size;
    }
    
    public int getNum(ListNode x, int size){
        int sum = 0;
        for(int i=0;i<size;i++){
            sum += x.val* Math.pow(10,size-i-1);
            x =x.next;
        }
        return sum;
        
    }

    public AddTwoNumbers(){

    }
    
    public ListNode sumResult(ListNode l1, ListNode l2) {
        int size1=getSize(l1);        
        int size2=getSize(l2);
        
        int A = getNum(l1, size1);
        int B = getNum(l2, size2);
       
        
        /*
        for (Iterator iter=l1.iterator();iter.hasNext();){
            A += iter.next();
        }
        for (Iterator iter=l2.iterator();iter.hasNext();){
            B += iter.next();
        }
        ListNode result;
        */
        
        int sum = A+B;
        ListNode result = new ListNode(sum%10);
        sum = sum/10; 
        ListNode temp = result;
        while(sum/10 >= 0 && sum >0){
            temp.next = new ListNode(sum%10);
            sum = sum/10;
            temp = temp.next;
        }
        return result;
        
    }
    public static void main(String[] args) {

         // insert 2 linked list
        ListNode l1node1 = new ListNode(2);
        ListNode l1node2 = new ListNode(4);
        ListNode l1node3 = new ListNode(3);

        l1node1.next = l1node2;
        l1node2.next = l1node3;
        l1node3.next = null;



        ListNode l2node1 = new ListNode(5);
        ListNode l2node2 = new ListNode(6);
        ListNode l2node3 = new ListNode(4);

        l2node1.next = l2node2;
        l2node2.next = l2node3;
        l2node3.next = null;


        AddTwoNumbers output = new AddTwoNumbers();
        output.sumResult(l1node1, l2node1);
    }

}