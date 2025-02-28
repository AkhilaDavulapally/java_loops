import java.util.Scanner;
class Sunny_num
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int point=0;
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		for (int i=1; i<=num;i++ )
		{
			if(i*i==(num+1))
			{
			  point++;
		    }
		}
		if(point!=0)
		{
		   System.out.println(num+ "is a sunny number");
		}
		else
		{
			System.out.println(num+ "not a sunny number");
		}
	}
	
}
 

