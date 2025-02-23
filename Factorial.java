import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int product=1;
		for (int i=num; i>=1;i-- )
		{
			product=product*i;
		}
		System.out.println(product);
	}
}
