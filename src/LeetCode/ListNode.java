package LeetCode;

import java.util.LinkedList;
import java.util.function.Predicate;

public class ListNode {
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void main(String[] args) {
         ListNode num = new ListNode(1);
          ListNode num3 = new ListNode(2, num);
          ListNode num4 = new ListNode(3);
        ListNode num5 = new ListNode(3);

if(num.next.val == 1) {
    System.out.println(num.next.val);
}

//        LinkedList <Integer> num  = new LinkedList<>();
//        num.add(1);
//        num.add(1);
//        num.add(2);
//        num.add(3);
//        num.add(3);

    }
    public static ListNode deleteDuplicates(ListNode head) {
          ListNode number = head;
          while(number.next != null){
              if(number.next.val != number.val){
                  number.next = number.next.next;}
          number = number.next;}

   return head; }
//    ListNode temp = head;
//    while (temp != null) {
//        while(temp.next != null && temp.next.val == temp.val) {
//            temp.next = temp.next.next;
//        }
//        temp = temp.next;
//    }
//    return head;
}
