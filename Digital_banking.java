import java.util.Scanner;
class Digital_banking 
{

	String username="akhila";
	String pin="1234";
	double balance=10000.0;
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the usename");
		String uname=sc.next();
		System.out.println("Enter the pin");
		String upin=sc.next();
		System.out.println("enter the withdraw amount");
		double wd=sc.nextDouble();
		System.out.println("enter the deposite amount");
		double da=sc.nextDouble();
		check(uname,upin,wd,da);
    }
	public static void check(String uname,String upin,double wd,double da)
	{
		Scanner sc=new Scanner(System.in);
		Digital_banking d=new Digital_banking();
		if(upin.equals(d.pin) && uname.equals(d.username))
		{
			System.out.println("select the options from 1 to 3");
			System.out.println("1.Withdraw amount");
			System.out.println("2.Deposite account");
			System.out.println("3.check balance");
			int option=sc.nextInt();
			switch(option)
			{
				case 1:
				     {
					  withdraw(wd);
					 }
					 break;
				case 2:
				    {
					 deposite(da);
					}
					break;
				case 3:
				   {
					 System.out.println(d.balance);
				   }
				   break;
					
			}
		}
		else
		{
			System.out.println("Invalid credentials");
		}
	}
			
public static void withdraw(double wd)
 {
	Digital_banking d=new Digital_banking();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the money to withdraw:");
    int withdraw=sc.nextInt();
    if(d.balance>=withdraw)
	 {
	    d.balance=d.balance-withdraw;
		System.out.println("please collect your money");
		System.out.println(d.balance);
	 }
	 else
	 {
	  System.out.println("Insufficient balance");
	 }
	
 }
public static void deposite(double da)
  { 
    Digital_banking d=new Digital_banking();	
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the money to be deposited:");
    int deposite=sc.nextInt();
	d.balance=d.balance+deposite;
    System.out.println("money has been successfully deposited");
	System.out.println(d.balance);
  }
	

}
		   




	
