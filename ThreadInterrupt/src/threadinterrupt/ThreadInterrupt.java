package threadinterrupt;

class MyThread extends Thread{
	
	MyThread(String name)
	{
		super(name);
	}
	public void run()
	{
		int count=1;
		while(true)
		{
			System.out.println(count++);
			try {
				Thread.sleep(100);
				}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}

public class ThreadInterrupt {

	public static void main(String[] args) {
		MyThread t=new MyThread("My thread 1");
		t.start();
		t.interrupt();

	}

}
