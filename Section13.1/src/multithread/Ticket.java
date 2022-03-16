package multithread;

public class Ticket implements Runnable {
	private long amout = 1;

	@Override
	public void run() {
		muaVe();

	}

	public synchronized void muaVe() {
		amout -= 1;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(amout >= 0)
			System.out.println(Thread.currentThread().getName() + ": mua duoc ve");
		else 
			System.out.println(Thread.currentThread().getName() + ": ko mua duoc ve");
	}

}
