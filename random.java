/*
 * Write a program to calculate the sum and average of an array of 1000 integers (generated randomly)
 *  using 10 threads. Each thread calculates the sum of 100 integers. Use these 
 * values to calculate average. [Use join method ].. 
 */

class sumthread1 extends Thread
{
	private int x[];
	private int start,end,sum;
	public sumthread1(int a[],int i,int j)
	{
		x=a;
		start=i;
		end=j;
	}
	public void run()
	{
		for(int i=start;i<=end;i++)
		{
			sum = sum+x[i];
			try
			{
				Thread.sleep((int)(Math.random()*2000));
			}catch(Exception e)
			{
				System.out.println("Error:"+e);
			}
		}
	}
	public int getsum()
	{
		return sum;
	}
}
public class slip7_1
{
	public static void main(String[] args)
	{
		int nos[]=new int[1000];
		for(int i=0;i<1000;i++)
			nos[i]=(int)(Math.random()*1000);
			sumthread t[] = new sumthread[10];
			for(int i=0;i<10;i++)
			{
				t[i] = new sumthread(nos,i*1000,(i+1)*100);
				t[i].start();
			}
			for(int i=0;i<10;i++)
			{
				try
				{
					t[i].join();
				}catch(Exception e)
				{
					System.out.println("Error:"+e);
				}
			}
			float avg=0;
			for(int i=0;i<5;i++)
				avg = avg+t[i].getsum();
				System.out.println("sum="+avg+"\navg:"+(avg/2));
	}
}
