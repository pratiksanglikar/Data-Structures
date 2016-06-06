/**
 * 
 */
package ds.pratiksanglikar.chapter1;

/**
 * FIFO Queue using LinkedList.
 * 		Operations Supported -
 *  		enqueue(Item item) : void
 *  		dequeue() : Item item
 * @author Pratik Sanglikar
 */
public class FIFOQueueLL<Item> {
	
	private Node first; // first Node of the LinkedList.
	private Node last; // last Node of the LinkedList.
	private int size;  // size of the LinkedList.
	
	/**
	 * Initialize the FIFOQueue using default values.
	 */
	public FIFOQueueLL() {
		this.first = null; 
		this.last = null; 
		this.size = 0;
	}
	
	/**
	 * Private class Node representing a Node in a LinkedList.
	 * @author Pratik Sanglikar
	 */
	private class Node {
		Item item; // Data item in the Node.
		Node next; // Pointer to next Node in the LinkedList.
		
		/**
		 * Initialize the Node with provided data item value.
		 */
		Node(Item item) {
			this.item = item;
		}
	}
	
	/**
	 * Enqueue a new item in the queue.
	 * @param item to be enqueued.
	 */
	public void enqueue(Item item) {
		Node oldLast = last;
		last = new Node(item);
		if(isEmpty()) {
			first = last;
		} else {
			oldLast.next = last;
		}
		this.size++;
	}
	
	/**
	 * Dequeue an item from the queue.
	 * @return dequeued item.
	 */
	public Item dequeue() {
		if(isEmpty()) {
			return null;
		}
		Node oldFirst = first;
		Item dequeuedItem = oldFirst.item;
		first = oldFirst.next;
		if(isEmpty()) {
			first = last = null;
		}
		this.size--;
		return dequeuedItem;
	}
	
	/**
	 * returns if the queue is empty.
	 * @return 	'true' if the queue is empty
	 * 			'false' if the queue is not empty.
	 */
	public boolean isEmpty() {
		return first == null;
	}
}