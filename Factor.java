import java.util.Scanner;
class Factor
{
	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in); 
	   System.out.println("Enter the character");
       char ch=sc.next().charAt(0);
	   int a=ch;
	   System.out.println(a);
	   if(500%a==0)
		{
		   System.out.println("It is a common factor");
		}
		else
		{
			
		   System.out.println("not common factor");
		}
	}
}
