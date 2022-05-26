/*Write a java program which thread sleep for 6 sec in the loop in reverse order  
 * from 100 to 1 and change the name of thread
  
  */
 
public class thread10 extends Thread {
	public void run() {
		try {
			for(int i=100;i>=1;i--) {
				System.out.println(""+i);
				Thread.sleep(6000);
			}
		}
		catch(Exception e) {
			System.out.println("Error" +e);
		}
	}
	

	public static void main(String[] args) {
		thread10 th10=new thread10();
		Thread t1=new Thread(th10);
		System.out.println("Thread name" +t1.getName());
		t1.setName("ABC");
		System.out.println("Changed thread name"+t1.getName());
		t1.start();


	}

}
