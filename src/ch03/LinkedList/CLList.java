package ch03.LinkedList;

/**
 * @author Monika
 * This class implements the 
 * operation of Circular Linked List
 *
 */
public class CLList {
	
	protected CLLNode head;
	protected int length;
	
	CLList(){
		this.head = null;
		length = 0 ;
	}

	
	/**
	 * Inserts new node at End with provided value
	 * @param val
	 * @return
	 */
	public CLList insertAtEnd(int val) {
		CLLNode newTail = new CLLNode(val);
		CLLNode oldTail = getTail();
		newTail.next = head;
		if(oldTail == null) {
			head = newTail;
			newTail.next = newTail;
		}
		else
			oldTail.next = newTail;
		length++;
		return this;
	}
	
	
	/**
	 * Inserts at Front
	 * @param val
	 * @return
	 */
	public void insertAtFront(int val) {
		CLLNode newTail = new CLLNode(val);
		CLLNode oldTail = getTail();
		if(oldTail == null) {
			head = newTail;
			newTail.next = newTail;
		}
		else {
			oldTail.next = newTail;
			newTail.next = head;

		}
		head = newTail;
		length++;
		
	}
	
	/**
	 * Deletes the tail and assigns previous to tail node as tail
	 * @return
	 */
	public int deleteAtEnd() {
		int data = Integer.MIN_VALUE;

		
		if(!isEmpty())
		{
			CLLNode prevToTailnode = head.next;
			CLLNode tail = getTail();
			data = tail.val;
			while(prevToTailnode.next!=tail)
				prevToTailnode = prevToTailnode.next;
			
			prevToTailnode.next = head;
			tail.next = null;
			length--;
		}
		
		return data;

	}
	
	/**
	 * Deletes the head Node and assigns next node as head
	 * @return
	 */
	public int deleteAtFront() {
		int data = Integer.MIN_VALUE;
		
		if(!isEmpty())
		{
			data = head.val;
			CLLNode newHead = head.next;
			CLLNode tail = getTail();
			tail.next = newHead;
			head.next = null;
			head = newHead;
			length--;
		}
		
		if(isEmpty())
			head = null;
		
		
		return data;
	}
	
	
	
	@Override
	public String toString() {
		return "CLList [head=" + head + ", length=" + length + ", tail=" + getTail() + " ]";
	}


	public void printList() {
		
		System.out.println(this);
		if(!isEmpty()) {
		System.out.print(head+"->");
		CLLNode node = head.next;
		while(node!= head) {
			System.out.print(node+"->");
			node = node.next;
		}
		}
	}
	
	/**
	 * Returns last node of the list
	 * @return
	 */
	public CLLNode getTail() {
		if(isEmpty())
			return null;
		CLLNode node = head.next;
		while(node.next!= head)
			node = node.next;
		return node;
	}
	
	public boolean isEmpty() {
		if(length==0)
			return true;
		return false;
	}
	/**
	 * Returns the size of list
	 * @return
	 */
	public int size(){
		return length;
		
	}
	
	
	public static void main(String[] args) {
		CLList list = new CLList();
		list.insertAtEnd(5);
		list.insertAtFront(4);

		/*list.insertAtEnd(6);
		list.insertAtFront(4);*/
		//list.deleteAtEnd();
		list.printList();
		/*list.deleteAtFront();
		list.printList();*/
	}
}
