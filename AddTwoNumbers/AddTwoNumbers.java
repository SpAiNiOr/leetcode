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

public class addTwoNumbers {
    
    public int getSize(ListNode x){
        int size =0;
        ListNode current = x;
        ListNode previous = null;
        while (current != null){
            size +=1;
            previous = current;
            current = current.next;
        }
        return size;
    }
    
    public int getNum(ListNode x, int size){
        int sum = 0;
        for(int i=0;i<size;i++){
            sum += x.val* Math.pow(10,size-i);
            x =x.next;
        }
        return sum;
        
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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
        ListNode result = new ListNode(0);
        while(sum%10 >= 0){
            result.val = sum%10;
            sum = sum/10;
            
        }
        return result;
        
    }
    public static void main(String[] args) {
        
        AddTwoNumbers output = new addTwoNumbers();
    }
}