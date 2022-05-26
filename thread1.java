/*program to define a thread printing text on output screen for n number of times .
 * create 3 thread and run them,pass the text n parameter to the thread constructor 
 * ex.First thread printd COVID19 10 times 
 * second thread printd LOCKDOWN 20 times.
 * third thread print VACCINATED2021 30 times
 * 
 */
public class thread extends Thread{
	String message;
	int n;
	thread(String message,int n){
		this.message=message;
		this.n=n;
		
	}
	public void run() {
		try {
			for(int i=0;i<n;i++) {
				System.out.println(" "+message);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			System.out.println("" +e);
		}
	}
	public static void main(String[] args) {
	thread t1=new thread("COVID19",10);
	t1.start();
	
	thread t2=new thread("LOCKDOWN2020",20);
	t2.start();
	
	thread t3=new thread("VACCINATED",30);
	t3.start();

	}

}
