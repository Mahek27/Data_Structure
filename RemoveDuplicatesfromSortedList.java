
public class RemoveDuplicatesfromSortedList {
	static Node head;  // head of list 
	   
    /* Linked list Node*/
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) {data = d; next = null; } 
    } 
    
	public static void main(String[] args) {
		RemoveDuplicatesfromSortedList llist = new RemoveDuplicatesfromSortedList(); 
        llist.push(20); 
        llist.push(13); 
        llist.push(13); 
        llist.push(11); 
        llist.push(11); 
        llist.push(11); 
          
        System.out.println("List before removal of duplicates"); 
        llist.printList(); 
          
        llist.deleteDuplicates(head); 
          
        System.out.println("List after removal of elements"); 
        llist.printList(); 
	}
	/* Function to print linked list */
    void printList() 
    { 
        Node temp = head; 
        while (temp != null) 
        { 
           System.out.print(temp.data+" "); 
           temp = temp.next; 
        }   
        System.out.println(); 
    } 
    /* Inserts a new Node at front of the list. */
    public void push(int new_data) 
    { 
        /* 1 & 2: Allocate the Node & 
                  Put in the data*/
        Node new_node = new Node(new_data); 
   
        /* 3. Make next of new Node as head */
        new_node.next = head; 
   
        /* 4. Move the head to point to new Node */
        head = new_node; 
    } 

	public static Node deleteDuplicates(Node head) {
		Node current = head;
        while (current != null && current.next != null) {
            if (current.next.data == current.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
