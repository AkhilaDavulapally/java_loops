import java.util.Scanner;
class Prime_factor
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
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
		
		for(int j=1;j<=num;j++)
		{
			if(num%j==0)
			{
				System.out.println(j);
			}
			if(j%2==0)
			{
				System.out.println("even number");
			}
			else
			{
				System.out.println("odd number");
			}
		
		}
		
		
	}
}