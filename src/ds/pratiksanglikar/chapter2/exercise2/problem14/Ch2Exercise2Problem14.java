/**
 * 
 */
package ds.pratiksanglikar.chapter2.exercise2.problem14;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import ds.pratiksanglikar.chapter2.SortingUtilities;

/**<pre>
 * Chapter 2, Exercise 2, Problem 14
 * 
 * Merging sorted queues. 
 * Develop a static method that takes two queues of sorted items 
 * as arguments and returns a queue that results from merging the 
 * queues into sorted order.
 * 
 * @author Pratik Sanglikar
 * </pre>
 */
public class Ch2Exercise2Problem14 {
	
	@SuppressWarnings("rawtypes")
	private Queue<Comparable> sortedQueue = new LinkedBlockingQueue<Comparable>();
	
	/**
	 * merges the two sorted queues into one sorted queue. 
	 * @param queue1
	 * @param queue2
	 */
	@SuppressWarnings("rawtypes")
	public void mergeSortedQueues(Queue<Comparable> queue1, Queue<Comparable> queue2) {
		while(queue1.isEmpty() || queue2.isEmpty()) {
			Comparable item1 = queue1.peek();
			Comparable item2 = queue2.peek();
			if(SortingUtilities.isLesser(item1, item2)) {
				queue1.remove();
				sortedQueue.add(item1);
			} else {
				queue2.remove();
				sortedQueue.add(item1);
			}
		}
		while(!queue1.isEmpty()) {
			sortedQueue.add(queue1.remove());
		}
		while(!queue2.isEmpty()) {
			sortedQueue.add(queue2.remove());
		}
	}
}
