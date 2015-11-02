package learning.day9.threading;

import org.junit.Test;

public class MyThreadTest {

	// TODO: Same Implementation with extends Thread
	@Test
	public void testRun() throws InterruptedException {
		MyThread r1 = new MyThread();
	    Thread t1 = new Thread(r1);
	    t1.setName("Nitin");
	    Thread t2 = new Thread(r1);
	    t2.setName("Naveen");
	    t2.setPriority(10);
	    t1.start();
	    t2.start();
	    t1.join();
	}

}
