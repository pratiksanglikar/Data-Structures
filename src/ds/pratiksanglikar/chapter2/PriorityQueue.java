/**
 * 
 */
package ds.pratiksanglikar.chapter2;

/**
 * Priority Queue implementation.
 * 
 * @author Pratik Sanglikar
 *
 */
public class PriorityQueue<Key extends Comparable<Key>> {

	private Key[] priorityQueue;
	private int size = 0;

	/**
	 * Initialize the priority queue of maxSize;
	 * @param maxSize initial size of the queue.
	 */
	@SuppressWarnings("unchecked")
	public PriorityQueue(int maxSize) {
		priorityQueue = (Key[]) new Comparable[maxSize + 1];
	}

	/**
	 * returns if the priority queue is empty.
	 * @return	'true' if the priority queue is empty.
	 * 			'false' otherwise
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * returns the size of the priority queue. 
	 * 
	 * @return size of the priorityQueue.
	 */
	public int getSize() {
		return size;
	}

	/**
	 * inserts a new item in the priority queue.
	 * 
	 * @param newItem
	 */
	public void insert(Key newItem) {
		priorityQueue[++size] = newItem;
		swim(size);
	}

	/**
	 * deletes the maximum element from the priority queue.
	 * 
	 * @return the deleted item from priority queue.
	 */
	public Key deleteMaxItem() {
		Key max = priorityQueue[1];
		priorityQueue[size + 1] = null;
		sink(1);
		return max;
	}

	/**
	 * sinks the item to the bottom of priority queue.
	 * Required for the operations where the priority of the 
	 * required item is less than the it's children's priorities.
	 * 
	 * @param index of the item to be sinked.
	 */
	private void sink(int index) {
		while (2 * index <= size) {
			int j = 2 * index;
			if (j < size && SortingUtilities.isLesser(j, j + 1)) {
				j++;
			}
			if (!SortingUtilities.isLesser(index, j)) {
				break;
			}
			SortingUtilities.exchange(priorityQueue, index, j);
			index = j;
		}
	}

	/**
	 * swims the item to the top of the priority queue.
	 * Required when the priority of the item is higher than
	 * it's parent.
	 * 
	 * Required when we add new item.
	 *  
	 * @param index of the item to be swimmed up.
	 */
	private void swim(int index) {
		while (index > 1 && SortingUtilities.isLesser(index / 2, index)) {
			SortingUtilities.exchange(priorityQueue, index / 2, index);
			index = index / 2;
		}
	}

}
