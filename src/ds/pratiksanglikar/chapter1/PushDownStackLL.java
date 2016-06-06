package ds.pratiksanglikar.chapter1;

/**
 * This class represents standard PushDownStack. This stack is implemented using
 * LinkedList.
 * Operations supported:
 * 		push(Item item) : void
 * 		pop() : Item item
 *  
 * @author Pratik Sanglikar
 *
 * @param <Item>
 */
public class PushDownStackLL<Item> {
	private Node first; // head of the LinkedList.
	private int size; // Size of the LinkedList.
	
	/**
	 * Private class representing <i>Node</i> in the LinkedList.
	 * @author Pratik Sanglikar
	 */
	private class Node {
		private Item item; // Data item in the LinkedList.
		private Node next; // Pointer to the next node in the LinkedList.
		
		/**
		 * Initializes the new Node with item.
		 * @param item to be assigned to the new Node.
		 */
		Node(Item item) {
			this.item = item;
		}
	}
	
	/**
	 * Initializes the LinkedList with default values.
	 */
	public PushDownStackLL(){
		this.first = null;
		this.size = 0;
	}
	
	/**
	 * Push a new item in the Stack.
	 * @param item to be pushed in the Stack.
	 */
	public void push(Item item) {
		Node oldFirst = this.first;
		this.first = new Node(item);
		this.first.next = oldFirst;
		this.size++;
	}
	
	/**
	 * Pops the top of the stack from the Stack.
	 * @return item popped from the stack.
	 */
	public Item pop() {
		if(isEmpty()) {
			return null;
		}
		Node poppedItem = this.first;
		this.first = this.first.next;
		this.size--;
		return poppedItem.item;
	}
	
	/**
	 * Returns if the Stack is empty or not.
	 * @return 	true if the stack is empty
	 * 			false if the stack is not empty.
	 */
	public boolean isEmpty() {
		return this.first == null;
	}
}
