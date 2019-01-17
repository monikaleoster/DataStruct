/*package ch03.LinkedList;

public class MyLinkedList {
	
	  Linked list node 
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    
	int getMiddle(Node head) {
		Node curr = head;
		int size = 0;
		while (curr != null) {
			size++;
			curr = curr.next;
		}

		if (size != 0) {
			int index = (size / 2);
			curr = head;
			int refIndex = 0;
			while (curr != null) {
				if (refIndex == index)
					return curr.data;
				else
					curr = curr.next;
			}
		}
		return -1;

	}
	
	
		
}	}

}
*/