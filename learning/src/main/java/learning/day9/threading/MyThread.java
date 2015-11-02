package learning.day9.threading;

// extends Thread
public class MyThread implements Runnable {

	
	@Override
	public void run() {
		for(int i=0; i <  100; i++ ){
			System.out.println(Thread.currentThread().getName()+ " :-> " +i);
			if(i==10){
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
