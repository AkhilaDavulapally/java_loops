import java.util.Scanner;
class Greatestnum
{
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
        int a=sc.nextInt();
		int b=sc.nextInt();
        int c=sc.nextInt();
        if((a>b)&&(a>c))
	     {
			System.out.println(a+"the Number is greater");
	     }
		 else if(b>c)       
	     {
			 System.out.println(b+"the number is greater");
	     }
       	else
	     {
         	 System.out.println(c+"the number is greater");
         }
    }	    
}
	

