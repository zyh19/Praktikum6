package de.zhang;
import org.junit.Test;


import static org.junit.Assert.*;

public class QueueTest
{
	@Test (expected=IllegalArgumentException.class)
	public void testBoundary()
	{
		new Queue(0);
	}
	@Test (expected=IllegalStateException.class)
	public void testDequeueEmpty()
	{
		Queue tmp = new Queue(1);
		tmp.dequeue();
	}
	
	@Test
	public void testEnqueueLastEntry()
	{
		Queue tmp = new Queue(3);
		tmp.enqueue(65);
		tmp.enqueue(66);
		tmp.enqueue(67);
		tmp.enqueue(68);
		assertEquals(68, tmp.queue[2]);
	}
}