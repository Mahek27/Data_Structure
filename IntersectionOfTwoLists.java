import java.util.LinkedList;

/* Write a program to find the node at which the intersection of two singly linked lists begins.
 * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
 * Output: Reference of the node with value = 8
 * Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect). 
 * From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. 
 * There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
 * */
public class IntersectionOfTwoLists {
	  
	 public static class ListNode {
	        int data;
	        ListNode next;

	        ListNode(int x) {
	            data = x;
	            next = null;
	        }
	    }
	 
	 public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		 ListNode pa = headA, pb;
	        while (pa != null) {
	            for (pb = headB; pb != null; pb = pb.next) {
	                if (pa == pb) {
	                    return pa;
	                }
	            }
	            pa = pa.next;
	        }
	        return null;
	 }	 
	 public static void Print(ListNode n) { 
		 ListNode cur = n; 
	        while (cur != null) { 
	            System.out.print(cur.data + "  "); 
	            cur = cur.next; 
	        } 
	        System.out.println(); 
	 } 
	 
	 public static void main(String[] args) throws Exception {
		 ListNode n1 = new ListNode(1); 
	        n1.next = new ListNode(2); 
	        n1.next.next = new ListNode(3); 
	        n1.next.next.next = new ListNode(4); 
	        n1.next.next.next.next = new ListNode(5); 
	        n1.next.next.next.next.next = new ListNode(6); 
	        n1.next.next.next.next.next.next = new ListNode(7); 
	        // list 2 
	        ListNode n2 = new ListNode(10); 
	        n2.next = new ListNode(9); 
	        n2.next.next = new ListNode(8); 
	        n2.next.next.next = n1.next.next.next; 
	        Print(n1); 
	        Print(n2); 
	        System.out.println("Intersection at: " + getIntersectionNode(n1, n2).data); 
	 }
}
