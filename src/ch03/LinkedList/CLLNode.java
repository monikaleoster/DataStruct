package ch03.LinkedList;

public class CLLNode {
	
	@Override
	public String toString() {
		return val+" ";
	}

	public CLLNode( int val) {
		super();
		this.val = val;
		this.next = this;
	}
	
	public CLLNode getNext() {
		return next;
	}
	public void setNext(CLLNode next) {
		this.next = next;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	CLLNode next;
	int val;

}
