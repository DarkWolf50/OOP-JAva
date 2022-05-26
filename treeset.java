/*
1. Accept ‘n’ integers from the user. 


Store and display integers in sorted order having proper collection class.
The collection should not accept duplicate elements.
*/

import java.util.*;
public class treeset {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer> ts=new TreeSet<Integer>();
		System.out.println("Enter number of Elements:");
		int no=sc.nextInt();
		for(int i=0;i<no;i++) {
			System.out.println("Enter number:");
			int element=sc.nextInt();
			ts.add(element);
		}
		System.out.println(""+ts);
	}

}