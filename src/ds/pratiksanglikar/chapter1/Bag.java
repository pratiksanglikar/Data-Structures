/**
 * 
 */
package ds.pratiksanglikar.chapter1;

import java.util.Iterator;

/**
 * This class represents the Bag data structure.
 * This data structure stores the items.
 * Order of iterating is not important. 
 * 		Supported Operations - 
 * 			add(Item item) : void
 * @author Pratik Sanglikar
 */
public class Bag<Item> implements Iterable<Item> {

	private Node first; // head of the LinkedList.
	private int size; // size of the LinkedList.
	
	/**
	 * Initialize the Bag with empty items.
	 */
	public Bag() {
		first = null;
		size = 0;
	}
	
	/**
	 * private class Node representing a Node of the LinkedList.
	 * @author Pratik Sanglikar
	 */
	private class Node {
		Item data; // data to be stored in the Node.
		Node next; // Pointer to the next node in the LinkedList.
		
		/**
		 * Initialize the Node with default values.
		 * @param data
		 */
		Node(Item data) {
			this.data = data;
			this.next = null;
		}
	}
	
	/**
	 * add an item to the Bag.
	 * @param item to be added to the Bag.
	 */
	public void add(Item item) {
		Node oldFirst = first;
		first = new Node(item);
		first.next = oldFirst;
		this.size++;
	}
	
	/**
	 * returns whether the Bag is empty or not.
	 * @return	'true' if the Bag is empty.
	 * 			'false' if the Bag is not empty.
	 */
	public boolean isEmpty() {
		return first == null;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<Item> iterator() {
		return new BagIterator();
	}
	
	/**
	 * Iterator class for iterating items in the Bag.
	 * @author Pratik Sanglikar
	 */
	private class BagIterator implements Iterator<Item> {
		private Node current; // Reference to the current item in the Bag.
		
		/**
		 * initialize the iterator with default values.
		 */
		public BagIterator() {
			current = first;
		}
		
		/* (non-Javadoc)
		 * @see java.util.Iterator#hasNext()
		 */
		@Override
		public boolean hasNext() {
			return current == null;
		}

		/* (non-Javadoc)
		 * @see java.util.Iterator#next()
		 */
		@Override
		public Item next() {
			Item data = current.data;
			current = current.next;
			return data;
		}

		/* (non-Javadoc)
		 * @see java.util.Iterator#remove()
		 */
		@Override
		public void remove() {
			throw new UnsupportedOperationException("The operation remove() is not supported on data structure Bag.");
		}
	}
}
