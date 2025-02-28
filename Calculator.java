import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		System.out.println("Enter the operator");
		char symbol=sc.next().charAt(0);
        operation(num1,num2,symbol);
	}
	public static void operation(int num1,int num2,char symbol)
	{
        switch(symbol)
		{
			case '+':
			{
				System.out.println("The sum of num1:"+(num1)+"sum of num2:"+(num2)+"is:"+add(num1,num2));
			}break;
			case '-':
			{
				System.out.println("The sub of num1:"+(num1)+"sub of num2:"+(num2)+"is:"+sub(num1,num2));
			}break;
			case '*':
			{
				System.out.println("The multi of num1:"+(num1)+"multi of num2:"+(num2)+"is:"+multi(num1,num2));
			}break;
			case '/':
			{
				System.out.println("The div of num1:"+(num1)+"div of num2:"+(num2)+"is:"+div(num1,num2));
			}break;
			case '%':
			{
				System.out.println("The rem of num1:"+(num1)+"rem of num2:"+(num2)+"is:"+rem(num1,num2));
			}break;
			default:
			{
				System.out.println("please enter the valid symbol");
			}
		}


	}
	public static int add(int a,int b)
	
	{
		int sum=a+b;
		return sum;
	}
	public static int sub(int a,int b)
	
	{
		int sub=a-b;
		return sub;
	}
	public static int multi(int a,int b)
	
	{
		int multi=a*b;
		return multi;
	}
    public static int div(int a,int b)
	
	{
		int div=a/b;
		return div;
	}
	public static int rem(int a,int b)
	
	{
		int rem=a%b;
		return rem;
	}
}



