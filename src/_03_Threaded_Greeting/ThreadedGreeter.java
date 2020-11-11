package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {

	int var;

	public ThreadedGreeter(int a) {
		var = a;
	}



	@Override
	public void run() {

		Thread thread = new Thread(() -> {

			System.out.println("Hello from thread " + var);
			if (var < 50) {
				Thread newThread = new Thread(new ThreadedGreeter(var + 1));
				newThread.start();
			}
		});

		thread.start();
	}

}
