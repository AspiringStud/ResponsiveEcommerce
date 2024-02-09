package threadstest;

class MyThread extends Thread
{
	
	public MyThread(String name)
	{
		super(name);
		setPriority(Thread.MIN_PRIORITY+2);
	}

}

public class ThreadsTest {

	public static void main(String[] args) {
    MyThread t=new MyThread("Thread 1")	;
    System.out.println("ID :"+ t.getId());
    System.out.println("NAME :"+ t.getName());
    System.out.println("PRIORITY :"+t.getPriority());
    System.out.println("STATE :"+t.getState());
    t.start();
    System.out.println("STATE after calling start method :"+t.getState());
	}

}
