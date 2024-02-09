package threadtest;

class Test extends Thread{
	
	int i;
	public void run()
	{
		while(true)
		{
			System.out.println(i+" "+" Hello");
			i++;
		}
	}
}


public class ThreadTest {
 
	public static void main(String[] args) {
		Test t=new Test();
		t.start();
		int j=1;
		while(true) { System.out.println("World "+j);j++;}

	}

}
