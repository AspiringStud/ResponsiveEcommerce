package threadjoin;


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
			System.out.println(count++ +"MyThread");
		}
	}
}

public class ThreadJoin {

	public static void main(String[] args) {
		MyThread t=new MyThread("Thread1");
		t.setDaemon(true);
		t.start();
		
		/*try {
			Thread.sleep(1000);
		}
		catch(Exception e){
			e.printStackTrace();
		}*/
		Thread mainThread =Thread.currentThread();
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
