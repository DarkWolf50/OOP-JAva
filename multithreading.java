
public class seta extends Thread {
	String message;
	int n;
	seta(String message ,int n){
		this.message=message;
		this.n=n;
		
	}
	public void run() {
		try {
			for(int i=0;i<n;i++) {
				System.out.println("" +message);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			System.out.println("" +e);
		}
	
	}

	public static void main(String[] args) {
		seta a1=new seta("COVID 19",2);
    a1.start();

	seta a2=new seta("Lockdown2020",4);
	a2.start();
	
	seta a3=new seta("Vaccinated2022",6);
	a3.start();
	
	}

}
