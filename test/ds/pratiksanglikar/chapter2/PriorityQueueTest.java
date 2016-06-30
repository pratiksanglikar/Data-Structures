/**
 * 
 */
package ds.pratiksanglikar.chapter2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Pratik Sanglikar
 *
 */
public class PriorityQueueTest {

	private PriorityQueue<Integer> priorityQueue = null;

	@Before
	public void initialize() {
		priorityQueue = new PriorityQueue<>(25);
		priorityQueue.insert(1);
		priorityQueue.insert(5);
		priorityQueue.insert(7);
		priorityQueue.insert(7);
		priorityQueue.insert(8);
		priorityQueue.insert(9);
		priorityQueue.insert(16);
		priorityQueue.insert(15);
		priorityQueue.insert(18);
		priorityQueue.insert(19);
		priorityQueue.insert(20);
	}

	@Test
	public void insertTest() {
		int elementToInsert = 25;
		int size = priorityQueue.getSize();
		priorityQueue.insert(elementToInsert);
		assertEquals("Inserted element and deleted element should be same", elementToInsert,
				priorityQueue.deleteMaxItem().intValue());
		assertEquals(size + 1, priorityQueue.getSize());
	}

	@Test
	public void deleteTest() {
		int deletedElement = priorityQueue.deleteMaxItem().intValue();
		assertEquals("Deleted element should be equal to already present max value", 20, deletedElement);
	}
}