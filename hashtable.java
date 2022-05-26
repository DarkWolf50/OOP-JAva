/*create a hash table that will maintain the mobile number and student name.

  display the contact list
 */
 import java.util.*;
public class hashtable {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Hashtable ht=new Hashtable();
System.out.println("Enter limit:");
int n=sc.nextInt();
System.out.println("Enter mobile number and name:");
for(int i=0;i<n;i++) {
	long mob=sc.nextLong();
	String name=sc.next();
	ht.put(mob, name);
}
System.out.println("Contact List:" +ht);
		

	}

}