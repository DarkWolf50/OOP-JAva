/*
 Define a class saving account (acno, name, balance) .

define appropriate and operation withdraw(), deposit(), and viewbalance(). 
The minimum balance must be 500. Create an object and perform operation. 
Raise user defined “InsufficientFundException” when balance is not sufficient for
withdraw operation.
*/

 //import java.io.*;
import java.util.Scanner;
class InsufficientFundsException extends Exception
{
}


class SavingAccount
{
int ano;
String name;
float bal;
  
Scanner sc=new Scanner(System.in);
SavingAccount(int a,String nm,float b)
{
    ano=a;
    name=nm;
    bal=b;
}

void withdraw() throws Exception
{
    System.out.println("Enter amount to be withdraw ");
    float amt=sc.nextFloat();
    try
    {
                    if(amt>bal || bal<500 )
                                    throw new InsufficientFundsException();
                    else
                    {
                                    bal=bal-amt;
                                    System.out.println("Withdarawl amt successfully ....");
                    }
    }
    catch(InsufficientFundsException ob)
    {
                    System.out.println(" "+ob);
    }
}
          
   void deposit() throws Exception
      {
       System.out.println("Enter amount to be Deposite:");
             
         float amt=sc.nextFloat();
          bal=bal+amt;
         System.out.println("Deposit amt successfully ....");
 }
     void viewBalance()
    {
        System.out.println("Balance "+bal);
   }
}

class Slip5
{
    public static void main(String ar[]) throws Exception
    {
           
        Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Account no:");
                      
                        int a=sc.nextInt();
    	System.out.println("Enter Name:");
                      
    	         String  nm=sc.next();
        System.out.println("Enter Balance:");
                      
        				float b=sc.nextFloat();
        SavingAccount sa = new SavingAccount(a,nm,b);
   do
  {
   System.out.println(" \n 1.Deposit \n 2.Withdraw \n 3.Check Balance \n 4.Exit ");
       System.out.println("Enter your choice :");
                                       
            
     int ch=sc.nextInt();
       switch(ch)
        {
             case 1 : sa.deposit();
                      break;
              case 2: sa.withdraw();
                      break;
              case 3 : sa.viewBalance();
                       break;
              case 0 : System.exit(1);
                                                       
    }
        }while(true);           
    }
}