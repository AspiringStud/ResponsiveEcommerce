package threadyield;

class MyThread extends Thread{
	public MyThread(String name)
	{
		super(name);
	}
	public void run()
	{
		int count=1;
		while(true)
		{
			System.out.println(count++ +" Mythread");
		}
	}
}

public class ThreadYield {

	public static void main(String[] args) {
		MyThread t=new MyThread("Thread 1");
		t.start();
		int count=1;
		while(true)
		{
			System.out.println(count++ +"Main");
			Thread.yield();
		}
	}

}
