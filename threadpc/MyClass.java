//public class MyClass extends Thread {
public class MyClass implements Runnable{
	public void run() {
		for (int i = 0; i < 11; i++) {
			System.out.println(Thread.currentThread().getId()+"value:" + i);
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

class Demo {

	public static void main(String args[]) {

		Thread t1= new Thread(new MyClass());
		Thread t2= new Thread(new MyClass());
		t1.start();
		t2.start();
		/*MyClass myClass= new MyClass();
		myClass.start();
		MyClass myClass1= new MyClass();
		myClass1.start();*/
	}
}
