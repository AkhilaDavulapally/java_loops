import java.util.Scanner;
class Prime_num 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch=sc.next().charAt(0);
		int num=ch;
		System.out.println(num);
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(num+ "is prime");
		}
		else
		{
			System.out.println(num+"is not prime");
		}
	
	}
}
